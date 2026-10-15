class Chapter7 {
  public static void main(String[] args) {
    String name1 = "Kate Jones";
    int age1 = 27;
    // 1人目の出身地を表す変数city1を足してください
    String city1 = "東京";

    String name2 = "John Smith";
    int age2 = 65;
    // 2人目の出身地を表す変数city2を足してください
    String city2 = "大阪";

    // 3人目のEmma Brownの名前・年齢・出身地を表す変数を足してください
    String name3 = "Emma Brown";
    int age3 = 32;
    String city3 = "福岡";

    introduce(name1, age1, city1);
    introduce(name2, age2, city2);
    // 3人目の自己紹介を出力してください
    introduce(name3, age3, city3);
  }

  // 引数にcityを足して、出身地も出力するようにしてください
  public static void introduce(String name, int age, String city) {
    System.out.println("こんにちは、私は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("出身は" + city + "です");
  }
}