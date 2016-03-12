/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame;

import java.awt.Color;
import javax.swing.JLabel;
import static testgame.TestGame.consoleGui;

/**
 *
 * @author Tylor
 */
public class ConsoleInput extends JLabel{
    
    String input = null;
    
    public ConsoleInput() {
        input = "";
        this.setSize(consoleGui.getWidth() - 20, 24);
        this.setLocation(10,consoleGui.getHeight() - 34);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
    }

    void addChar(char keyChar) {
        input = input + keyChar;
        System.out.println(input);
        updateGui();
    }
    
    private void updateGui() {
    }
    
}
