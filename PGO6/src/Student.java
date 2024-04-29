import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    public static int counter = 1;
    public static ArrayList<Student> students = new ArrayList<Student>();

    private String name;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String indexNumber;
    private int currentSemester;
    private StudyProgramme studyProgramme;
    private int ITNs;
    private String status;
    public HashMap<String, ArrayList<Integer>> grades = new HashMap<>();

    public Student(String name, String lastName, String email, String address, String phoneNumber,
                   LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.indexNumber = "s" + counter++;
        this.status = "kandydat";
        this.grades = new HashMap<>();
        Student.students.add(this);
    }

    public void enrollStudent(StudyProgramme programme) {
        this.currentSemester = 1;
        this.status = "student";
        this.studyProgramme = programme;
    }

    public void addGrade(int grade, String subject) {
        if (!grades.containsKey(subject)) {
            grades.put(subject, new ArrayList<>());
        }
        grades.get(subject).add(grade);
    }

    public static void promoteAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            StudyProgramme programme = student.getStudyProgramme();
            int currentSemester = student.getCurrentSemester();
            int ITNs = student.getITNs();

            if (currentSemester < programme.getNumberOfSemesters() && ITNs < programme.getITNsBeforePromotion()) {
                student.setCurrentSemester(currentSemester + 1);
            } else if (currentSemester > programme.getNumberOfSemesters()) {
                student.setStatus("absolwent");
            } else {
                System.out.println("Student " + programme.getName() + " pozostaje na aktualnym semestrze");
            }
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("Imię: " + student.getName());
            System.out.println("Nazwisko: " + student.getLastName());
            System.out.println("E-mail: " + student.getEmail());
            System.out.println("Adres: " + student.getAddress());
            System.out.println("Numer telefonu: " + student.getPhoneNumber());
            System.out.println("Data urodzenia: " + student.getDateOfBirth());
            System.out.println("Status: " + student.getStatus());
            System.out.println("Numer indeksu: " + student.getIndexNumber());
            System.out.println("Aktualny semestr: " + student.getCurrentSemester());
            System.out.println("Program studiów: " + student.getStudyProgramme());
            System.out.println("Liczba niezaliczonych przedmiotów: " + student.getITNs());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public void setStudyProgramme(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public int getITNs() {
        return ITNs;
    }

    public void setITNs(int ITNs) {
        this.ITNs = ITNs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}