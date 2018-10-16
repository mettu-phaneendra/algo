package org.wss.core;

import java.util.List;
import java.util.ArrayList;

public class BSearch {
    
    private Integer findElement(List<Integer> data, Integer seed) {
        int start = 0;
        int end = data.size();
        int index;
        if (null == data || data.isEmpty()) {
            return -1;
        }
        while(start <= end) {
            index = (start+end)/2;
            System.out.println(index);
            int seedData = data.get(index); 
            if (seed < seedData) {
                end = index;
            }
            if (seed > seedData) {
                start = index;
            }
            if (seed == seedData) {
                return index;
            }
        }
        return -1;
    }
    
    public static void main(String [] argv) {
        List<Integer> data = new ArrayList<>();
        data.add(-1); data.add(10);
        data.add(24); data.add(34);
        data.add(35); data.add(44);
        data.add(51); data.add(78);
        BSearch bs = new BSearch();
        int index = bs.findElement(data, 35);
        System.out.println("index :" +index);
        System.out.println("value :" +data.get(index));
    }
}

