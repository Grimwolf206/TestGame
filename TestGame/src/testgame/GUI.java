/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import static testgame.TestGame.consoleInput;

/**
 *
 * @author Tylor
 */
public class GUI extends JFrame implements KeyListener{
    
    
    final private int ENTER = 10;
    final private int ESCAPE = 27;
    
    
    
    public GUI() {
        this.setSize(1280,720);
        this.setLocation((1920 - this.getWidth()) / 2, (1080 - this.getHeight()) / 2);
        this.getContentPane().setBackground(Color.BLACK);
        this.setUndecorated(true);
        this.addKeyListener(this);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("advancedclasses.GUI.keyPressed(" + e.getKeyCode()+ ");");
        
        
        
        switch (e.getKeyChar()) {
            
            case ESCAPE:
                System.exit(0);
                break;
            case ENTER:
                
                break;
            default:
                consoleInput.addChar(e.getKeyChar());
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
