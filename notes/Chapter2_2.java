import java.util.Scanner;
import java.util.Random;
public class Chapter2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ようこそ、占いの館へ");
        System.out.println("あなたの名前を入力してください>");

        String name = scanner.nextLine();

        System.out.println("あなたの年齢を入力してください>");
        String ageString = scanner.nextLine();

        int age = Integer.parseInt(ageString);

        int fortune = new Random().nextInt(4) + 1;

        System.out.println("占いの結果が出ました!");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("(1:大吉 2:中吉 3:吉 4:凶)");

        scanner.close();
    }
}