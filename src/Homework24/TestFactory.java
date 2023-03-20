package ru.mirea.lab1.Homework24;
import ru.mirea.lab1.Homework24.ChairFactory;
import ru.mirea.lab1.Homework24.SuperChair;
import ru.mirea.lab1.Homework24.Chair;

public class TestFactory {
    public static void main(String[] args) {

        SuperChair MChair = ChairFactory.getChair("Универсальный", "Пластмасс", "Колесики","Прямая");
        SuperChair VChair = ChairFactory.getChair("Викторианский", "Дерево и ткань", "Изогнутые","Закругленная");
        SuperChair MagicChair = ChairFactory.getChair("Магический", "Пух кашмирской козы", "Левитируют", "По желанию");
        System.out.println(MagicChair);
        Seat(MagicChair);
    }

    public static void Seat(SuperChair ch)
    {

    }

}
