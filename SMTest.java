package wumengtong;//测试类

public class SMTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();//创建学生管理类对象studentManager
        studentManager.addStudent(1,"吴孟桐","1999.7",true);//插入我的信息
        studentManager.seek("吴孟桐");
        studentManager. change("吴孟桐");
        studentManager.printAll();
        studentManager.tuichu();
    }
}
