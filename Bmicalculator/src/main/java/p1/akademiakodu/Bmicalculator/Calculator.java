package p1.akademiakodu.Bmicalculator;

public class Calculator {
    private double height;
    private double weight;
    private double bmi;
    private String result;

    public double calculator(double weight, double height) {
        height /= 100;
        double bmi = weight / (height * height);
        return bmi;
    }

    public String stateofhealth(double bmi) {
        if (bmi < 16) {
            result = "Wygłodzenie";
        } else if (bmi >= 16 && bmi < 17) {
            result = "Wychudzenie";
        } else if (bmi >= 17 && bmi < 18.5) {
            result = "Niedowaga";
        } else if (bmi >= 18.5 && bmi < 25) {
            result = "Wartość prawidłowa";
        } else if (bmi >= 25 && bmi < 30) {
            result = "Nadwaga";
        } else if (bmi >= 30 && bmi < 35) {
            result = "I Stopień otyłości";
        } else if (bmi >= 35 && bmi < 40) {
            result = "II Stopień otyłości";
        } else if (bmi >= 40) {
            result = "Otyłość skrajna";
        }
        return result;
    }
}
