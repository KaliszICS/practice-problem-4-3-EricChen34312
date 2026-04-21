class Rectangle{
	double length;
	double width;

	//Constructors
	public Rectangle(){
		this.length = 4;
		this.width = 8;
	}

	public Rectangle(double length){
		this.length = length;
		this.width = 8;
	}

	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	//Getters

	public double getWidth(){
		return this.width;
	}

	public double getLength(){
		return this.length;
	}
}

class Chair{
	int legs;
	String material;

	public Chair(){
		this.legs = 4;
		this.material = "wood";
	}

	public Chair(int legs){
		this.legs = legs;
		this.material = "wood";
	}

	public Chair(int legs, String material){
		this.legs = legs;
		this.material = material;
	}

	public int getLegs(){
		return this.legs;
	}

	public String getMaterial(){
		return this.material;
	}
}