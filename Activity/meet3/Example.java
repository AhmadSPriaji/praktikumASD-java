public class Example {
    public static void methodA(int[] a) {
    a[0]++;
}
    public static void main(String[] args) {
    int[] a = new int[2];
    a[0]=10;
    a[1]=10;
    methodA(a);
    System.out.println(a[0]);
    System.out.println(a[1]);
    }
}
