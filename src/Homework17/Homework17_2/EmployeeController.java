package ru.mirea.lab1.Homework17.Homework17_2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setSalary(int salary)
    {
        model.setSalary(salary);
    }

    public void setCalendarMonth(int cm)
    {
        model.setCalendarMonth(cm);
    }

    public void setWorkingDays(int wd)
    {
        model.setWorkingDays(wd);
    }

    public int getSalary()
    {
        return model.getSalary();
    }

    public int getCalendarMonth()
    {
        return model.getCalendarMonth();

    }

    public int getWorkingDays()
    {
        return model.getWorkingDays();
    }

    public void updateView()
    {
        view.printWages(model.getSalary(), model.getCalendarMonth(), model.getWorkingDays());
    }
}
