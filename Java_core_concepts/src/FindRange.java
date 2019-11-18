
public class FindRange {
	
	
/** -2^N-1 TO +2^N-1 -1
N = number of bits.
first convert byte = bits for find range.
1 BYTE = 8 BITS
eg ..
byte = 1 byte = 1*8 bits.
-2^8-1 to +2^8-1
-128 to +127 for byte.

for short 
2 byte = 2*8 = 16bits
-2^16-1 to +2^16-1 -1
-32768 to 32767 for short

**/
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE +  " " +Integer.MAX_VALUE);
		System.out.println(Character.MIN_VALUE + " " +Character.MAX_VALUE );
		System.out.println(Long.MIN_VALUE + " " +Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE + " " +Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + " " +Double.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

	}

}
