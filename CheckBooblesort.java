package search_algoritham;

import java.util.Arrays;

public class CheckBooblesort {
	public static void main(String[] args) {
		int a[]= {2,4,18,92,12,15,10};
		int b[]=sorting(a);
		System.out.println(Arrays.toString(b));
		int c=search(b,12);
		System.out.println(c);
		
	}
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
		return a;
	}
	public static  int search(int[]a,int target) {
		int start=0;
		int end=a.length-1;
	while(start<=end) {
		int mid=(start+(end-start))/2;
		if (a[mid] > target)
            end = mid - 1;
        else if (a[mid] < target)
            start = mid + 1;
        else
            return mid;
    }
    return -1;
		
	}

}
