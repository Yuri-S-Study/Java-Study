import java.util.Random;
import java.util.Scanner;

public class Chapter3_3 {
    public static void main(String[] args) {
        System.out.println("【数あてゲーム】");

        Random rand = new Random();
        int ans = rand.nextInt(10);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("0～9の数字を入力してください");

            int num = Integer.parseInt(scanner.nextLine());

            if (ans == num) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }

        System.out.println("ゲームを終了します");
        scanner.close();
    }
}