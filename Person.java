public class Person {
	
	private String name;
	private double height;
	private double weight;

	public Person(String name, double height, double weight){

		this.name = name;
		this.height = height;
		this.weight = weight;
		
		System.out.println("Person class Param constructor is executed");
		System.out.println("Person class properties are initiaized in "+this.getClass().getName()+" object");
	}

	//setter and getter methods
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return name;	
	}
	
	public void setHeight(double height) {
		this.height = height;	
	}
	
	public double getHeight() {
		return height;	
	}
	
	public void setWeight(){
		this.weight = weight;	
	}
	
	public double getWeight() {
		return weight;	
	}
	
	//Business logic method
	void eat(){
		System.out.println(name + " is eating");	
	}
	
	void walk(){
		System.out.println(name + " is walking");	
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");	
	}
	
	//printing method
	@Override
	public String toString(){
		return	("\n  name\t\t: " + name)	+"\n"+
				("  height\t: " + height)	+"\n"+
				("  weight\t: " + weight)	;
	}
}
