package wumengtong;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> arrayList = new ArrayList<>();//��ʼ��
    public static void addStudent(int ID,String name,String birDate,boolean gender)
    {

        Student student = new Student();
        student.setBirDate(birDate);
        student.setID(ID);
        student.setName(name);
        student.setGender(gender);
        arrayList.add(student);

    }//����

    public static void seek(String name1)
    {

        boolean isFind = false;

        for (Student student1 : arrayList)
        {
            if (student1.getName().equals(name1) )
            {
                isFind =true;
                System.out.println("ѧ�ţ�" + student1.getID()  + "������" + student1.getName() + "�������ڣ�"+student1.getBirDate()+"�Ա�"+(student1.isGender()?"��":"Ů"));
            }
        }
        if (!isFind)
            System.out.println("δ�鵽���ˣ���˶���Ϣ");
    }//����
    	public static void delete(String name2)
        {
            boolean isFinddelete = false;

            for (int i = 0; i <arrayList.size();i++)
            {
                Student student1 = arrayList.get(i);
                if (student1.getName().equals(name2) )
                {
                    isFinddelete =true;
                    arrayList.remove(student1);
                }
            }
            if (!isFinddelete)
                System.out.println("δ�鵽���ˣ���˶���Ϣ");
        }//ɾ��
    public static void change(String name3)
    {

        boolean isFindchange = false;
        for (int i = 0; i <arrayList.size();i++)
        {
            Student student1 = arrayList.get(i);
            if (student1.getName().equals(name3) )
            {
                isFindchange =true;
                System.out.println("�������޸��˵ĳ�������");
                String birdh = scanner.nextLine();
                student1.setBirDate(birdh);
                System.out.println("�������޸��˵��Ա�");
                boolean sex = scanner.nextLine().equals("��")?true:false;
                student1.setGender(sex);

            }
        }
        if (!isFindchange)
            System.out.println("δ�鵽���ˣ���˶���Ϣ");
    }///�޸�
    public static  void xianshi(ArrayList<String> arrayList)
    {
        for (String string:arrayList)
        {
            if (string.equals("1"))
            {
                System.out.print("����" + " ");
            }
            if (string.equals("2"))
            {
                System.out.print("����" + " ");
            }
            if (string.equals("3"))
            {
                System.out.print("ɾ��" + " ");
            }
            if (string.equals("4"))
            {
                System.out.print("�޸�" + " ");
            }
            if (string.equals("5"))
            {
                System.out.print("���" + " ");
            }
            if (string.equals("6"))
            {
                System.out.print("�˳�" + " ");
            }            
        }
    }//������ѭ������{} 18
public static void printAll()
{
    for (Student student1 : arrayList)
        System.out.println("ѧ�ţ�" + student1.getID()  + "������" + student1.getName() + "�������ڣ�"+student1.getBirDate()+"�Ա�"+(student1.isGender()?"��":"Ů"));

}
public  static  void tuichu()
{
    System.exit(0);
}
    public static void App()
    {
        boolean tuichu = true;
        ArrayList<String> arrayList = new ArrayList<>();
        while (tuichu)
        {
            System.out.println("��ѡ�����");
            System.out.println("*********************************************************");
            System.out.println("*                         1.����                        *");
            System.out.println("*                         2.����                        *");
            System.out.println("*                         3.ɾ��                        *");
            System.out.println("*                         4.�޸�                        *");
            System.out.println("*                         5.���                        *");
            System.out.println("*                         6.�˳�                        *");
            System.out.println("*********************************************************");
            String a = scanner.nextLine();
            arrayList.add(a);
            switch (a){
                case "1":
                    int ID = arrayList.size()+1;
                    System.out.println("������������");
                    String name = scanner.nextLine();
                    System.out.println("������������ڣ�");
                    String birDate = scanner.nextLine();
                    System.out.println("�������Ա�");
                    boolean gender = (scanner.nextLine().equals("��"))?true:false;
                    addStudent(ID,name,birDate,gender);
                    break;
                case "2":
                    System.out.println("����������˵�������");
                    String name1 = scanner.nextLine();
                    seek(name1);
                    break;
                case "3":
                    System.out.println("�����뱻ɾ���˵�������");
                    String name2 = scanner.nextLine();
                    delete(name2);
                    break;
                case "4":
                    System.out.println("�����뱻�޸��˵�������");
                    String name3 = scanner.nextLine();
                    change(name3);
                    break;
                case "5":
                    printAll();
                    break;
                case "6":
                    tuichu();
                    break;
                case "7":
                    xianshi(arrayList);
                    break;//������ʿ��ܻ���ִ��� 29 36����default
                default:
                	System.out.println("�����쳣����������");
            }
        }
    }//����
    public static void main(String[] args) {

    App();


  }
}