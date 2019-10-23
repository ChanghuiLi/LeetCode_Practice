package 百度;

public class 堆排序 {
	public static void main(String[] args) {
        int[] nums = {16,7,3,20,17,8};
        headSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
	public static void headSort(int[] list) {
		//list.length-1:第一个非叶子节点。刚开始的时候从第一个父节点开始调整。
		for(int i = (list.length/2)-1;i>=0;i--) {
			heapfy(list,i,list.length);
		}
		for(int i = list.length-1;i>=1;i--) {
			swap(list,i,0);
			heapfy(list,0,i);
		}
	}

	private static void swap(int[] list, int i, int j) {
		// TODO Auto-generated method stub
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
//将当前节点下沉。调整一个节点。
	private static void heapfy(int[] list, int start, int end) {
		// TODO Auto-generated method stub
		int k = start;//下层的当前节点
		int temp = list[start];
		int index = 2*start+1;//当前节点的叶子节点
		while(index<end) {
			//找到左右子树最大的坐标。
			if(index+1<end) {
				if(list[index+1]>list[index]) {
					index = index+1;
				}
			}
			//判断父亲节点是否大于孩子节点更大的那个。
			if(temp<list[index]) {
				list[k] = list[index];
				k = index;
				index = index*2+1;
			}
		}
		list[k] = temp;
	}

}
/*
public class Sort {
    public static void main(String[] args) {
        int[] nums = {16,7,3,20,17,8};
        headSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * 堆排序
     */
/*
    public static void headSort(int[] list) {
        //构造初始堆,从第一个非叶子节点开始调整,左右孩子节点中较大的交换到父节点中
        for (int i = (list.length) / 2 - 1; i >= 0; i--) {
            headAdjust(list, list.length, i);
        }
        //排序，将最大的节点放在堆尾，然后从根节点重新调整
        for (int i = list.length - 1; i >= 1; i--) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            headAdjust(list, i, 0);
        }
    }
    
    private static void headAdjust(int[] list, int len, int i) {
        int k = i, temp = list[i], index = 2 * k + 1;
        while (index < len) {
            if (index + 1 < len) {
                if (list[index] < list[index + 1]) {
                    index = index + 1;
                }
            }
            if (list[index] > temp) {
                list[k] = list[index];
                k = index;
                index = 2 * k + 1;
            } else {
                break;
            }
        }
        list[k] = temp;
    }*/
