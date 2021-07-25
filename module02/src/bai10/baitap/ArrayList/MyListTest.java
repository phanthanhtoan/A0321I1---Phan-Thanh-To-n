package bai10.baitap.ArrayList;

public class MyListTest {
    public static class Student {
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

    public static void main(String[] args) {
        Student a = new Student(1, "Vuong");
        Student b = new Student(2, "Khanh");
        Student c = new Student(3, "Trieu");
        Student d = new Student(4, "Trung");
        Student e = new Student(5, "Cuong");
        Student f = new Student(6, "Huynh");

        MyList<Student> studentMyArrayList = new MyList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(8, f);
        studentMyArrayList.size();

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student stu = (Student) studentMyArrayList.elements[i];
            System.out.println("ID: " + stu.getId() + " & Name : " + stu.getName());
        }

    }
}
