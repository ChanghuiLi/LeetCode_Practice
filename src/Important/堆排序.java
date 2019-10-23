package Important;

public class 堆排序 {
	public static void main(String[] args) {
	     int[] a=new int[]{5,4,2,1,6};
	     Sort(a,a.length-1);
	     for(int i:a){
	    	 System.out.println(i);
	     }
  }
	public static void MaxHeapify(int[] a,int index,int size){
	   int l=2*index+1;
	   int r=2*index+2;
	   int largest=index;
	   if(l<=size && a[l]>a[index]){
		   largest=l;
	   }
	   if(r<=size && a[r]>a[largest]){
		   largest=r;
	   }
	   if(largest!=index){
		   int temp=a[largest];
		   a[largest]=a[index];
		   a[index]=temp;
		   MaxHeapify(a,largest,size);
	   }
  }
  public static void HeapBuild(int[] a,int size){
	   for(int i=size/2;i>=1;i--){
		   MaxHeapify(a,i,size);
	   }
  }
  public static void Sort(int[] a,int size){
	   HeapBuild(a,size);
	   for(int i=size;i>=1;i--){
		   int temp=a[i];
		   a[i]=a[0];
		   a[0]=temp;
		   MaxHeapify(a,0,i-1);
	   }
  }
}
