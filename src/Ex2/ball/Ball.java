package Ex2.ball;

public class Ball {
    public static void main(String[] args) {}
    private double x = 0.0, y = 0.0;
    public Ball(double x, double y){}
    public Ball(){}
    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}
    public double getX(){return x;}
    public double getY(){return y;}

    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp)
    {
           if (this.x < xDisp && this.y < yDisp )
           {
               this.x += xDisp; this.y += yDisp;
           }
           else if (this.x == xDisp && this.y == yDisp)
           {
               this.x-= 3; this.y -= 5;
           }
           else if (this.x >= xDisp || this.y>= yDisp){
               this.x -= xDisp;
               this.y -= yDisp;
           }

    }
    public String toString(){return "X =  "+ x + "; Y = "  + y;}
}
