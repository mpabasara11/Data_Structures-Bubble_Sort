package bubblesort1;

public class Aqq {

	public static void main(String[] args) {
		int[] numb= {12,4,22,1,76,89};
		for(int x=0;x<numb.length-1;x++) {
			for(int y=0;y<numb.length-1;y++) {
				if(numb[y]>numb[y+1]) {
					int value=numb[y];
					numb[y]=numb[y+1];
					numb[y+1]=value;
				}
			}
		}
for(int z=0;z<numb.length-1;z++) {
	System.out.println(numb[z]);
}
	}
	
	

}
