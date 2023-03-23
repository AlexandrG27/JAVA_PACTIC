package Practice_13X.Part_2;
import java.util.StringTokenizer;
public class main {
    public static void main(String[] args)
    {
        String[] split_2 = new String[7];
        String stroke = "Россия, Московская область, Железнодорожная, Крупской, 65, 4, 1";
        stroke =deletSpace(stroke);
        String [] spit_1=stroke.split(",");
        String part1 = spit_1[0];
        String part2 = spit_1[1];
        String part3 = spit_1[2];
        String part4 = spit_1[3];
        String part5 = spit_1[4];
        String part6 = spit_1[5];
        String part7 = spit_1[6];
        Adress adress = new Adress(part1,part2,part3,part4,part5,part6,part7);
        System.out.println("Реализация 1: "+adress.toString());
        String stroke2 = "Россия, Московская область, Железнодорожная, Крупской, 65, 4, 1";
        stroke2=deletSpace(stroke2);
        StringTokenizer tokenizer = new StringTokenizer(stroke2,",.;");
        for (int i=0; i<7;i++)
        {
            split_2[i]=tokenizer.nextToken();
        }
        String par1 = split_2[0];
        String par2 = split_2[1];
        String par3 = split_2[2];
        String par4 = split_2[3];
        String par5 = split_2[4];
        String par6 = split_2[5];
        String par7 = split_2[6];
        Adress adress2 = new Adress(par1,par2,par3,par4,par5,par6,par7);
        System.out.println("Реализация 2: "+adress2.toString());
    }
    private static String deletSpace(String stroke)
    {
        StringBuilder text= new StringBuilder();
        for (int i=0; i<stroke.length();i++)
        {
            if ((stroke.charAt(i)==' ')&&((stroke.charAt(i-1)==',')||(stroke.charAt(i-1)=='.')||(stroke.charAt(i-1)==';')))
            {
                continue;
            }
            text.append(stroke.charAt(i));
        }
        return text.toString();
    }
}
