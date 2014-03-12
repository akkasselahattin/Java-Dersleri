
public class Circle {
	private double radius;

	/**
	 * @param yaricapi parametre olarak alir.
	 * Yaricapi degistirir.
	 * Gelen parametre 0dan kucukse 0 atanir.
	 */
	public void setRadius(double radius) {
		if(radius<0)
			this.radius=0;
		else
			this.radius = radius;
	}
	
	/**
	 * @return yaricapi dondurur.
	 */
	public double getRadius() {
		return radius;
	}


	/**
	 * Default constructor: yaricap 0.0 atanir
	 */
	public Circle()
	{
		
	}

	/**
	 * @param radius
	 * Yaricapi parametre olarak alir.
	 */
	public Circle(double radius) {
		this.setRadius(radius);
	}
	/**
	 * @return dairenin alanini dondurur.
	 */
	public double getArea()
	{
		return Math.PI*Math.pow(radius, 2);
		//return Math.PI*radius*radius
	}
	/**
	 * 
	 * @return dairenin cevresini dondurur.
	 */
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	/**
	 * 
	 * @param Square nesnesi alir
	 * @return Alanlar esitse 0, dairenin alani buyukse 1,
	 * karenin alani buyukse -1 dondurur
	 */
	public int CompareArea(Square square){
		if(square.getArea()==getArea())
			return 0;
		else if (square.getArea()<getArea())
			return 1;
		else return -1;
	}
	
	
}
