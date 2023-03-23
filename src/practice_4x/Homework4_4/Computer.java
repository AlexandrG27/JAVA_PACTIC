package Practice_4X.Homework4_4;
public class Computer
{
    private brand name;
    private Monitor monitor;
    private CPU cpu;
    private Memory memory;
    public Computer(brand name,Memory memory, Monitor monitor, CPU cpu)
    {
        this.memory = memory;
        this.monitor = monitor;
        this.cpu = cpu;
        this.name=name;
    }
    @Override
    public String toString()
    {
        return "Computer" +"\n"+ "Brand: " + name +"\n" + monitor +"\n"+ cpu  +"\n"+ memory;
    }
}
