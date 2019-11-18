


public class Arith_Progr {
	
	/*find the nth term of an AP by using the formula = a + (n-1) * d
	 *a = first term
	 *n= no of  terms  in series
	 *d = common difference
	 *a,a+d,a+2d,a+3d (Total no of terms)
	 *eg : a = 1, d = 2, n = 4
	 *Sum of series = 1, 1+2 , 1+2*2 , 1+3*2
	 *result will be like : 1,3,5,7
	*/
	public void get_input(int first_term, int diff, int no_of_terms){
		
		/*int sum_of_series =( first_term + (first_term + diff) + (first_term + 2*diff) + (first_term + 3*diff));
		System.out.println(sum_of_series);
		*/
		int sum_of_series = 0;
		for (int i = 0; i < no_of_terms; i++) {
			
			sum_of_series = sum_of_series + first_term;
			first_term = first_term  + diff;
			
		}
		
		System.out.println(sum_of_series );
		
	}

	public static void main(String[] args) {
		Arith_Progr ap = new Arith_Progr();
		ap.get_input(1, 2, 4);
	}

}
