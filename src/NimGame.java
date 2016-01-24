import java.util.HashMap;
import java.util.HashSet;

public class NimGame {

	public NimGame() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NimGame.isHappy(19));
	}
	
    public static boolean isHappy(int n) {
        int original = n;
        HashSet<Integer> visited = new HashSet<Integer>();
        do{
            visited.add(new Integer(n));
            int sum = 0;
            while(n > 10){
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            sum += n*n;
            n = sum;
        }while(n != 1 && !visited.contains(new Integer(n)));
        
        return n==1;
    }

}
