package ru.mirea.lab1.Homework22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите выражение: ");

        String str = input.nextLine();
        System.out.println("Ответ: "+ stack(str));

        Form form = new Form();
        form.setVisible(true);

    }

    static double stack(String str)
    {
        SimpleStack stack=new SimpleStack();
        for (int i=0; i<str.length(); i++)
        {
            if ((str.charAt(i)!='*')&&(str.charAt(i)!='+')&&(str.charAt(i)!='-')&&(str.charAt(i)!='/'))
            {
                stack.push(str.charAt(i)-'0');
            }
            else
            {
                double b = stack.pop();
                double a = stack.pop();

                if (str.charAt(i)=='*')
                {
                    stack.push(a*b);
                    continue;
                }

                if (str.charAt(i)=='+')
                {
                    stack.push(a+b);
                    continue;
                }

                if (str.charAt(i)=='-')
                {
                    stack.push(a-b);
                    continue;
                }

                if (str.charAt(i)=='/')
                {
                    stack.push(a/b);

                }
            }
        }
        return stack.getStack();
    }

}
