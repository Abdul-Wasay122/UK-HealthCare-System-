package model;

public class user {

    protected int userId;
    protected String name;
    protected String email;
    protected String password;
    protected String phone;
    protected String address;

    // Constructor
    public user(int userId, String name, String email, String phone,
                String address, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password = password;
    }

    //login()
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    //logOut(
    public void logOut() {
        System.out.println("You have been logged out");
    }

    //update profile()
    public void updateProfile(String name, String phone, String address) {

    this.name =name;
    this.phone =phone;
    this.address=address;
}//getters
    public int getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }


}
