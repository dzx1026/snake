package snake;

import java.util.ArrayList;

public class Snake{
	private int[] location;   //int[0]代表第几排，int[1]代表第几列
	//每吃一个食物生成一个snake对象，并储存在array数组中
	public static ArrayList<Snake> array=new ArrayList<Snake>();
	public Snake(){
		location=new int[]{GameMap.HEIGHT/2,GameMap.WIDTH/2};
		array.add(this);
	}
	public int[] getLocation(){
		return location;
	}
}