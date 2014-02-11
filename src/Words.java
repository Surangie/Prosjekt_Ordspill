
public class Words {
	private int coordinateX;
	private int coordinateY;
	private String word;
	
	public Words(){
		
	}
	
	public int getCoordinateX(){
		return coordinateX;
	}
	public void setCoordinateX(int coordinate){
		this.coordinateX = coordinate;
	}
	
	public int getCoordinateY(){
		return coordinateY;
	}
	public void setCoordinateY(int coordinate){
		this.coordinateY = coordinate;
	}
	
	public void setWord(){
		this.word = ""; // skal hente ord fra ord-databasen
	}
	public String getWord(){
		return word;
	}

}
