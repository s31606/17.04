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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public void setNumberOfSemesters(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
    }

    public int getITNsBeforePromotion() {
        return ITNsBeforePromotion;
    }

    public void setITNsBeforePromotion(int ITNsBeforePromotion) {
        this.ITNsBeforePromotion = ITNsBeforePromotion;
    }
}