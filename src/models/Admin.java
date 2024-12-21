package models;

import java.util.Objects;
//Admin.java
public class Admin extends User{
  public Admin() {
      super();
  }
    public Admin(int userId,String username,String password) {
        super(userId,username, password);
    }

    public void manageUser(User user, String action) {
        System.out.println("User " + user.getUsername() + " is " + action + " by Admin!");
    }

    public void viewLogFiles() {
        System.out.println("Admin viewed log files!");
    }


  @Override
  public void login() {
      System.out.println("Admin " + getUsername() + " logged in!");
  }

  @Override
  public void logout() {
    System.out.println("Admin " + getUsername() + " logged out!");
  }

  @Override
  public boolean authenticate() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    Admin admin = (Admin) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    return "Admin{} " + super.toString();
  }
}
