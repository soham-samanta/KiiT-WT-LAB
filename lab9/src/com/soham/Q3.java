package com.soham;

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
/*
<applet code="Q3" width=300 height=200>
</applet>
*/

public class Q3 extends JApplet{
  public void init(){
          // set size
          setSize(400, 400);
          repaint();
      }

      // paint the applet
      public void paint(Graphics g){
          // set Color for rectangle
          g.setColor(Color.red);

          // draw a rectangle
          g.drawRect(100, 100, 150, 100);

          // Fill Colour a rectangle
          g.fillRect(100, 100, 150, 100);
      }
}