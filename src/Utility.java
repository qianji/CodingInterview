
public class Utility {

	public Utility() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =2123;
		int b = NegativeOf(a);
		System.out.println(b);

	}
	
	public static int NegativeOf(int a){
 		for(int i = 0; i<31; i++){
			 a = a ^ (1 << i);
		}
		a = a+1;
		return a ^ (1 << 31);
	}

}
