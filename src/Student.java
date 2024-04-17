public class Student {
  // property
  private String name;
  private int age;
  private int grade;

  // method
  public void study() {
    System.out.println(name + "이(가) 공부하고 있어요.");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getGrade() {
    return grade;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

}