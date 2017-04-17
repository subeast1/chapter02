package chapter02;

public class SongApp {

	public static void main(String[] args) {
		Song song1 = new Song( "좋은날", "아이유", "Real", "이민수", 2010, 3 );
		song1.show();
		
		Song song2 = new Song( "She's Baby", "지코" );
		song2.show();
		
		Song song3 = new Song( "얼굴 찌푸리지 말아요", "하이라이트" );
		song3.show();
		
	}

}
