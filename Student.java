import enums.Payment;
import enums.ProgramLanguage;

public class Student extends Person {
    private Payment paymentstatus;

    public Student() {
    }

    public Student(String FIO, int age, String gender, ProgramLanguage pl, Payment paymentstatus) {
        super(FIO, age, gender, pl);
        this.paymentstatus = paymentstatus;
    }

    public Payment getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(Payment paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "paymentstatus=" + paymentstatus +
                '}';
    }
}
