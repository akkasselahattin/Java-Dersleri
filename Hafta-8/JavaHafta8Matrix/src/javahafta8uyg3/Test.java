/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javahafta8uyg3;

/**
 *
 * @author sakkas
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        double[][] arr={{1,0},{0,1}};
		double[][] arr2={{5  ,  -4},{2.1, 7.6}};
		Matrix m=new Matrix(5, 5);
		Matrix m2=new Matrix(arr);
		Matrix m3=new Matrix(arr2);
		m2.print();
		Matrix m4=m2.multiply(m3);
		m4.print();
		m4=m3.multiply(m3);

		m4.print();
    }
    
}
