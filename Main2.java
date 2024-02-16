package part2;

public class Main2 {
    public static void main(String[] args) {
        Student s = new Student("Ansh", "013", 12, 22, 77);
        Result r = new Result("Ansh", "013", 12, 22, 77);
        r.percent_cal();
        r.display();
    }
}
