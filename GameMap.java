package snake;
public class GameMap{
	private String[][] map;
	public static final int HEIGHT=25;
	public static final int WIDTH=25;
	public GameMap(){
		map=new String[HEIGHT][WIDTH];
	}
	public String[][] getMap(){
		for(int i=0;i<map.length;i++){
			//System.out.print(map.length+"i==="+i);
			for(int j=0;j<map[i].length;j++){
				if(i==0||i==map.length-1) 
					map[i][j]=" *";
				else if(j==0||j==map[i].length-1)
					map[i][j]=" *";
				else
					map[i][j]="  ";
				//System.out.print(map[i].length+"j==="+j);
			}
		}
		return map;
	}
}