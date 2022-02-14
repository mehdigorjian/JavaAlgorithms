package linkedlist;

public class MainClass {
    public static void main(String[] args) {
        // LinkedList<String> ll = new LinkedList<>();
        // ll.insert("Mehdi", "begin");
        // ll.insert("Mehrnoush", "end");
        // ll.insert("Mahshid", "end");
        // ll.insert("Milad", "begin");
        // ll.remove("Mehdi");
        // ll.traverse();
        // System.out.println(ll.size());

        LinkedList<Person> people = new LinkedList<>();
        Person p1 = new Person("Mehdi", 41);
        Person p2 = new Person("Mehrnoush", 35);
        Person p3 = new Person("Mahshid", 32);
        people.insert(p1, "begin");
        people.insert(p2, "begin");
        people.insert(p3, "begin");
        people.traverse();

        LinkedList<Student> std = new LinkedList<>();
        Student s1 = new Student("Mehdi", 100);
        s1.setGrade('A');
        s1.setProgram("CSCE");
        Student s2 = new Student("Mehrnoush", 101);
        s1.setGrade('A');
        s1.setProgram("MED");
        Student s3 = new Student("Mahshid", 102);
        s1.setGrade('A');
        s1.setProgram("ARCH");
        std.insert(s1, "begin");
        std.insert(s2, "begin");
        std.insert(s3, "begin");
        std.remove(s1);
        std.traverse();
    }
}