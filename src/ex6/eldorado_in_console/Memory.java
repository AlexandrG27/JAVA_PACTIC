package ex6.eldorado_in_console;
import java.util.Objects;
public class Memory extends Computer
{
    private String Memory;

    public Memory(String memory) {
        Memory = memory;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memory memory = (Memory) o;
        return Objects.equals(Memory, memory.Memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Memory);
    }
}
