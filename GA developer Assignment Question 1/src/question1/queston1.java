package question1;

public class queston1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] randomNumber = new int[8];
		
		for(int i = 0; i < 8;i++) {
		
			randomNumber[i]= (int)(Math.random()*99);
		}
		
		System.out.println("------------Before------------");
		for(int j = 0; j < 8; j++) {
			
			System.out.println(randomNumber[j]);
		}
		
		System.out.println("------------------------------");
		System.out.println("------------After-------------");
		
		// sort the array 
		
		int temp = 0;
		for(int k = 0; k < randomNumber.length -1; k++) {
			
			for(int p = 0; p < randomNumber.length -1 - k; p++) {
				
				if(randomNumber[p]>randomNumber[p+1]) {
					temp = randomNumber[p];
					randomNumber[p] = randomNumber[p +1];
					randomNumber[p +1] = temp;
				}
			}
		}
		for(int m = 0; m < 8; m++) {
			
			System.out.println(randomNumber[m]);
		}
		
		
	}
	
	

}
