class Student extends Person {
	
	private int    sno;
	private String course;
	private double fee;

	Student(){
		super(null, 0.0, 0.0);
		
		System.out.println("Student class no-param constructor is executed");
		System.out.println("All properties are inititalized with default values");
	}

	Student(int sno, String name, String course, double fee, double height, double weight){
		super(name, height, weight);

		this.sno	= sno;
		this.course	= course;
		this.fee	= fee;
		
		System.out.println("Student class param constructor is executed");
		System.out.println("All properties are initialized with passed values");
	}

	//setter and getter methods
	

	
	//blogic methods



	@Override
	public String toString() {
		return	super.toString()			+"\n" +
				("  sno\t\t: "   + sno)		+"\n"+
				("  course\t: "  + course)	+"\n"+
				("  fee\t\t: "   + fee)	;
	}
}
