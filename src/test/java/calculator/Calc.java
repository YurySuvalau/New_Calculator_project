package calculator;

public class Calc {
    public double sum(double a, double b) {
        return (double) Math.round((a + b) * 100) / 100;
    }

    public double difference(double a, double b) {
        return (double) Math.round((a - b) * 100) / 100;
    }

    public double division(double a, double b) {
        return (double) Math.round((a / b) * 100) / 100;
    }

    public double multiplication(double a, double b) {
        return (double) Math.round((a * b) * 100) / 100;
    }
}


