public class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String surName;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surName, int age)
    {
        setName(name);
        setSurName(surName);
        setAge(age);
    }

    public Person()
    {

    }

    public void printInfo()
    {
        System.out.println("Человек " + getSurName() + " "+ getName() + ", возраст: " + getAge());
    }



}
