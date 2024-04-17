public class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int ITNsBeforePromotion;

    public StudyProgramme(String name, String description, int numberOfSemesters, int ITNsBeforePromotion) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.ITNsBeforePromotion = ITNsBeforePromotion;
    }
}