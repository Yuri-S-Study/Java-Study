
class Chapter9_3 {
  public static void main(String[] args) {
    Chapter9_4 person1 = new Chapter9_4(
        "Yuri", "Shimazaki", "Smith", 65, 1.75, 80.0, "教師"
    );

    person1.setJob("自宅警備員");

    System.out.println("仕事を" + person1.getJob()
        + "に変更。つまりは無職というわけです。");

    person1.printData();
  }
}

