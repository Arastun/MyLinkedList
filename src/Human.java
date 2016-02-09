/**
 * Created by Root on 09.02.2016.
 */
public class Human {
    String name;
    int age;
    enum Gender  {MALE,FEMALE}
    Gender gender;

    public Human(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
