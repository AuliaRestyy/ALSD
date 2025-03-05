public class TripMain {
    public static void main(String[] args) {
        Trip[] tripObject = new Trip[5];

        tripObject[0] = new Trip("Italy", 25, 2000000);
        tripObject[1] = new Trip("Spain", 15, 8000000);
        tripObject[2] = new Trip("Qatar", 30, 5000000);
        tripObject[3] = new Trip("London", 10, 9000000);
        tripObject[4] = new Trip("Paris", 25, 4000000);

        System.out.println("All Trips Data");
        for (int i = 0; i < tripObject.length; i++) {
            System.out.println("Trip " + (i+1));
            tripObject[i].printData();
            System.out.println();
        }

        long finalEarnings = 0;
        for (Trip trips : tripObject) {
            finalEarnings += trips.totalEarning();
        }
        System.out.println("Total earnings from all trips : " + finalEarnings);

        int goodTrips = 0;
        for (Trip trips : tripObject) {
            if (trips.numTravelers > 20) {
                goodTrips++;
            }
        }
        double percentage = (double) goodTrips / tripObject.length * 100;
        System.out.println("The percentage trips that have more than 20 travelers is : " + percentage + "%");
    }
}
