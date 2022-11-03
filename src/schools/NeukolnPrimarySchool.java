package schools;

public class NeukolnPrimarySchool extends PrimarySchool {

    public NeukolnPrimarySchool(int numberOfStudents, String name) {
        super(numberOfStudents, name);
        getMaximumAgeOfStudents();
    }
}
