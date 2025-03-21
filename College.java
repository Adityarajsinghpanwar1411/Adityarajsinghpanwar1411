class College {
	public static void main(String[] args) {

		Student s1 = new Student(); 
		System.out.println("\ns1 object details");
		System.out.println(s1);
		System.out.println();

		Student s2 = new Student(102, "Aditya", "SDE", 100000, 5.9, 70);
		System.out.println("\ns2 object details");
		System.out.println(s2);
	}
	
}

