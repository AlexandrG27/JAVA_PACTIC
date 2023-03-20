package ru.mirea.lab1.Homework25.Homework25_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static String answer="";
    public static int index=0;
    public static boolean correct=true;

    public static void main(String[] args) {

        String temp = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Введите выражения через пробел. Пример (((24-2)+43-(32+1))/(43-43)+4) (43+)-32 ((34+1) (3+2) (21-32)*1)");

        String line = input.nextLine();
        line += " ";

        for (int i = 0; i < line.length(); i++) {

            if (line.charAt(i) != ' ')
            {
                temp += line.charAt(i); // Отделяем выражение
            }

            if (line.charAt(i) == ' ') // Когда встречается символ пробела, начинаем обработку выражения
            {
                expression(temp);

                if(correct)             // Если выражение верно, записываем его в переменную answer
                    answer+=temp+';'+' ';

                temp=""; //Обнуляем переменную temp, для записи нового выражения
                index=0; // Обнуляем индекс
            }
        }
        if (answer.length()!=0) // Если есть верные выражения, выводим их на экран
            System.out.println("Правильные выражения: "+answer);
    }

    public static void expression(String temp) // Обработка выражения
    {
        String bufLine="";

        for (; index<temp.length(); index++)
        {
            if (temp.charAt(index)=='(') //Если скобка открывается, начнем проверку выражения в скобках
            {
                index++;
                bufLine+=staples(temp); // В переменную bufLine запишем результат функции обработки выражения в скобках.  0 или "а" см. ниже
                continue;
            }

            bufLine+=temp.charAt(index); // По символьно записываем выражение

        }

        var test = Pattern.compile("^(\\d+[^\\w]){1,}\\d+$").matcher(bufLine); // Верно когда так: a+b...+n

        if ((test.find())||(bufLine.equals("0"))) // Если bufLine после обработки выглядит так 0+1, т.е. было (1+1)+1, то верно
            correct=true;

        //Если bufLine после обработки выглядит так a+1, т.е. было ((1+1)+1 (или другое не верное выражение), то неверно
        else
        {
            index=0;
            correct=false;
        }

    }
    public static String staples(String temp)  // Проверка верности выражения в скобках
    {
        String bufLine = "";

        for(; index<temp.length();index++)
        {
            if (temp.charAt(index)=='(') // Если обнаружена еще одна открытая скобка, еще раз запускаем функцию проверки.
                                            // Значит изначальное выражение выглядит как то так ((1+1)+2)
            {
                index++;
                bufLine+=staples(temp); // На данном этапе выражение будет выглядеть так: если оно верно (0+2) или (a+2), если не верно

                if (index!=temp.length()-1)
                    index++;

            }

            if (temp.charAt(index)==')') // Когда скобка закрывается с помощью регулярного выражения проверяем верность выражения
            {
                var test = Pattern.compile("^(\\d+[^\\w]){1,}\\d+$").matcher(bufLine); // Верно когда так: a+b...+n

                if (test.find()) //Если выражение верно, возвращаем 0. Таким образом всё выражение в скобках будет равно 0, т.е (1+1)+1 = 0+1
                    return "0";
                else
                {
                    return"a"; // Если выражение не верно, возвращаем букву "а". Это нужно для того чтобы потом выражение не прошло проверку
                }
            }
            bufLine+=temp.charAt(index); // По символьно записываем выражение в скобках
        }
        return  "a"; // Если цикл завершился, значит закрытая скобка не была обнаружена. Возвращаем "а", чтобы потом выражение не прошло проверку
    }
}