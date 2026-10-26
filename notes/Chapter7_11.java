import java.util.Scanner;

class Chapter7_11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("貴様の名を示せ...");
    String firstName = scanner.nextLine();

    System.out.println("貴様はどこの家の者だ...");
    String lastName = scanner.nextLine();

    System.out.println("貴様、いくつになる？");
    int age = scanner.nextInt();

    System.out.println("身長はどれほどだ...");
    double height = scanner.nextDouble();

    System.out.println("体重は？");
    double weight = scanner.nextDouble();

    Chapter7_10 person1 = new Chapter7_10(firstName, lastName, age, height, weight);

    System.out.println(person1.fullName());
    System.out.println(person1.age);
    System.out.println(person1.bmi());

    scanner.close();
  }
}
