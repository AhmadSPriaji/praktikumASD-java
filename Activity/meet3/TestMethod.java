public class TestMethod {
    public static int getRandomNumber() {
        return (int)((Math.random()*100)+1);
    }
    public static double getAbsoluteValue(double value) {
        if(value < 0) return -value;
        else return value;
    }
    public static int getFactorial(int n) {
        if(n > 1) return n*getFactorial(n-1);
        else return 1;
    }
    public static String getWeatherForecast() {
        String[] day = {"today", "tomorrow", "the day after tomorrow"};
        int a = (int)(Math.random()*3);
        String[] weather = {"sunny", "cloudy", "rainy", "snowy"};
        int b = (int)(Math.random()*4);
        return day[a] + " will be " + weather[b];
    }
    public static String getRandomMessage(String name) {
        String[] greet = {"Good morning ", "Good afternoon ", "Good night "};
        int c = (int)(Math.random()*3);
        return greet[c] + name;
    }
    public static boolean isEvenNumber(int value) {
        if(value%2 == 0) return true;
        else return false;
    }
    public static double getMinValue(double a, double b) {
        if(a < b) return a;
        else return b;
    }
    public static boolean isSameAbsoluteValue(int i, int j) {
        if(i==j || i==-j || -i==j) return true;
        else return false;
    }
    public static void getMessage(String name, boolean isKid) {
        if(isKid == false) System.out.println("Halo Pak " + name);
        else System.out.println("Halo Dek " + name);
    }
    public static double getSum(double a, double b, double c) {
        return a+b+c;
    }
    public static double getAverage(double a, double b, double c) {
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        System.out.println(getRandomNumber());
        System.out.println(getAbsoluteValue(-0.398));
        System.out.println(getFactorial(6));
        System.out.println(getWeatherForecast());
        System.out.println(getRandomMessage("Aji"));
        System.out.println(isEvenNumber(5));
        System.out.println(getMinValue(3, 3));
        System.out.println(isSameAbsoluteValue(-4, 4));
        getMessage("Andre", false);
        System.out.println(getSum(0.3243, -1.8212, 100));
        System.out.println(getAverage(0.3243, -1.8212, 100));
    }
}
