package com.soham;

import java.applet.Applet;
import java.awt.Graphics;
 
/*
<applet code="Q1" width=300 height=200>
</applet>
*/
 
public class Q1 extends Applet{
    public void paint(Graphics g){
        g.drawString("Roll Number : 20051107", 10, 20);
        g.drawString("Name: Soham Samanta", 10, 40);
        g.drawString("Branch: Computer Science & Engineering", 10, 60);
        g.drawString("Section: CS-18", 10, 80);
    }  
}