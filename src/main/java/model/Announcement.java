package model;

public class Announcement {

    private String User;
    private String Brand;
    private String Color;
    private String Engine;
    private String Mileage;
    private String HorsePower;
    private String YearOfFabrication;
    private String Details;
    private String Phone;
    private String Email;

    public Announcement(){

    }

    public Announcement(String u,String b, String c, String e, String m, String hp, String yf, String d,String p, String em){
        this.User=u;
        this.Brand=b;
        this.Color=c;
        this.Engine=e;
        this.Mileage=m;
        this.HorsePower=hp;
        this.YearOfFabrication=yf;
        this.Details=d;
        this.Phone=p;
        this.Email=em;
    }


    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getMileage() {
        return Mileage;
    }

    public void setMileage(String mileage) {
        Mileage = mileage;
    }

    public String getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(String horsePower) {
        HorsePower = horsePower;
    }

    public String getYearOfFabrication() {
        return YearOfFabrication;
    }

    public void setYearOfFabrication(String yearOfFabrication) {
        YearOfFabrication = yearOfFabrication;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }
}
