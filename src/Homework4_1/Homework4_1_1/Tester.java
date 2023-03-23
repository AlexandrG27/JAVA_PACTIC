package Homework4_1.Homework4_1_1;
public class Tester
{
    public static void main(String[] args)
    {
        Rectangle rectangle=new Rectangle("Прямоугольник",6,10);
        Square square=new Square("Квадрат",4,8);
        Circle circle=new Circle("Круг",13,13);
        System.out.println(square.toString());
        Shape shape=new Shape("Прямоугольник", 24,20);
        System.out.println(shape.toString());
    }
}