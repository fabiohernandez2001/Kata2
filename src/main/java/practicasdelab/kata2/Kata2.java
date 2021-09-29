/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasdelab.kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fabio
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] data= {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,5,4};
        
        Map<Integer,Integer> histogram=new HashMap<Integer,Integer>();
        for (int i = 0; i < data.length; i++) {
            int j = data[i];
            if(histogram.containsKey(j))histogram.put(j,histogram.get(j)+1);
            else{histogram.put(j, 1);}
        }
        for (Map.Entry<Integer,Integer> i : histogram.entrySet()) {
            System.out.println("Key = "+ i.getKey()+", Value = "+ i.getValue());
        }
    }
    
}
