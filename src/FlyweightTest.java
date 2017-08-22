import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.lang.*;

public class FlyweightTest extends JFrame {

    JButton  startDrawingButton;

    int windowWith = 1750;
    int windowHeight = 150;


    Color[] shapeColor = {Color.orange, Color.blue, Color.cyan, Color.PINK, Color.yellow, Color.GRAY,Color.green};


    public static void main(String[] args){

        new FlyweightTest();


    }

    public FlyweightTest(){

        this.setSize(windowWith, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();
        startDrawingButton = new JButton("Button 1");
        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawingButton, BorderLayout.SOUTH);

        //Start drawing when the button hit by action listener

        startDrawingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Graphics g = drawingPanel.getGraphics();

                //measure how long it takes

                long startTime = System.currentTimeMillis();

                for(int i =0; i<100000; ++i ){

                   /* g.setColor(getRandColor());
                    g.fillRect(getRandX(),getRandY(),getRandX(),getRandY()); */

                  /* MyRecg myRecg = new MyRecg(getRandColor(), getRandX(),getRandY(),getRandX(),getRandY());
                   myRecg.draw(g); */

                  MyRecg rect =  RectFactory.getRect(getRandColor());
                  rect.draw(g, getRandX(),getRandY(), getRandX(), getRandY());


                }

                long endTime = System.currentTimeMillis();
                System.out.println("It took " + ( endTime-startTime ));

            }
        });


      this.add(contentPane);
      this.setVisible(true);

    }


    private Color getRandColor(){

        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(6);
        return shapeColor[randInt];
    }

    private int getRandX(){ return (int) (Math.random()* windowWith);}
    private int  getRandY(){ return (int) (Math.random() * windowHeight);}

}
