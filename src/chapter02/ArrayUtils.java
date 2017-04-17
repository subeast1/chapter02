package chapter02;

public class ArrayUtils {
	
	public static double[] intToDouble( int[] src ) {
		double[] result = null;
		
		if( src == null ) {
			return result;
		}
		
		int length = src.length;
		result = new double[ length ];
		for( int i = 0; i < length; i++ ) {
			result[ i ] = src[ i ];
		}
		
		return result;
	}
	
	public static int[] doubleToInt( double[] src ) {
		int[] result = null;
		
		if( src == null ) {
			return result;
		}
		
		int length = src.length;
		result = new int[ length ];
		for( int i = 0; i < length; i++ ) {
			result[ i ] = (int)src[ i ];
		}
		
		return result;
	}

	public static int[] concat( int[] src1, int[] src2 ) {
		int[] result = null;
		int length1 = ( src1 == null ) ? 0 : src1.length;
		int length2 = ( src2 == null ) ? 0 : src2.length;
		
		if( length1 == 0 && length2 == 0 ) {
			return result;
		}
		
		int index = 0;
		result = new int[ length1 + length2 ];

		for(int i = 0; i < length1; i++  ) {
			result[ index++ ] = src1[ i ]; 
		}

		for(int i = 0; i < length2; i++  ) {
			result[ index++ ] = src2[ i ]; 
		}
		
		return result;
	}
}
