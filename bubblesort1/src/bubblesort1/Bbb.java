package bubblesort1;

public class Bbb {

	public static void main(String[] args) {
		
		int value;
		int[] num= {12,43,98,3,-2,122,54,90};
		
		for(int x=0;x<num.length-1;x++) {
			for(int y=0;y<num.length-1;y++)
			{
				if(num[y]>num[y+1]) {
					value=num[y];
					num[y]=num[y+1];
					num[y+1]=value;
				}
			}
		}

		for(int a=0;a<=num.length-1;a++) {
			System.out.println(num[a]);
		}
	}

}
