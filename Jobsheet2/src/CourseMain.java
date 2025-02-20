public class CourseMain {
    public static void main(String[] args) {
        Course4 course1 = new Course4();
        course1.courseID = "3108";
        course1.name = "Basic Programming";
        course1.credit = 2;
        course1.hour = 6;
        course1.print();
        course1.changeCredit(4);
        course1.addHour(1);
        course1.reduceHour(5);
        course1.print();

        Course4 course2 = new Course4("1011", "Interface Design", 2, 4);
        course2.changeCredit(3);
        course2.addHour(1);
        course2.print();
    }
    
}
