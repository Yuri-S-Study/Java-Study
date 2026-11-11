
class Chapter9_4 {
  private String firstName;
  private String lastName;
  private String middleName;
  private int age;
  private double height;
  private double weight;
  private String job;

  public Chapter9_4(String firstName, String lastName, String middleName,
                    int age, double height, double weight, String job) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.job = job;
  }

  // Setter：職業を変更する
  public void setJob(String job) {
    this.job = job;
  }

  // Getter：職業を取得する
  public String getJob() {
    return this.job;
  }

  // 情報を表示する
  public void printData() {
    System.out.println("名前：" + firstName + " " + middleName + " " + lastName);
    System.out.println("年齢：" + age);
    System.out.println("身長：" + height);
    System.out.println("体重：" + weight);
    System.out.println("職業：" + job);
  }
}
