package snake;
public class Game{
	public final int END=0;              //代表游戏结束
	public final int CONTINUE=1;         //代表游戏技术
	private Snake snake=new Snake();
	private GameMap gameMap=new GameMap();
	private Food food=new Food();
	
	public static void main(String[] args) throws InterruptedException{
		Game game=new Game();
		int i=0;
		while(i<10){
			game.start();
			
			//因为java程序 不能清空控制台，暂时这么替代，以后用图形界面替换
			int j=0;
			while(j<9){
				System.out.println();
				j++;
			}
			i++;
			Thread.sleep(1000);
		}
		

	}
	public void start(){
		food.freshFood();      //首先生成食物
		
		drawScreen();
	}
	/**
	 * 在屏幕上显示地图、贪吃蛇和食物
	 */
	public void drawScreen(){
		String[][] map=gameMap.getMap();      //地图
		for(Snake s:Snake.array){             //放入蛇
			int[] location=s.getLocation();
			map[location[0]][location[1]]=" *";
		}
		//在地图中放入食物
		int[] foodLocation=food.getLocation();
		map[foodLocation[0]][foodLocation[1]]=" *";
		//输出屏幕
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
	}
}