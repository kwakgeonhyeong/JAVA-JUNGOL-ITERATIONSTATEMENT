import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int num = sc.nextInt();
            if (num < 0 || num > 100) {
                break;
            }
            sum += num;
            count++;
        }

        double avg = (double) sum / count;

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f%n", avg);
    }
}
