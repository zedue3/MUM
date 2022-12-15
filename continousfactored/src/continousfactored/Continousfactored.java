/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continousfactored;

/**
 *
 * @author hp
 */
public class Continousfactored {

    /**
     * @param args the command line arguments
     */
    public static int isContinuousFactored(int n){
        for(int i=2; i<n; i++){
            if(n%i==0 && n%(i+1)==0){
                return 1;
            }
        }      
        return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isContinuousFactored(72));
        System.out.println(isContinuousFactored(60));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(90));
        System.out.println(isContinuousFactored(121));
        System.out.println(isContinuousFactored(2));
        System.out.println(isContinuousFactored(13));
    }
    
}
