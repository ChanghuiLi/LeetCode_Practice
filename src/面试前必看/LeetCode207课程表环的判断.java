package 面试前必看;

import java.util.LinkedList;

//广度有限遍历判断图是否有环
public class LeetCode207课程表环的判断 {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        //将所有入度记录下来。
        for(int[] cp : prerequisites) indegrees[cp[0]]++;
        LinkedList<Integer> queue = new LinkedList<>();
        //所有节点中开始节点，放到队列中。（入度为0)
        for(int i = 0; i < numCourses; i++){
            if(indegrees[i] == 0) queue.addLast(i);
        }
        //队列不为空
        while(!queue.isEmpty()) {
        	Integer pre = queue.removeFirst();
        	numCourses--;
        	//找到他指向的那个元素
        	for(int[] reg:prerequisites) {
        		if(reg[1]!=pre) continue;
        		
        		if(--indegrees[reg[0]]==0) queue.add(reg[0]);
        	}
        }
        return numCourses == 0;
    }
	
	public boolean canFinish2(int numCourses, int[][] prerequisites) {
		
		//初始化临接链表。
        int[][] adjacency = new int[numCourses][numCourses];
        for(int[] cp : prerequisites)
            adjacency[cp[1]][cp[0]] = 1;
        
       //用来标记有没有访问过
        int[] flags = new int[numCourses];
        
        for(int i = 0; i < numCourses; i++){
            if(!dfs(adjacency, flags, i)) return false;
        }
        
        return true;
    }
	
    private boolean dfs(int[][] adjacency, int[] flags, int i) {
        if(flags[i] == 1) return false;//表示已经当前节点被访问过
        if(flags[i] == -1) return true;//被其他节点访问过
        flags[i] = 1;
        for(int j = 0; j < adjacency.length; j++) {
            if(adjacency[i][j] == 1 && !dfs(adjacency, flags, j)) return false;
        }
        flags[i] = -1;
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
