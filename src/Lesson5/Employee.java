package Lesson5;

public class Employee {
    private String name;
    private String post;
    private String email;
    private int telephone;
    private int payment;
    private int age;

    public Employee(String name, String post, String email, int telephone, int payment, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.payment = payment;
        this.age = age;

    }
    public void show () {
        System.out.printf("%s %s %s %d %d %d\n", name , post, email , telephone, payment, age);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephone() {
        return telephone;
    }

    public int getPayment() {
        return payment;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", payment=" + payment +
                ", age=" + age +
                '}';
    }
}