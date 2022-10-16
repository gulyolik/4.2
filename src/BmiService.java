public class BmiService {
    public int calculate(int weight, float height) {
        int result = (int) (weight / (height * height));
        return result;
    }
}
