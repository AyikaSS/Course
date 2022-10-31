import enums.Degree;
import enums.ProgramLanguage;

public class Mentor extends Person {
    private Degree degree;

    public Mentor() {
    }

    public Mentor(String FIO, int age, String gender, ProgramLanguage pl, Degree degree) {
        super(FIO, age, gender, pl);
        this.degree = degree;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return super.toString() + "Mentor{" +
                "degree=" + degree +
                '}';
    }
}
