/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort1;

/**
 *
 * @author Malindu
 */
public class Bubblesort1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] num={100,-5,200,40,50};
       for(int a=0;a<=num.length-1;a++)
        {
        for(int x=0;x<num.length-1;x++)
        {
        if(num[x]>num[x+1])
        { 
            int value;
            value=num[x];
            num[x]=num[x+1];
            num[x+1]=value;
        }
        }
    }
        for(int y=0;y<=num.length-1;y++)
        {System.out.println(num[y]);
        }
       
        
        
    }
    
}
