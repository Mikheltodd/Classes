public class Student {
    // Instance Fields
    String studentName;
    String studentId = "000000000";
    int studentAge;
    char studentGender;
    String studentEmail = "Por asignar";

    // Constructor
    // Constructor vacío
    public Student() {
        System.out.println("Estudiante creado sin datos!");
    }
    // Constructor con datos
    public Student(String name, String id, int age, char gender) {
        studentName = name;
        studentId = id;
        studentAge = age;
        studentGender = gender;
        System.out.println("Estudiante \"" + studentName + "\" creado!");

    }

    public Student(String name, String id, int age, char gender, String email) {
        studentName = name;
        studentId = id;
        studentAge = age;
        studentGender = gender;
        studentEmail = email;
        System.out.println("Estudiante \"" + studentName + "\" creado!");

    }

    public void tellInfo(){
        System.out.println("My name is " + studentName + " and my ID is " + studentId);
        System.out.println("I am " + studentAge + " years old and my gender is " + studentGender);
    }

    public void repeatAfter(String message) {
        System.out.println("The message is: " + message);
    }

    public void haveBirthday(){
        studentAge++;
    }

    public String getEmail(){
        return studentEmail;
    }

    public String toString(){
        return "Student with name: " + studentName;
    }
}
