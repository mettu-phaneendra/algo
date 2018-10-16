package org.wss.core;

import java.util.Set;
import java.util.HashSet;

public class The3n1p {
    private int start = 0;
    private int end = 0;
    
	public void calculate() {
		int max = 0;
		for (int i= start; i <= end ; i++) {
            //System.out.print(i + " ");
			int count = getCount(i);
            if (count > max) max = count;
			//System.out.println("Number :" + i + " Count :" +max);
		}
		System.out.println(start + " " + end + " " +max);
	}

	private int getCount(int input) {
		int count = 0;
        do {
            count++;
			if(input%2 ==0) {
				input= input/2;
			} else {
				input = (input*3)+1;
			}
		} while (input != 1);
        count++;
        return count;
	}

	public static void main(String [] argv) {
		System.out.println("3n+1 problem");
		The3n1p p = new The3n1p();
        p.start = 1; p.end = 10; p.calculate();
        p.start = 100; p.end = 200; p.calculate();
        p.start = 201; p.end = 210; p.calculate();
        p.start = 900; p.end = 1000; p.calculate();

		//p.calculate(201, 210);
		//p.calculate(900, 1000);
	}
}
