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
        Integer[] data= {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,5,4};
        
        Histogram histo= new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer,Integer> i : histogr.entrySet()) {
            System.out.println(i.getKey()+"==>"+ i.getValue());
        }
    }
    
}
