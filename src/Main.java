public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int mass = 98;
        double heightMeters = 1.87;
        double calculate = service.calculate(mass, heightMeters);
        double result = (int) calculate;
        System.out.println("Ваш индекс равен: " + result);
    }
}
