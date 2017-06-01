package snake;
public class Game{
	public final int END=0;              //代表游戏结束
	public final int CONTINUE=1;         //代表游戏技术
	
	public static void main(String[] args){
		Game game=new Game();
		game.start();
	}
	public void start(){
		GameMap map=new GameMap();
		map.drawMap();
	}
}