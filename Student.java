package wumengtong;
public class Student {
    private int ID;
    private String name=null;//ѧ������ private String name 11
    private String birDate=null;//ѧ������private String birDate 11
    private boolean gender=true;//ѧ���Ա�trueΪ�� private boolean gender 11

    public int getID() {return ID; }//��ȡѧ��

    public void setID(int ID) {this.ID = ID; }//����ѧ��

    public String getBirDate() {return birDate;}//��ȡ����

    public void setBirDate(String birDate) {this.birDate = birDate;}//��������

    public boolean isGender() {return gender;}

    public void setGender(boolean gender) {this.gender = gender;}//�����Ա�

    public String getName() {return name;}//�������

    public void setName(String name) {this.name = name; }//��������
}


