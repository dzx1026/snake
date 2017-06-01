package snake;
public class Game{
	public final int END=0;              //������Ϸ����
	public final int CONTINUE=1;         //������Ϸ����
	private Snake snake=new Snake();
	private GameMap gameMap=new GameMap();
	private Food food=new Food();
	
	public static void main(String[] args) throws InterruptedException{
		Game game=new Game();
		int i=0;
		while(i<10){
			game.start();
			
			//��Ϊjava���� ������տ���̨����ʱ��ô������Ժ���ͼ�ν����滻
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
		food.freshFood();      //��������ʳ��
		
		drawScreen();
	}
	/**
	 * ����Ļ����ʾ��ͼ��̰���ߺ�ʳ��
	 */
	public void drawScreen(){
		String[][] map=gameMap.getMap();      //��ͼ
		for(Snake s:Snake.array){             //������
			int[] location=s.getLocation();
			map[location[0]][location[1]]=" *";
		}
		//�ڵ�ͼ�з���ʳ��
		int[] foodLocation=food.getLocation();
		map[foodLocation[0]][foodLocation[1]]=" *";
		//�����Ļ
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
	}
}