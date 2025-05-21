public class Student04 {
    String nim, name, className;
    double gpa;

    public Student04() {

    }

    public Student04(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}
