import java.sql.Array;
import java.util.*;

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

    public void testIterator() {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student st = it.next();
            System.out.println("学生" + st.id + ":" + st.name);
        }
    }

    public void testForEach() {
        System.out.println("有如下学生（通过 for each）：");
        for (Student obj : students) {
            Student st = obj;
            System.out.println("学生：" + st.id + ":" + st.name);
        }
        //使用 java8 Stream 将学生排序后输出
        students.stream()//创建 Stream
                //通过学生 id 排序
                .sorted(Comparator.comparing(x -> x.id))
                //输出
                .forEach(System.out::println);
    }
}
