
package practicasdelab.kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[]data;

    public int[] getData() {
        return data;
    }

    public Histogram(int[] data) {
        this.data = data;
    }
    public Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> histogram= new HashMap<Integer,Integer>();
        for (int i :data) {
            histogram.put(i,histogram.containsKey(i)? histogram.get(i)+1 : 1);
        }
        return histogram;
    }
}