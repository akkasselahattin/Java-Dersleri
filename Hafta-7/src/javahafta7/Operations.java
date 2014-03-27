/**
 * @author =Selahattin AKKAs
 * @version =0.1
 * 
 * 
 */

package javahafta7;

import java.util.Random;

/**
 *
 * @author sakkas
 */
public class Operations {
    
     public enum CoinState{HEADS, TAILS};
    
    
    /**
     *
     * @param num1
     * @param num2
     * @return true or false
     */
    public static Boolean isMultiple(int num1,int num2)
    {
        return num1%num2==0;
    }
    public static double hypotenuse(double side1,double side2)
    {
        return Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
    }
    
    /**
     * 
     * Ekrana * ile kare çizdirir
     * 
     *
     * @param n:bir satirdaki * sayisi */
    public static void squareOfAsterisks(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
                System.out.print("*");
            System.out.println("");
        }
    }
    
    /**
     *
     * @param num: ters cevirilecek sayi
     * @return verilen sayinin ters cevirilmis hali
     */
    public static int reverseDigits(int num)
    {
        int reversed=0;
        while(num>0){
            reversed=reversed*10+num%10;
            num=num/10;
        }
        return reversed;
    }
    public static CoinState flip()
    {
        Random r=new Random();
        if(r.nextInt(2)==0)
            return CoinState.HEADS;
        else
            return CoinState.TAILS;
    }
    
    
}
