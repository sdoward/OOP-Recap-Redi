package schools;

public class PrimarySchool extends School {

    String name;

    public PrimarySchool(int numberOfStudents, String name) {
        super(numberOfStudents);
        this.name = name;
    }

    @Override
    int getMaximumAgeOfStudents() {
        return 10;
    }
}
