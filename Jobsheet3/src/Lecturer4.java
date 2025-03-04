public class Lecturer4 {
    public String id, name;
    public Boolean gender;
    public int age;

    public Lecturer4(String id, String name, Boolean gender, int age){
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
    }

    public String getGender(){
        return gender ? "Male" : "Female";
    }

    public void print(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Gender : " + getGender());
        System.out.println("Age : " + age);
    }
}
