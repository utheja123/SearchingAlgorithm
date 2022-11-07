package search_algoritham;

import java.util.Arrays;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class Booblesort {
	public static int[] sorting(int [] a) {
		for(int j=0;j<a.length-1;j++) {
			for(int i=0;i<a.length-j-1;i++) {
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			
		}
		System.out.print(Arrays.toString(a));
		return a;
	}

}
