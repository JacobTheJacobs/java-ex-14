
/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point
{
    private double x;
    private double y;

    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public Point(Point other){
        x=other.x;
        y=other.y;
    }

    public void setX(double num){
        this.x= num;
    }

    public void setY(double num){
        this.y= num;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String toString() { 
        return "(" + x + " , " + y + ")"; 
    }

    public boolean equals(Point other) {
        if(this.x==other.getX() && this.y==other.getY()){
            return true;
        }
        return false; 
    }

    public boolean isAbove(Point other) {
        if(this.y>other.getY()){
            return true;
        }
        return false; 
    }

    public boolean isUnder(Point other) {
        if(!isAbove(other)){
            return true;
        }
        return false; 
    }

    public boolean isLeft(Point other) {
        if(this.x<other.getX()){
            return true;
        }
        return false; 
    }

    public boolean isRight(Point other) {
        if(!isLeft(other)){
            return true;
        }
        return false; 
    }

    public double distance(Point p) {
        double yDist=Math.pow(p.getY()-this.y,2);
        double xDist= Math.pow(p.getX()-this.x,2);
        double value= Math.sqrt(yDist+xDist);
        return (double)Math.round(value * 100d) / 100d;
    }

    public void move(double dx,double dy){
        this.x+=dx;
        this.y+=dy;

    }

}
