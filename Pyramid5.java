
public class Pyramid5 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++){
			for(int k = 0; k < 0 + i; k++){
				System.out.print(" ");
			}
			for(int j = 20; j > i; j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
