import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int step = (a <= b) ? 1 : -1;
        int count = Math.abs(b - a) + 1;

        for (int i = 1; i <= 9; i++) {
            int dan = a;
            for (int k = 0; k < count; k++) {
                System.out.printf("%d * %d = %2d   ", dan, i, dan * i);
                dan += step;
            }
            System.out.println();
        }
    }
}
