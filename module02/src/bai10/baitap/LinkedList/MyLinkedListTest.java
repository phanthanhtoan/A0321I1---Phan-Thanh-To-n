package bai10.baitap.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        MyLinkedList<Student> studentMyLinkedList = new MyLinkedList<>();
        Student a = new Student(1, "Vuong");
        Student b = new Student(2, "Hai");
        Student c = new Student(3, "Cong");
        Student d = new Student(4, "Tuan");
        Student e = new Student(5, "The");
        studentMyLinkedList.addFirst(a);
        studentMyLinkedList.addFirst(b);
        studentMyLinkedList.addLast(c);
        studentMyLinkedList.addLast(d);
        studentMyLinkedList.add(2, e);
        studentMyLinkedList.remove(1);
        System.out.println(studentMyLinkedList.constrain(b));
        System.out.println(studentMyLinkedList.indexOf(b));
    }
}
