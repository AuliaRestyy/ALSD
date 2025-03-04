public class LectureData4 {
    public void showAllLecturerData(Lecturer4[] lecturerArray){
        System.out.println("All Lecturer Data: ");
        for (Lecturer4 lecturer : lecturerArray) {
            lecturer.print();
            System.out.println();
        }
    }

    public void countLecturerByGender(Lecturer4[] lecturerArray){
        int male = 0;
        int female = 0;

        for (Lecturer4 lecturer : lecturerArray) {
            if (lecturer.getGender().equalsIgnoreCase("male")) {
                male++;
            } else {
                female++;
            }
        }

        System.out.println("Male lecturers : " + male);
        System.out.println("Female lecturers : " + female);
    }

    public void averageLecturerAgeByGender(Lecturer4[] lecturerArray) {
        int maleAgeSum = 0;
        int femaleAgeSum = 0;
        int malecount = 0;
        int femaleCount = 0;

        for (Lecturer4 lecturer : lecturerArray) {
            if (lecturer.getGender().equalsIgnoreCase("male")) {
                maleAgeSum += lecturer.age;
                malecount++;
            } else {
                femaleAgeSum += lecturer.age;
                femaleCount++;
            }
        }

        double maleAverage = malecount == 0 ? 0 : (double) maleAgeSum / malecount;
        double femaleAverage = femaleCount == 0 ? 0 : (double) femaleAgeSum / femaleCount;

        System.out.println("Average age of male lecturers : " + maleAverage);
        System.out.println("Average age of female lecturers : " + femaleAverage);
    }

    public void showOldestLecturerInfo(Lecturer4[] lecturerArray) {
        Lecturer4 oldest = lecturerArray[0];
        for (Lecturer4 lecturer : lecturerArray) {
            if (lecturer.age > oldest.age) {
                oldest = lecturer;
            }
        }
        System.out.println("Oldest lecturer information:");
        oldest.print();
    }

    public void showYoungestLecturerInfo(Lecturer4[] lecturerArray) {
        Lecturer4 youngest = lecturerArray[0];
        for (Lecturer4 lecturer : lecturerArray) {
            if (lecturer.age < youngest.age) {
                youngest = lecturer;
            }
        }
        System.out.println("Youngest lecturer information:");
        youngest.print();
    }

    
}
