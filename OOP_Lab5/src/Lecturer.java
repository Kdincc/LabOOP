public class Lecturer extends Person {
    String pulpit;

    public void setPulpit(String pulpit) {
        this.pulpit = pulpit;
    }

    public String getPulpit() {
        return pulpit;
    }
    int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public Lecturer(String name, String surName, int age, int salary, String pulpit)
    {
        setName(name);
        setSurName(surName);
        setAge(age);
        setSalary(salary);
        setPulpit(pulpit);
    }

    @Override
    public void printInfo()
    {
        System.out.println("Преподователь кафедры " + getPulpit() + " " + getSurName() + " "+ getName() + ", возраст: " + getAge());
        System.out.println("Зарплата: " + getSalary());
    }
}
