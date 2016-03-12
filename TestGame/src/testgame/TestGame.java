/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame;

/**
 *
 * @author Tylor
 */
public class TestGame {

    public static GUI consoleGui;
    public static ConsoleInput consoleInput;
    
    public static void main(String[] args) {
        consoleGui = new GUI();
        consoleInput = new ConsoleInput();
        
        consoleGui.add(consoleInput);
    }
    

}

