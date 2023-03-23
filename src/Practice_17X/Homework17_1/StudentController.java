package Practice_17X.Homework17_1;
public class StudentController
{
    private Student model;
    private StudentView view;
    public StudentController(Student model, StudentView view)
    {
        this.model=model;
        this.view=view;
    }
    public void getRollName(String rolname)
    {
        model.setRollNo(rolname);
    }
    public void getName(String name)
    {
        model.setName(name);
    }
    public String getRolName()
    {
        return model.getName();
    }
    public String getName()
    {
        return model.getName();
    }
    public void updateView() { }
}
