package snake;
public class Game{
	public final int END=0;              //������Ϸ����
	public final int CONTINUE=1;         //������Ϸ����
	
	public static void main(String[] args){
		Game game=new Game();
		game.start();
	}
	public void start(){
		GameMap map=new GameMap();
		map.drawMap();
	}
}