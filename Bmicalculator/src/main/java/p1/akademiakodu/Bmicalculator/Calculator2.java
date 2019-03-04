package p1.akademiakodu.Bmicalculator;

public class Calculator2 {
    private String sex;
    private double daily = 70;
    private double weight;
    private double height;
    private double age;

    public double daily(String sex, double weight, double height, double age) {
        if (sex.equals("woman")) {
            daily = 447.593 + (weight * 9.247) + (height * 3.098) + (age * 4.33);
        } else {
            daily = 88.362 + (weight * 13.397) + (height * 4.799) + (age * 5.677);
        }
        return daily;
    }

}
