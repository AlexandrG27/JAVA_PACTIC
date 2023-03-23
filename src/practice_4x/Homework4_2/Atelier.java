package Practice_4X.Homework4_2;
public class Atelier {
    public static void main(String[] args)
    {
        Clothes[] clothes={
                new TShirt(Size.L,800,"Черный"),
                new Pants(Size.XS,1200,"Желтый"),
                new Tie(Size.S,500,"Синий"),
                new Skirt(Size.M,1999,"Красный")
        };
        dressWomen(clothes);
        dressMan(clothes);
    }
    public static void dressWomen(Clothes[] clothes)
    {
        System.out.println("Женская одежда:");
        for (Clothes cloth:clothes)
        {
            if (cloth instanceof WomenClothing)
            {
                System.out.println(cloth);
            }
        }
    }
    public static void dressMan(Clothes[] clothes)
    {
        System.out.println("Мужская одежда:");
        for (Clothes cloth:clothes)
        {
            if (cloth instanceof MenClothing)
            {
                System.out.println(cloth);
            }
        }
    }
}