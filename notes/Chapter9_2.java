class Chapter9_2 {
    public String Namae;
    public String Syokugyou;
    public int age;
    public int Level;
    public int HitPoint;

    Chapter9_2(String Namae, String Syokugyou, int age, int Level, int HitPoint) {
        this.Namae = Namae;
        this.Syokugyou = Syokugyou;
        this.age = age;
        this.Level = Level;
        this.HitPoint = HitPoint;
    }

public String introduce() {
    // 名前・職業・年齢・レベル・HPを表示
    return this.Namae + " " + this.Syokugyou + " " + this.Level + " " + this.HitPoint;
 }
}
