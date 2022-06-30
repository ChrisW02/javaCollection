import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public List<Student> students;

    public ListTest() {
        this.students = new ArrayList<Student>();
    }

    public void testAdd() {
        Student st1 = new Student("1", "张三");
        students.add(st1);

        Student temp = students.get(0);
        System.out.println(temp.id + ':' + temp.name);

        Student st2 = new Student("2", "李四");
        students.add(0, st2);

        Student[] student = {new Student("3", "王五"), new Student("4", "马六")};
        students.addAll(Arrays.asList(student));
    }

    public void testGet() {
        for (Student st : students) {
            System.out.println("学生：" + st.id + ":" + st.name);
        }
    }
}
