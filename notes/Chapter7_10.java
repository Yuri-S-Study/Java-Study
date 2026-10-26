class Chapter7_10 {
    public String firstName;
    public String lastName;
    public int age;
    public double height;
    public double weight;

    Chapter7_10(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public String fullName(){
        return this.firstName + " " + this.lastName;
    }

    public double bmi(){
        return this.weight / this.height / this.height;
    }
}