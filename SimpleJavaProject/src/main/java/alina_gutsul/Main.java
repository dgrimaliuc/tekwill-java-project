package alina_gutsul;

public class Main {
    public static void main(String[] args) {
        double a = 10.7;
        double b = 4.7;

        // Вычисление суммы
        double sum = round(a + b, 2);
        System.out.println("Сумма: " + sum);

        // Вычисление разности
        double difference = round(a - b, 2);
        System.out.println("Разность: " + difference);

        // Вычисление умножения
        double multiplication = round(a * b, 2);
        System.out.println("Умножение: " + multiplication);

        // Вычисление деления
        double division = round(a / b, 2);
        System.out.println("Деление: " + division);
    }

    public static double round(double value, int places){
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}

