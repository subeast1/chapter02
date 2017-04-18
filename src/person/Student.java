package person;

public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println( "Student() called" );
	}
	
	public Student( String major ) {
		System.out.println( "Student(String major) called" );
		this.major = major;
	}
	
	public Student( String name, String major ) {
		super( name );
		this.major = major;
//		setName( name );
		System.out.println( "Student(String name, String major) called" );
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}


}
