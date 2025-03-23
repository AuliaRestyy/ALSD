public class LecturerDemo {
    public static void main(String[] args) {
        LecturerData lecturersData = new LecturerData();

        lecturersData.add(new Lecturer("2501", "Imam", true, 32));
        lecturersData.add(new Lecturer("2502", "Afif", true, 28));
        lecturersData.add(new Lecturer("2503", "Atiqah", false, 30));
        lecturersData.add(new Lecturer("2504", "Bagas", true, 25));
        lecturersData.add(new Lecturer("2505", "Meyti", false, 35));
        lecturersData.add(new Lecturer("2506", "Dika", true, 34));
        lecturersData.add(new Lecturer("2507", "Anugrah", true, 22));
        lecturersData.add(new Lecturer("2508", "Farid", true, 33));
        lecturersData.add(new Lecturer("2509", "Devi", false, 26));
        lecturersData.add(new Lecturer("2510", "Vivi", false, 20));

        System.out.println("Original Lecturer List:");
        lecturersData.print();

        lecturersData.sortingAsc();
        System.out.println("Sorted lecturer list (by Age, ascending) using Bubble Sort");
        lecturersData.print();

        lecturersData.sortingDsc();
        System.out.println("Sorted lecturer list (by Age, descending) using Insertion Sort");
        lecturersData.print();
        







    }
}
