package bubblesort1;

public class Bbbb {

	public static void main(String[] args) {

       int[] num= {12,3,5,122,64};
       for(int x=0;x<=num.length-1;x++) {
    	   for(int y=0;y<num.length-1;y++) {
    		   if(num[x]>num[x+1]) {
    			   int value=num[x];
    			   num[x]=num[x+1];
    			   num[x+1]=value;
    		   }
    	   }
       }

	}

}
