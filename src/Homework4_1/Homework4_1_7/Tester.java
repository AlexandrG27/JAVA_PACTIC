package Homework4_1.Homework4_1_7;
public class Tester
{
    public static void main(String[] args) {
        learner[] arr={ new Schoolboy("Бедрединов", "Роман", 4),
                new Student("Заволокин", "Иван", 2),
                new Student("Бедрединова", "Андрей", 2),
                new Schoolboy("Демехин", "Жора",7 ),
                new Schoolboy("Азарян", "Давид",8 ),
                new Student("Пупкин", "Василий", 4),
        };
        System.out.println("Студенты");
        for(learner learn:arr)
        {
            if (learn instanceof Student)
            {
                System.out.println(learn.toString());
            }
        }
        System.out.println("Школьники");
        for(learner learn:arr)
        {
            if (learn instanceof Schoolboy)
            {
                System.out.println(learn.toString());
            }
        }
    }
}