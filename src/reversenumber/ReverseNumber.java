/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversenumber;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String num=JOptionPane.showInputDialog("Enter a number > 9 to find its reverse");
       
       Integer number=Integer.parseInt(num);
        
        Integer reverse=0;
        
        while(number>0)
            
        {
            int remender=number%10;
            
            reverse=reverse*10+remender;
            
            number=number/10;
        }
        JOptionPane.showMessageDialog(null,"Reverse of given number is  "+reverse);
    }
    
}
