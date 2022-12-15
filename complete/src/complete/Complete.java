/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complete;

/**
 *
 * @author hp
 */
public class Complete {

    /**
     * @param args the command line arguments
     */
    public static int isComplete(int [] a){
        int max = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=0) return 0;
            else if(a[i]%2==0){
                if(a[i]>max) max=a[i];
            }
        }
        while(max!=0){
            boolean found = false;
            for(int j=0;j<a.length;j++){
                if(a[j] == max){
                    found=true;
                    break;
                }
            }
            if(!found) return 0;
            max-=2;
        }
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isComplete(new int[] {2, -3,4, 3, 6}));
    }
    
}
