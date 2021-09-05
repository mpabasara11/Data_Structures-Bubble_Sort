package bubblesort1;

public class Bub {

	public static void main(String[] args) {
		int[] num= {12,54,1,76,111,9,1};
		
		for(int x=0;x<num.length-1;x++) {
			for(int y=0;y<num.length-1;y++) {
				if(num[y]>num[y+1]) {
					int value=num[y];
					num[y]=num[y+1];
					num[y+1]=value;
				}
				
			}
		}
		
		for(int z=0;z<num.length-1;z++) {
			System.out.println(num[z]);
			
		}

	}

}
