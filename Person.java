import enums.ProgramLanguage;

public abstract class Person {
    private String FIO;
    private int age;
    private String gender;
    private ProgramLanguage Pl;

    public Person() {
    }

    public Person(String FIO, int age, String gender, ProgramLanguage pl) {
        this.FIO = FIO;
        this.age = age;
        this.gender = gender;
        Pl = pl;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ProgramLanguage getPl() {
        return Pl;
    }

    public void setPl(ProgramLanguage pl) {
        Pl = pl;
    }

    @Override
    public String toString() {
        return "Classes.Person{" +
                "FIO='" + FIO + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", Pl=" + Pl +
                '}';
    }
}
//    Создаем абстракный класс Classes.Person и дочерние классы - Classes.Student, Classes.Mentor
//        Classes.Person -> FIO, (enum)pl, age, gender
//
//        pl->Java,Python,JavaScript,Flutter
//
//        Classes.Student -> (enum)payment -> FREE, PAYED, HALFPAYED, NOTPAYED, DELETED
//
//        Classes.Mentor  -> enum(degree) -> intern, junior, middle, senior
//
//
//        В классе Classes.Main реализовать методы enum: name(), ordinal(), values().
//
//        Создать по 3 экземпляра Classes.Student и Classes.Mentor и вывести на консоль
//        информацию о них.