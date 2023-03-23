package Practice_13X.Part_3;
public class main
{
    public static void main(String[] args)
    {

        Shirt[] shirt=new Shirt[11];
        String[] shirts = { "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L", "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M","S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL","S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L", "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S","S011,Maroon Polo Shirt,Maroon,S"};
        for (int i=0; i<11;i++)
        {
            String part1="";
            String part2="";
            String part3="";
            String part4="";
            String[] text=shirts[i].split(",");
            part1 = text[0];
            part2 = text[1];
            part3 = text[2];
            part4 = text[3];
            shirt[i]=new Shirt(part1,part2,part3,part4);
        }
        for (Shirt sh:shirt)
        {
            System.out.println(sh.toString());
        }
    }
}
