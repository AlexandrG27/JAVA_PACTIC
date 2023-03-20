package ru.mirea.lab1.Homework17.Homework17_2;

public class Main {
    public static void main(String[] args) {

        Employee model = retiveModel();
        EmployeeView view=new EmployeeView();

        EmployeeController controller=new EmployeeController(model,view);

        controller.updateView();
    }

    private static Employee retiveModel() {

        Employee employee = new Employee();

        employee.setSalary(50000); //Размер оклада
        employee.setCalendarMonth(31); // Количество календарных дней
        employee.setWorkingDays(31); // Количество отработанных дней
        return employee;
    }
}
