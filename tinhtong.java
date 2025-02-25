package nhapmon;
import java.util.Scanner;
public class tinhtong {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Nhập N: ");
	        int N = scanner.nextInt();
	        
	        int S = 0;
	        for ( int i =1 ; i<=N; i++) {
	        	String NN = "" + i + i;
	        	S += Integer.parseInt(NN);
	        }
	        System.out.println("Tổng S = " + S);

	        scanner.close();
	      
	    }
	}
