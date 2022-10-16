import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        service.calculate(90, (float) 1.63);
        int bmi = service.calculate(90, (float) 1.63);
        System.out.println("Индекс массы тела человека равен " + bmi);
    }
}