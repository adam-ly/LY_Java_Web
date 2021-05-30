package Demo10_JSP.Servlet.LoginDemo;

import java.util.Date;

public class User {
    private int age;
    private String name;
    private Date birthDay;

    public User(int age, String name, Date birthDay) {
        this.age = age;
        this.name = name;
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
