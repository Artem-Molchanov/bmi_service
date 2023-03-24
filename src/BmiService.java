public class BmiService {
    public double calculate (int mass, double heightMeters) {
        double bmi = mass / (heightMeters * heightMeters);
        return bmi;
    }

}
