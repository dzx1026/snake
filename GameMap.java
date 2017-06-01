package snake;
public class GameMap{
	private String[][] map;
	private final int HEIGHT=25;
	private final int WIDTH=25;
	public GameMap(){
		map=new String[HEIGHT][WIDTH];
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				map[i][j]="*";
			}
		}
	}
	/**
	*drawMap snake map
	*/
	public void drawMap(){
		for(int i=0;i<map.length;i++){
			//System.out.print(map.length+"i==="+i);
			for(int j=0;j<map[i].length;j++){
				if(i==0||i==map.length-1) 
					System.out.print(" *");
				else if(j==0||j==map[i].length-1)
					System.out.print(" *");
				else
					System.out.print(" ");
				//System.out.print(map[i].length+"j==="+j);
			}
			System.out.println();
		}
	}
}