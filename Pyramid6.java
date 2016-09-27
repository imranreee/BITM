
public class Pyramid6 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 20; i++){
			for(int k = 0; k < 20 - i; k++){
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 20; i++){
			for(int k = 0; k < 1 + i; k++){
				System.out.print(" ");
			}
			for(int j = 19; j > i; j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
