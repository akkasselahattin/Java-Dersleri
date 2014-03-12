/**
 * 
 */

/**
 * @author sakkas
 *
 */
public class Square {

	private double length;
	/**
	 * Default constructor
	 * Kenar uzunlugu 0 olarak atanir. 
	 */
	public Square() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return Karenin bir kenarinin uzunlugunu dondurur
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @param Bir reel sayi alip bunu karenin bir kenar uzunlugu olarak atar.
	 * Gelen parametre degeri 0dan kucukse 0 atanir.
	 */
	public void setLength(double length) {
		if(length<0)
			this.length=0;
		else
			this.length = length;
	}
	/**
	 * 
	 * @return Karenin alanini dondurur.
	 * 
	 */
	public double getArea(){
		return Math.pow(length, 2);
	}
	/**
	 * @return Karenin cevresini dondurur.
	 */
	public double getPerimeter(){
		return 4*length;
	}
	/**
	 * 
	 * @param Square nesnesi alir
	 * @return Alanlar esitse 0, karenin alani buyukse 1,
	 * dairenin alani buyukse -1 dondurur
	 */
	public int CompareArea(Circle circle){
		if(circle.getArea()==getArea())
			return 0;
		else if (circle.getArea()<getArea())
			return 1;
		else return -1;
	}

}
