public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight = 85;
        int height = 191;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);

    }
}