public class Address {
    private String name;
    private int age;
    private String home;
    private String phone;

    public Address(String name, int age, String home, String phone) {
        this.name = name;
        this.age = age;
        this.home = home;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "name = " + name + "age = " + age + "home = " + home + "phone = " + phone;
    }
}
