import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char letter = 'A';
        int number = 0;

        for (int i = 1; i <= n; i++) {
            int letterCount = n - i + 1;
            int numberCount = i - 1;

            for (int j = 0; j < letterCount; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            for (int j = 0; j < numberCount; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
