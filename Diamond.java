
public class Diamond{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		System.out.println("The Number you want to input: " + n);
		
		//This is the code for triangle
		/*for(int i=0; i < n; i++){
			for(int j=0; j<=i; j++) System.out.print("*");
		System.out.print("\n");
		}*/

		//This is the code for diamond
		for(int i = 0; i < n; i++){
			for(int j = n+1; j > i; j--) System.out.print(" ");
			for(int k = 0; k <= i; k++){
			System.out.print("*");
			System.out.print(" ");
			}
			System.out.print("\n");
		}
		for(int i = n+1; i <= 2*n-1; i++){
			for(int j = 0;  j <= i-n+1; j++) System.out.print(" ");
			for(int k = 2*n-i-1; k >=0 ; k--){
			System.out.print("*");
			System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}