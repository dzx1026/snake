package snake;

import java.util.ArrayList;

public class Snake{
	private int[] location;   //int[0]����ڼ��ţ�int[1]����ڼ���
	//ÿ��һ��ʳ������һ��snake���󣬲�������array������
	public static ArrayList<Snake> array=new ArrayList<Snake>();
	public Snake(){
		location=new int[]{GameMap.HEIGHT/2,GameMap.WIDTH/2};
		array.add(this);
	}
	public int[] getLocation(){
		return location;
	}
}