package bubblesort1;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {4,3,1,8,6,9};
		
		for(int x=0;x<num.length-1;x++) {
			for(int y=0;y<num.length-1;y++) {
				if(num[y]>num[y+1]) {
					int tmp=num[y];
					num[y]=num[y+1];
					num[y+1]=tmp;
				}
			}
		}
		
		for(int z=0;z<num.length;z++) {
			System.out.println(num[z]);
		}

	}

}
