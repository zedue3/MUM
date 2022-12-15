/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbean;

/**
 *
 * @author hp
 */
public class IsBean {

    /**
     * @param args the command line arguments
     */
    public static int isBean(int [] a){
        boolean nine = false;
        boolean seven = false;
        boolean thirteen = false;
        boolean sixteen = false;
        for(int i=0; i<a.length;i++){
            if(a[i]==9)
                nine = true;
            if(a[i]==13)
                thirteen=true;
            if(a[i]==7)
                seven=true;
            if(a[i]==16)
                sixteen=true;
            
        }
        if(nine==true && thirteen==false)
            return 0;
        if(seven==true && sixteen==true)
            return 0;
        return 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isBean(new int[] {1, 2, 3, 9, 6, 13}));
        System.out.println(isBean(new int[] {3, 4, 6, 7, 13, 15}));
        System.out.println(isBean(new int[] {1, 2, 3, 4, 10, 11, 12}));
        System.out.println(isBean(new int[] {3, 6, 9, 5, 7, 13, 6, 17}));
        System.out.println(isBean(new int[] {9, 6, 18}));
        System.out.println(isBean(new int[] {4, 7, 16}));
    }
    
}
