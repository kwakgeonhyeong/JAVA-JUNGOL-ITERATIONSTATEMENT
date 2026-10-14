import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] odds = {1, 3, 5, 7, 9};
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(odds[index % 5] + " ");
                index++;
            }
            System.out.println();
        }
    }
}
