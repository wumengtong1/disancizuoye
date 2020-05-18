package wumengtong;
public class Student {
    private int ID;
    private String name=null;//学生姓名 private String name 11
    private String birDate=null;//学生生日private String birDate 11
    private boolean gender=true;//学生性别，true为男 private boolean gender 11

    public int getID() {return ID; }//获取学号

    public void setID(int ID) {this.ID = ID; }//设置学号

    public String getBirDate() {return birDate;}//获取生日

    public void setBirDate(String birDate) {this.birDate = birDate;}//设置生日

    public boolean isGender() {return gender;}

    public void setGender(boolean gender) {this.gender = gender;}//设置性别

    public String getName() {return name;}//获得姓名

    public void setName(String name) {this.name = name; }//设置姓名
}


