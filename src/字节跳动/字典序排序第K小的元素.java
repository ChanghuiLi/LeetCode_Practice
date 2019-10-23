package 字节跳动;

import java.util.ArrayList;
import java.util.List;

public class 字典序排序第K小的元素 {
	
	public int findKthNumber(int n, int k) {
		int cur = 1;
		--k;
		while(k>0) {
			long step = 0,first = cur,end = cur+1;
			while(first<=n) {
				step = step+Math.min((long)n+1, end)-first;
				first *=10;
				end *=10;
			}
			if(step<=k) {
				++cur;
				k-=step;
				
			}else {
				cur*=10;
				k--;
			}
		}
		
		
		return cur;
        
    }
	
	//字典序排序
	public List<Integer> lexicalOrder(int n) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1;i<10;i++) {
			if(i<=n) {
				list.add(i);
				addlist(list,n,i);
			}else {
				break;
			}
		}
		return list;
    }

	private void addlist(List<Integer> list, int n, int startnum) {
		// TODO Auto-generated method stub
		startnum *= 10;
		for(int i = 0;i<10;i++,startnum++) {
			if(startnum<=n) {
				list.add(startnum);
				addlist(list,n,startnum);
			}else {
				return;
			}
		}
		
	}

}
