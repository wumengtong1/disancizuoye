package wumengtong;//������

public class SMTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();//����ѧ�����������studentManager
        studentManager.addStudent(1,"����ͩ","1999.7",true);//�����ҵ���Ϣ
        studentManager.seek("����ͩ");
        studentManager. change("����ͩ");
        studentManager.printAll();
        studentManager.tuichu();
    }
}
