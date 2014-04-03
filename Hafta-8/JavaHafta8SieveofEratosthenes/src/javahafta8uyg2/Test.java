/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javahafta8uyg2;

/**
 *
 * @author sakkas
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean prime[]=new Boolean[1000];
        for (int i = 0; i < prime.length; i++)//Diziyi true ile doldurma
            prime[i]=true;
        for (int i = 2; i < prime.length; i++)
            if(prime[i])//i. eleman asal ise
                for (int j = i+i; j<prime.length; j+=i)//i. elemamin katlari false yapilir 
                    prime[j]=false;
       
        for (int i = 2; i < prime.length; i++)//Ekrana yazdirma
            if(prime[i])
                System.out.println(i);


        
    }
    
}
