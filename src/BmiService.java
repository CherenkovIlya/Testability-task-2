public class BmiService {
    public double calculate(int weight, int height) {
        double bmi = weight * 100.0 * 100 / height / height;
        return bmi;
    }
}
