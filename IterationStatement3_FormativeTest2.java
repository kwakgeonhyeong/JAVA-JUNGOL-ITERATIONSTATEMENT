import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; n * i < 100; i++) {
            int multiple = n * i;
            System.out.print(multiple + " ");
            if (multiple % 10 == 0) {
                break;
            }
        }
    }
}
