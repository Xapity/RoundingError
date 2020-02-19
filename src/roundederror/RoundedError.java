/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roundederror;
import java.util.*;
/**
 *
 * @author camac2045
 */
public class RoundedError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double x  = sn.nextInt();
        double a = x - 0.1 + 0.1;
        double c = Math.sqrt(a);
        double d = Math.pow(c,2);
        System.out.println(d);
        System.out.println(d-2);
        
    }
    
}
