package ch_2;

import java.io.*;

public class test_p45 {
	public static void main(String[]args)throws IOException{
		System.out.println("請輸入5個人的分數");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[]test = new int[5];
		
		for(int i=0;i<test.length;i++) {
			String str = br.readLine();
			test[i]=Integer.parseInt(str);
		}
		
		for(int i=0;i<test.length-1;i++) {
			for(int j=i+1;j<test.length;j++) {
				if(test[j]>test[i]) {
					int temp = test[i];
					test[i] = test[j];
					test[j] = temp;
				}
			}
		}
		for(int i=0;i<test.length;i++) {
			System.out.println("第"+(i+1)+"名的分數是"+test[i]);
		}
	}
}