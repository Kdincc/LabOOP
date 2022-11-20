public class Student extends Person{
    int group;

    public Student(String name, String surName, int age, int group, int bilet) {
        setName(name);
        setSurName(surName);
        setAge(age);
        setGroup(group);
        setBilet(bilet);
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    int bilet;

    public void setBilet(int bilet) {
        this.bilet = bilet;
    }

    public int getBilet() {
        return bilet;
    }


    @Override
    public void printInfo()
    {
        System.out.println("Студент группы " + getGroup() + " " + getSurName() + " " + getName() + ", возраст: " + getAge());
        System.out.println("Номер студентического билета: " + getBilet());
    }
}
