package ex6.eldorado_in_console;
import java.util.Objects;
public class CPU
{
    private String cpu;

    public CPU() {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU cpu1 = (CPU) o;
        return Objects.equals(cpu, cpu1.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu);
    }
}
