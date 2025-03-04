import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Student miguel = new Student("Miguel", "000391831", 34, 'm');
        Student vanessa = new Student();
        System.out.println(miguel);
        System.out.println(vanessa);
        System.out.println(miguel.studentId);
        System.out.println(vanessa.studentId);
        System.out.println(vanessa.studentGender);

        miguel.tellInfo();
        miguel.repeatAfter("Matanga dijo la changa!");
        miguel.haveBirthday();
        miguel.tellInfo();
        miguel.haveBirthday();
        miguel.tellInfo();

        String miguelEmail = miguel.getEmail();
        System.out.println("Email de miguel: " + miguelEmail);


    }
}
