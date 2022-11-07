package search_algoritham;

public class BinarySearch {
	static int[] a = { 2, 4, 6, 8, 10, 12 };
	
	public static void main(String[] args) {
		int target = 10;
		System.out.println(search(a,target));
		
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
