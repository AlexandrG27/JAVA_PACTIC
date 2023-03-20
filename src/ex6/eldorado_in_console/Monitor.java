package ex6.eldorado_in_console;

import java.util.Objects;

public class Monitor extends Computer
{
    private String Monitor;

    public Monitor(String monitor) {
        Monitor = monitor;
    }

    public String getMonitor() {
        return Monitor;
    }

    public void setMonitor(String monitor) {
        Monitor = monitor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return Objects.equals(Monitor, monitor.Monitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Monitor);
    }
}
