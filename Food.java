package snake;
public class Food{
	private int[] location=new int[2];
	/**
	 * �˷������������µ�ʳ��������ɵ�ʳ�����ڵ�λ�ò������ߵ�����
	 */
	public void freshFood(){
		boolean flage=true;
		while(flage){
			grown();
			if(Snake.array!=null){
				for(Snake e:Snake.array){
					if(equals(e.getLocation())){
						flage=false;
					}
				}
			}
			if(flage)  flage=false;
			else flage=true;
		}
	}
	//����ʳ������ų����ܵ�ǽ
	public void grown(){
		location[0]=(int)(Math.random()*(GameMap.HEIGHT-1))+1;
		location[1]=(int)(Math.random()*(GameMap.WIDTH-1))+1;
	}
	public int[] getLocation() {
		return location;
	}
	public void setLocation(int[] location) {
		this.location = location;
	}
	public boolean equals(int[] snakeLocation){
		if(snakeLocation[0]==location[0]&&snakeLocation[1]==location[1])
			return true;
		else
			return false;
	}
	
}