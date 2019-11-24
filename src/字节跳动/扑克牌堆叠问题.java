package 字节跳动;

import java.util.LinkedList;

public class 扑克牌堆叠问题 {
//	 一副扑克，将堆顶的牌放到桌上，再将堆顶的牌放到堆底，如此知道所有牌都放到桌上，而桌上的牌为从1到n有序排列。
//   求刚开始时扑克牌的顺序
//   思路：从1到n的队列，1放到桌上，2放回堆底...依次类推，得到一组数字，然后这组数字为一组数组的下标，依次放入1-n
//   [1 3 5 4 2]------[1，2，3，4，5]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {13,12,11,10,9,8,7,6,5,4,3,2,1};
		sort(a);
		double res = 0;
		for(double i = 1;i<10000;i++) {
			res = res + i/Math.pow(2.0, i);
		}
		System.out.println(res);
	}
	//做了一次你想操作。
	public static void sort(int[] pokers) {
        //从数组转换成list,只是为了方便操作，不用考虑其它的
        LinkedList<Integer> Desktop = new LinkedList<>();
        for(int poker:pokers) {
        	Desktop.add(poker);
        }
        //声明一个目标容器，理解成手
        LinkedList<Integer> hand = new LinkedList<>();
        for (Integer aPokerList : Desktop) {
            //判断手上的牌是否大于1张
            if (hand.size() > 1) {
                //如果大于一张，则把手牌的最后一张放在最上面
                hand.addFirst(hand.pollLast());
            }
            //从桌子上拿一张牌放在手上
            hand.addFirst(aPokerList);
        }
        //循环打印到控制台，
        hand.forEach(System.out::println);
    }

}
