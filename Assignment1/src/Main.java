public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }

    public static int fibonacci(int seq) {
        if (seq==0) {return 0;}
        if (seq==1) {return 1;}
        return fibonacci(seq-1) + fibonacci(seq-2);
    }
}