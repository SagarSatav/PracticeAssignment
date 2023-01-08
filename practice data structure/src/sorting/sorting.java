package sorting;

public class sorting {

	public int binarysearch(int arr[],int key) {
		int low=0;
		int mid;
		int high=arr.length-1;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(key<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}
	
	public int bubblesort(int arr[]) {
		int pass=arr.length-1;
		int comp=arr.length-1;
		for(int i=0; i<pass;i++) {
			int count=0;
			for(int j=0;j<(comp-i);j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			if(count==0) {
				return i+1;
			}
		}
		return arr.length;
	}
	
	public void selectionsort(int arr[]) {
	  for(int i=0;i<arr.length;i++) {
		  int minindex=i;
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[j]<arr[minindex]) {
				  minindex=j;
			  }
			  
		  }
		  if(arr[minindex]!=i) {
			  int temp=arr[i];
			  arr[i]=arr[minindex];
			  arr[minindex]=temp;
		  }
	  }
		
	}
	
	public void insertionsort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j!=i;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	

	public void quicksort(int arr[],int left,int right) {
		if(left>=right) {
			return;
		}
		
		int pid=partition(arr,left,right);
		quicksort(arr, left, pid-1);
		quicksort(arr, pid+1, right);
		
	}
	
	public int partition(int arr[],int left,int right) {
		int pivot=arr[left];
		while(left!=right) {
			while(arr[right]>pivot && left!=right) {
				right--;
			}
			if(left!=right) {
				arr[left]=arr[right];
				left++;
			}
			while(arr[left]<pivot && left!=right) {
				left++;
			}
			if(left!=right) {
				arr[right]=arr[left];
				right--;
			}
		}
		arr[left]=pivot;
		return right;
	}
	
	public void mergesort(int arr[],int left,int right) {
		if(left>=right) {
			return ;
		}
		int mid=(left+right)/2;
		mergesort(arr, left, mid);
		mergesort(arr, mid+1, right);
		merge(arr,left,mid,mid+1,right);
	}

	public void merge(int arr[],int leftstart,int leftend,
			int rightstart, int rightend) {
		
		int num=rightend-leftstart+1;
		int res[]=new int[num];
		int resind=-1;
		
		while((leftstart<=leftend) && (rightstart<=rightend)) {
			if(arr[leftstart]< arr[rightstart]) {
				res[++resind]=arr[leftstart];
				leftstart++;
			}else {
				res[++resind]=arr[rightstart];
				rightstart++;
			}
		}

		
	
		while(leftstart<=leftend) {
			res[++resind]=arr[leftstart];
			leftstart++;
		}
		while(rightstart<=rightend) {
			res[++resind]=arr[rightstart];
			rightstart++;
		}
		
		for(int i=0;i<num;i++) {
			arr[rightend]=res[resind];
			rightend--;
			resind--;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
