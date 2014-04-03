/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javahafta8;

import java.util.Scanner;

/**
 *
 * @author sakkas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        duplicateElimination();
    }
    public static void duplicateElimination()
    {
        Scanner input=new Scanner(System.in);
        int i=0;
        double array[]={0,0,0,0,0};
        int value;
        do{
            System.out.print("Enter value "+(i+1)+":");
           value=input.nextInt();
           if(value >=10 &&value<100)
           {
               if(!isArrayContainsValue(array, value))
               {
                   array[i++]=value;
                   System.out.println(value);
               }
               else
               {
                   System.out.println(value+ " is already in the list. Please enter a different value");
               }
           }
           else
                System.out.println("Please enter a value in range 10 to 100");
        
        }while(i<5);
    }
    public static Boolean isArrayContainsValue(double array[],int value)
    {
        for(int i=0;i<array.length;i++)
            if(array[i]==(double)value)
                return true;
        return false;
    }
    
}
