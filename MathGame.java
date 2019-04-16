/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Random;
import java.util.Scanner;

public class MathGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, correct;
        int count=0;
        Scanner input= new Scanner(System.in);
        
        Random rand= new Random();
    
        for(int i=0; i<10; i++)
        {
            x= rand.nextInt(12)+1;
            y= rand.nextInt(12)+1;
            correct= x+y;
            System.out.printf("what is %d + %d ?",x,y);
            System.out.println();
            System.out.println(" Enter your answer(number)");
            int response= input.nextInt();
            
           if (response==correct){
                System.out.println("Congratulations");
                count++;
                
           }
            else
                System.out.println("Please try again later");
        }
        if (count>=8)
            System.out.printf("Congratulation you have answered %d questions right",count);
            else 
              System.out.printf("Numbers of correct answer %d", count);
        
        
        
    }
}
    
