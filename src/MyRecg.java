import java.awt.*;
public class MyRecg {

    private Color color;
    private int x,y,x2,y2;

    public MyRecg(Color color){
        this.color = color;
    }

    public void draw(Graphics g, int upperX, int lowerX, int upperY, int lowerY){
        g.setColor(color);
        g.fillRect(upperX,lowerX,upperY,lowerY);

    }


   /* public MyRecg(Color color, int upperX, int lowerX, int upperY, int lowerY){

        this.color = color;
        this.x = upperX;
        this.y = lowerX;
        this.x2 = upperY;
        this.y2 = lowerY;

    }

     public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x,y,x2,y2);*/

     }





