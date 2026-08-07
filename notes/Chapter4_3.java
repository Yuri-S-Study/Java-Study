import java.util.Scanner;

public class Chapter4_3 {
    public static void main(String[] args) {
        // (1) 配列の準備
        int[] numbers = {3, 4, 9};

        // (2) メッセージの表示
        System.out.println("1桁の数字を入力してください");

        // (3) キーボードからの数字入力
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int input = Integer.parseInt(inputStr);

        // (4) 配列を回しながら判定
        for (int n : numbers) {
            if (n == input) {
                System.out.println("アタリ！");
            }
        }

        scanner.close();
    }
}