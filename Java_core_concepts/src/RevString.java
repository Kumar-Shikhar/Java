
public class RevString {
	
	 static char revarray[]= new char[10] ;
	 static char revarray2[]= new char[10] ;

	public static void main(String[] args) {
		String name = "Demo";
		
		for (int i = 0; i < name.length(); i++) {
			
			char getstring = name.charAt(i);
			
			revarray[i] = getstring;	
			
			for(int j = revarray.length-1 ; j >= 0 ; j--){
				
			System.out.println(revarray[j]);
			}
			
			
		}
		

			
		}

		
		

	}


