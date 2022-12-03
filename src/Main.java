public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70;
        double height = 1.77;
        var result = service.calculate(weight, height);
        System.out.println(result);
    }
}