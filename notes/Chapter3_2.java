import java.util.Scanner;

public class Chapter3_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("[メニュー]\n1: 検索\n2: 登録\n3: 削除\n4: 変更\n＞");

        String selectedStr = scanner.nextLine();
        int selectedInt = Integer.parseInt(selectedStr);

        switch (selectedInt) {
            case 1 -> {
                System.out.println("検索します");
            }
            case 2 -> {
                System.out.println("登録します");
            }
            case 3 -> {
                System.out.println("削除します");
            }
            case 4 -> {
                System.out.println("変更します");
            }
            default -> {
                System.out.println("1～4を入力してください。");
            }
        }

        scanner.close();
    }
}