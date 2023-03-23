package Practice_10X.Homework10_2;
public class Student
{
    private String name;
    private String sname;
    private String spec;
    private int kurs;
    private int group;

    public Student(String name, String sname, String spec, int kurs, int group)
    {
        this.name = name;
        this.sname = sname;
        this.spec = spec;
        this.kurs = kurs;
        this.group = group;
    }
    public String getName() {return name;}
    public String getSname() {return sname;}
    public String getSpec() {return spec;}
    public int getKurs() {return kurs;}
    public int getGroup() {return group;}
    public void setName(String name) {this.name = name;}
    public void setSname(String sname) {this.sname = sname;}
    public void setSpec(String spec) {this.spec = spec;}
    public void setKurs(int kurs) {this.kurs = kurs;}
    public void setGroup(int group) {this.group = group;}
    public String toString()
    {
        return "Студент: " + " Имя - " + name + ", Фамилия - " + sname + ", Специальность - " + spec + ", Курс - " + kurs + ", Группа - " + group;
    }
}
