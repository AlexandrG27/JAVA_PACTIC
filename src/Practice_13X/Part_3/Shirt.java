package Practice_13X.Part_3;
public class Shirt
{
    String id;
    String type;
    String color;
    String size;

    public Shirt(String id, String type, String color, String size) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Shirt{" + "id='" + id + '\'' + ", type='" + type + '\'' +
                ", color='" + color + '\'' + ", size='" + size + '\'' + '}';
    }
}
