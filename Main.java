import enums.Degree;
import enums.Payment;
import enums.ProgramLanguage;

public class Main {
    public static void main(String[] args) {
        Mentor mentor = new Mentor("Maxim Galkin", 50, "Male",
                ProgramLanguage.FLUTTER, Degree.JUNIOR);
        Mentor mentor1 = new Mentor( "Alla Pugacheva", 80, "Famale",
                ProgramLanguage.PYTHON, Degree.INTERN);
        Mentor mentor2 = new Mentor("Aikanysh Talantbek", 25, "Female",
                ProgramLanguage.JAVA, Degree.MIDDLE);

        Student student = new Student("Tina Kandelaki", 45, "Female",
                ProgramLanguage.JAVASCRIPT, Payment.PAYED);
        Student student1 = new Student("Sofiya Rotaru", 75, "Female",
                ProgramLanguage.FLUTTER, Payment.NOTPAYED);
        Student student2 = new Student("Vladimir Putin", 70, "Male",
                ProgramLanguage.JAVA, Payment.FREE);
        Person [] educated = {mentor, mentor1, mentor2, student1,student2, student};
        for (Person a : educated) {
            if( a instanceof Mentor) {
                System.out.println(a + " " + ((Mentor) a).getDegree());
            }else
                System.out.println(a + " " + ((Student)a).getPaymentstatus());
                System.out.println("--------------------");
            }
        for (ProgramLanguage a :  ProgramLanguage.values()) {
            System.out.println(a+ " "+a.ordinal());
            System.out.println( a + " " + student1.getPaymentstatus().name());
       }

        }

    }
