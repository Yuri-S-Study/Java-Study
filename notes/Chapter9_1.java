class Chapter9_1 {
  public static void main(String[] args) {
    Chapter9_2 Arthur = new Chapter9_2("アーサー", "騎士", 25, 10, 150);
    Chapter9_2 Eris = new Chapter9_2("エリス", "魔法使い", 21, 8, 90);
    System.out.println(Arthur.introduce());
    System.out.println(Eris.introduce());

  }
}