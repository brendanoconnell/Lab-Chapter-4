// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
            Expo.drawRectangle(g,0,100,200,300);
            Expo.drawRectangle(g,100,200,300,400);
            Expo.drawLine(g,0,100,100,200);
            Expo.drawLine(g,200,300,300,400);
            Expo.drawLine(g,0,300,100,400);
            Expo.drawLine(g,200,100,300,200);



        // DRAW TARGET 600,200
            Expo.setColor(g,Expo.black);
            Expo.fillCircle(g,600,200,125);
            Expo.setColor(g,Expo.white);
            Expo.fillCircle(g,600,200,100);
            Expo.setColor(g,Expo.blue);
            Expo.fillCircle(g,600,200,75);
            Expo.setColor(g,Expo.red);
            Expo.fillCircle(g,600,200,50);
            Expo.setColor(g,Expo.yellow);
            Expo.fillCircle(g,600,200,25);
            Expo.setColor(g,Expo.black);





        // DRAW TRIANGLE
        //Expo.drawPoint(g,650,300);
        
        Expo.drawLine(g,650,450,650,600);
        Expo.drawLine(g,575,600,725,600);
        Expo.drawLine(g,650,450,575,600);
        Expo.drawLine(g,650,450,725,600);
        Expo.drawLine(g,575,600,690,525);
        //Expo.drawLine(g,725.600,);





        // DRAW SMILEY FACE






        // DRAW JPII






    }

}


