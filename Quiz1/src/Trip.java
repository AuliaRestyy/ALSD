public class Trip {
    String destination;
    int numTravelers;
    double ticketPrices;

    public Trip (String d, int n, double t){
        destination = d;
        numTravelers = n;
        ticketPrices = t;
    }

    double totalEarning(){
        return numTravelers * ticketPrices;
    }

    void printData(){
        System.out.println("Destination : " + destination);
        System.out.println("Total Travelers : " + numTravelers + " person");
        System.out.println("Ticket Price : Rp." + ticketPrices);
    }
}
