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
public class Matrix {

    private double matrixArray[][];

    /**
     *
     * @param array: 2 boyutlu double turunde dizi
     */
    public Matrix(double[][] array) {
        matrixArray = array.clone();
    }

    /**
     *Bir matris alarak onun aynisi olacak sekilde bir matris olusturur.
     * @param matrix:
     */
    public Matrix(Matrix matrix) {
        matrixArray = matrix.matrixArray.clone();
    }

    /**
     * Parametre olarak alinan satir ve sutun sayisina gore bos bir matris olusturulur. (Ici 0 dolu)
     * @param row : satir sayisi
     * @param col : sutun sayisi
     */
    public Matrix(int row, int col) {
        matrixArray = new double[row][col];
    }


    /**
     *Satir sutun indisleri alinarak o indisteki deger degistirilir.
     * @param row : satir
     * @param col : sutun
     * @param val : yeni deger
     */
    public void setElement(int row, int col, double val) {
        matrixArray[row][col] = val;
    }

    /**
     *Parametre olarak alinan indisteki deger dondurulur
     * @param row : satir 
     * @param col : sutun
     * @return
     */
    public double getElement(int row, int col) {
        return matrixArray[row][col];
    }

    /**
     *
     * @return matrisin satir sayisi
     */
    public int getRowCount() {
        return matrixArray.length;
    }

    /**
     *
     * @return matrisin sutun sayisi
     */
    public int getColumnCount() {
        return matrixArray[0].length;
    }

    /**
     *Verilen dizi ile matris toplanarak sonuc dondurulur
     * @param array : 2 boyutlu double dizi
     * @return Matrix: sonuc matrisi
     */
    public Matrix add(double array[][]) {
        if (matrixArray.length == array.length && matrixArray[0].length == array[0].length) {
            Matrix mat = new Matrix(getRowCount(), getColumnCount());
            for (int i = 0; i < getRowCount(); i++) {
                for (int j = 0; j < getColumnCount(); j++) {
                    mat.matrixArray[i][j] = matrixArray[i][j] + array[i][j];
                }
            }
            return mat;
        }
        return null;

    }

    /**
     * Verilen dizi ile matris sonucu carpilip sonuc yeni bir matris olarak dondurulur
     * @param array : 2 boyutlu double dizi
     * @return Matrix: sonuc matrisi
     */
    public Matrix multiply(double array[][]) {

        if (getColumnCount() != array.length) {
            return null;
        }
        Matrix mat = new Matrix(getRowCount(), array[0].length);
        for (int i = 0; i < getRowCount(); i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array.length; k++) {
                    mat.matrixArray[i][j] += matrixArray[i][k] * array[k][j];
                }
            }
        }
        return mat;

    }

    /**
     *Verilen matris ile matrisin sonucu carpilarak yeni bir matris olarak dondurulur.
     * @param matrix: Matrix sinifinin bir nesnesi
     * @return Matrix: sonuc matrisi
     */
    public Matrix multiply(Matrix matrix) {
        return multiply(matrix.matrixArray);
    }

    /**
     *Verilen matris ile matrisin sonucu toplanarak yeni bir matris olarak dondurulur.
     * @param matrix: Matrix sinifinin bir nesnesi
     * @return Matrix: sonuc matrisi
     */
    public Matrix add(Matrix matrix) {
        return add(matrix.matrixArray);
    }

    /**
     * Matrisin degerleri ekrana yazdirilir
     */
    public void print() {
        // System.out.print("[");
        for (int i = 0; i < getRowCount(); i++) {
            for (int j = 0; j < getColumnCount(); j++) {
                System.out.printf("%+4.2f ",matrixArray[i][j] );
            }
            System.out.println("");

        }
        System.out.println("");
    }

}
