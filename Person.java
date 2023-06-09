class Person {
  // カプセル化（フィールドとメソッドへのアクセスを制限すること）
  // インスタンスフィールド
  private static int count = 0;
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;
  private String job;
  
  // コンストラクタ（newを使ってインスタンスを生成した後に自動で呼び出される特別なメソッド）
  // クラス名（）
  Person(String firstName, String lastName, int age, double height, double weight, String job) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.job = job;
  }
  
  // コンストラクタ（newを使ってインスタンスを生成した後に自動で呼び出される特別なメソッド）
  Person(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
    // this()はコンストラクタを呼び出すための特別なメソッド
    this(firstName, lastName, age, height, weight, job);
    this.middleName = middleName;
  }
  
  // ゲッター：フィールドの値を返すだけのメソッドを定義(getフィールド名)
  public String getMiddleName() {
    return this.middleName;
  }
  
  public String getJob() {
    return this.job;
  }
  
  // セッター：フィールドの値を変更するメソッド（setフィールド名）
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
  
  public void setJob(String job) {
    this.job = job;
  }
  
  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }
  
  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
    System.out.println("仕事は" + this.job + "です");
  }
  
  public double bmi() {
    return this.weight / this.height / this.height;
  }
  
  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}