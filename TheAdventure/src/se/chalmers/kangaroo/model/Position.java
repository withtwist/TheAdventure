package se.chalmers.kangaroo.model;

public class Position {

	private int x;
	private int y;
	
	public Position(Position pos){
		//TOTO Implement constructor
	}
	
	public Position(int x, int y){
		//TODO implement constructor
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	@Override
	public String toString(){
		return null;
		//TODO implement toString
	}

	@Override
	public int hashCode() {
		//TODO fix hashCode
		return super.hashCode() + x * 7 + y * 11;		
	}

	@Override
	public boolean equals(Object obj) {
		//TODO fix equals
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
