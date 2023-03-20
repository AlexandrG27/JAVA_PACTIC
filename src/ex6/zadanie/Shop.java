package ex6.zadanie;

import java.util.Objects;

public class Shop implements Printable
{
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("Printing Shop " + getName());
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }
}
