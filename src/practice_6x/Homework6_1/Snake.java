package Practice_6X.Homework6_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Snake
{
    public static List <Integer> historyX=new ArrayList<>();
    public static List <Integer> historyY=new ArrayList<>();
    public static List <String> command=new ArrayList<>();
    private static List<Body> listSnake=new ArrayList<>();
    private static int delay=20;
    public static int getDelay()
    {
        return delay;
    }
    public static void setDelay(int delay)
    {
        Snake.delay = delay;
    }
    public static void addHistoryX(int x)
    {
        historyX.add(x);
    }
    public static void addHistoryY(int y)
    {
        historyY.add(y);
    }
    public static void addCommand(String com)
    {
        command.add(com);
    }
    public static void setList(Body body)
    {
        listSnake.add(body);
    }
    public static Body getLastBody()
    {
        return listSnake.get(listSnake.size()-1);
    }
    public static Body getHeadBody()
    {
        return listSnake.get(0);
    }
    public static int xHead()
    {
        return listSnake.get(0).getX();
    }
    public static int yHead()
    {
        return listSnake.get(0).getY();
    }
    public  static void move()
    {
        int x = 0;
        int y = 0;
        for (int i = 0; i < listSnake.size(); i++)
        {
            if (listSnake.get(i).getX()>=500)
            {
                listSnake.get(i).setX(-29);
            }
            if (listSnake.get(i).getX()<=-30)
            {
                listSnake.get(i).setX(499);
            }
            if (listSnake.get(i).getY()<=-30)
            {
                listSnake.get(i).setY(499);
            }
            if (listSnake.get(i).getY()>=500)
            {
                listSnake.get(i).setY(-29);
            }
            if (i == 0)
            {
                x = listSnake.get(i).getX() + MovablePoint.getX();
                y = listSnake.get(i).getY() + MovablePoint.getY();
                listSnake.get(i).setX(x);
                listSnake.get(i).setY(y);
                MovablePoint.setCountStep(1);
            }
            else {
                if (i>1)
                {
                    if((((listSnake.get(i).getY()+20>Snake.yHead())&&((listSnake.get(i).getY()-20<Snake.yHead())))&&((listSnake.get(i).getX()+20>Snake.xHead())&&((listSnake.get(i).getX()-20<Snake.xHead())))))
                    {
                        System.out.println("Game Over");
                        listSnake.clear();
                        command.clear();
                        historyX.clear();
                        historyY.clear();
                        MovablePoint.setX(-2);
                        MovablePoint.setY(0);
                        Eat.x=250;
                        Eat.y=255;
                        main.myFrame.exit();
                        Eat.setBoolean(false);
                        MyPanel.timer.stop();
                        main.frame.setVisible(true);
                        File file=new File("src/ru/mirea/lab1/Homework6/Homework6_1/Score");
                        try {
                            PrintWriter pw=new PrintWriter(file);
                            pw.println(-10+Body.getCountBody()*10);
                            pw.close();
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                        main.score();
                        break;
                    }
                }
                if (!command.isEmpty())
                {
                    if (listSnake.get(i).getIndex() == historyX.size())
                    {
                        x = listSnake.get(i).getX() + MovablePoint.getX();
                        y = listSnake.get(i).getY() + MovablePoint.getY();
                        listSnake.get(i).setX(x);
                        listSnake.get(i).setY(y);
                        continue;
                    }
                    if (((listSnake.get(i).getX() == historyX.get(listSnake.get(i).getIndex()))) && (listSnake.get(i).getY() == historyY.get(listSnake.get(i).getIndex()))) {
                        {
                            listSnake.get(i).setLastCommand(command.get(listSnake.get(i).getIndex()));
                            listSnake.get(i).setIndex(1);
                        }
                    }
                }
                if (listSnake.get(i).getLastCommand().equals("L"))
                {
                    x = listSnake.get(i).getX() - MovablePoint.getStep();
                    y = listSnake.get(i).getY();
                    listSnake.get(i).setX(x);
                    listSnake.get(i).setY(y);
                }
                if (listSnake.get(i).getLastCommand().equals("U"))
                {
                    x = listSnake.get(i).getX();
                    y = listSnake.get(i).getY() - MovablePoint.getStep();
                    listSnake.get(i).setX(x);
                    listSnake.get(i).setY(y);
                }
                if (listSnake.get(i).getLastCommand().equals("D"))
                {
                    x = listSnake.get(i).getX();
                    y = listSnake.get(i).getY() + MovablePoint.getStep();
                    listSnake.get(i).setX(x);
                    listSnake.get(i).setY(y);
                }
                if (listSnake.get(i).getLastCommand().equals("R"))
                {
                    x = listSnake.get(i).getX() + MovablePoint.getStep();
                    y = listSnake.get(i).getY();
                    listSnake.get(i).setX(x);
                    listSnake.get(i).setY(y);
                }
            }
        }
    }
    public static List<Body> getListSnake()
    {
        return listSnake;
    }
}
