package models;

public class UserModel {

  protected String username;
  protected String password;
  protected int age;

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

   public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}