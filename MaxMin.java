
public class MaxMin {

	public static void main(String[] args) {
		
		int [] number = {-27, 0, 67, 25, 5000, 85, -96};
		int max = number[0], min = number[0];
		
		for (int i:number) {
			if(max < i) {
				max = i;
			}
			if(min > i) {
				min = i;
			}
		}
		System.out.println("Max value: "+max);
		System.out.println("Minimum value: "+min);
	}

}
