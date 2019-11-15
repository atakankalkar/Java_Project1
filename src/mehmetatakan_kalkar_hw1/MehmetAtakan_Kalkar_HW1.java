/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mehmetatakan_kalkar_hw1;

import java.io.IOException;



/**
 *
 * @author ataka
 */
public class MehmetAtakan_Kalkar_HW1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException   {
        // TODO code application logic here
        
        int[] timearray = {100,1000,10000,100000};
        CComplexity myc = new CComplexity(timearray);
       myc.ProduceResult();
   
    }
    

}