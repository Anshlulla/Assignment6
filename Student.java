package part2;

public class Student {
    public Student(String name, String prn, int marks1, int marks2, int marks3) {
        this.name = name;
        this.prn = prn;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    private String name, prn;
    private int marks1, marks2, marks3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrn() {
        return prn;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", prn='" + prn + '\'' +
                ", marks1=" + marks1 +
                ", marks2=" + marks2 +
                ", marks3=" + marks3 +
                '}';
    }
}
