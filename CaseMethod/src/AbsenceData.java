public class AbsenceData {
    Absence[] listAbsence = new Absence[7];
    Student[] stdArray = new Student[5];
    Course[] crsArray = new Course[3];

    public AbsenceData() {
        stdArray[0] = new Student("22001", "Ali Rahman");
        stdArray[1] = new Student("22002", "Budi Santoso");
        stdArray[2] = new Student("22003", "Citra Dewi");
        stdArray[3] = new Student("22004", "Deni Saputra");
        stdArray[4] = new Student("22005", "Eka Wulandari");

        crsArray[0] = new Course("MK001", "Data Structure", 3);
        crsArray[1] = new Course("MK002", "Data Base", 3);
        crsArray[2] = new Course("MK003", "Web Design", 2);

        listAbsence[0] = new Absence(stdArray[0], crsArray[0], 10, 1, 1, 0);
        listAbsence[1] = new Absence(stdArray[0], crsArray[1], 12, 0, 1, 1);
        listAbsence[2] = new Absence(stdArray[1], crsArray[0], 14, 0, 0, 0);
        listAbsence[3] = new Absence(stdArray[2], crsArray[1], 9, 2, 1, 2);
        listAbsence[4] = new Absence(stdArray[2], crsArray[2], 10, 0, 0, 2);
        listAbsence[5] = new Absence(stdArray[3], crsArray[2], 13, 0, 0, 0);
        listAbsence[6] = new Absence(stdArray[4], crsArray[0], 11, 1, 1, 1);
    }

    public void sortData() {
        for (int i = 0; i < listAbsence.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listAbsence.length; j++) {
                if (listAbsence[j].calcAbsence() > listAbsence[minIndex].calcAbsence()) {
                    minIndex = j;
                }
            }
            Absence temp = listAbsence[minIndex];
            listAbsence[minIndex] = listAbsence[i];
            listAbsence[i] = temp;
        }
    }

    public void searchNim(String searchNim) {
        boolean found = false;
        for (int i = 0; i < listAbsence.length; i++) {
            if (listAbsence[i].std.nim.equals(searchNim)) {
                listAbsence[i].displayAbsence();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data for NIM " + searchNim + " not found");
        }
    }

    public void sortedDisplay() {
        for (int i = 0; i < listAbsence.length; i++) {
            System.out.println(listAbsence[i].calcAbsence() + " - " + listAbsence[i].std.studentName + " - " + listAbsence[i].crs.courseName);
        }
    }
}