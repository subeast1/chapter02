package person;

public class PersonTest {

	public static void main(String[] args) {

		Person p2 = new Student( "CS" );
		Person p3 = new Student( "안대혁", "CS" );

		Student s = new Student();
		
		// up casting ( 암시적 )
		Person p = s;
		p.setName( "둘리" );
		
		//down casting (명시적)
		Student s2 = (Student)p;
		s2.setMajor( "CS" );
		
		((Student)p).setMajor( "P" );
	}

}
