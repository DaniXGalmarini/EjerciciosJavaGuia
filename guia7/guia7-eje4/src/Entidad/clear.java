/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**

 */
public class clear {
public static void limpiarpantalla() throws AWTException {
    Robot robot = new Robot();
    
    robot.delay(1100);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_L);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_L);
}
}
