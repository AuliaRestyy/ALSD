public class Course4 {
    String courseID;
    String name;
    int credit;
    int hour;

    public Course4() {

    }
    public Course4(String id, String name, int credit, int hour) {
        courseID = id;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }

    void print(){
        System.out.println("Course ID : " + courseID);
        System.out.println("Name : " + name);
        System.out.println("Credit : " + credit);
        System.out.println("Hour : " + hour);
    }

    void changeCredit(int newCredit){
        credit = newCredit;
    }

    void addHour(int addHour){
        hour += addHour;
    }

    void reduceHour(int reduceHour){
        if (hour < reduceHour) {
            System.out.println("Invalid hour");
        } else if (hour >= reduceHour){
            hour -= reduceHour;
        }
    }
}
