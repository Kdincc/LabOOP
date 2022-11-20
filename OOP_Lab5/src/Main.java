public class Main {



    public static void main(String[] args) {
        Person person = new Person("Vitya", "Pupkin", 42);

        Person student = new Student("Vasya", "Vasiliovich", 19, 211, 3);

        Person lecturer = new Lecturer("Victor", "Sergeevich", 42, 30000, "Инф.тех");

        Person[] persons = {person, student, lecturer};

        for (Person p :persons) {
            p.printInfo();
        }
    }
}
