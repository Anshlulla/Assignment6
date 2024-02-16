package part2;

public class Result extends Student implements Exam {
    private double result;

    public Result(String name, String prn, int marks1, int marks2, int marks3) {
        super(name, prn, marks1, marks2, marks3);
    }

    public void percent_cal() {
        result = (super.getMarks1() + super.getMarks2() + super.getMarks3())/3;
    }

    public void display() {
        System.out.println("Student{" +
                "name='" + super.getName() + '\'' +
                ", prn='" + super.getPrn() + '\'' +
                ", marks1=" + super.getMarks1() +
                ", marks2=" + super.getMarks2() +
                ", marks3=" + super.getMarks3() +
                ", result=" + result +
                '}');
    }
}
