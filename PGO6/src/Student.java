import java.util.Date;

public class Student {
    private String name;
    private String lastName;
    private String email;
    private String city;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;

    public Student(String name, String lastName, String email, String city, String address, String phoneNumber,
                   Date dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = String.valueOf(dateOfBirth);
    }

    public void enrollStudent(StudyProgramme it) {
    }

    public void addGrade(int grade, String name) {
    }

    public static void promoteAllStudents() {
    }

    public static void displayInfoAboutAllStudents() {
    }
}