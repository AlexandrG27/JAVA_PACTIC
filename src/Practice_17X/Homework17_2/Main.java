package Practice_17X.Homework17_2;
public class Main
{
    public static void main(String[] args)
    {
        Employee model = retiveModel();
        EmployeeView view=new EmployeeView();
        EmployeeController controller=new EmployeeController(model,view);
        controller.updateView();
    }
    private static Employee retiveModel()
    {
        Employee employee = new Employee();
        employee.setSalary(50000);
        employee.setCalendarMonth(31);
        employee.setWorkingDays(31);
        return employee;
    }
}
