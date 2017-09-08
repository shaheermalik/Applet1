
import java.awt.Graphics;
import javax.swing.JApplet;
/**
 Purpose:To make a program to make tic tac toe table
 @author Shaheer Malik
*/    public class Applet1 extends JApplet{
      public void paint(Graphics canvas) {
              canvas.drawLine(200,50,200,600);
              canvas.drawLine(400,50,400,600);
              canvas.drawLine(50,200,600,200);
              canvas.drawLine(50,400,600,400);
              //to make grid for Tic Tac Toe
              canvas.drawLine(50,250,150,350);
              canvas.drawLine(50,350,150,250);
              //to draw x
              canvas.drawLine(450,250,550,350);
              canvas.drawLine(450,350,550,250);
              //strike through x
              canvas.drawLine(50,570,150,470);
              canvas.drawLine(50,470,150,570);
              //to draw a x
              canvas.drawOval(250,75,100,100);
              //to draw a circle
              canvas.drawOval(450,75,100,100);
              //to draw a circle
              canvas.drawOval(450,475,100,100);
              //to draw a circle
              canvas.drawOval(250,475,100,100);
              //to draw a circle
              canvas.drawLine(250,250,350,350);
              canvas.drawLine(250,350,350,250);//to draw x
      }
}


