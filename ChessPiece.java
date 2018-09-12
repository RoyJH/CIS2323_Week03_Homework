public class ChessPiece{
		//Object Attributes
		private int xPosition;
		private int yPosition;
		private String color;
		private String pType;
		
		//Object Methods
		public void setPosition(int x, int y){
			xPosition = x;
			yPosition =y;
		}
		public int getx(){
			return xPosition;
		}
		public int gety(){
			return yPosition;
		}
		
		public void setColor(String c){
			color =c;
		}
		public String getColor(){
			return color;
		}
		public void setType(String t){
			pType =t;
		}
		public String getType(){
			return pType;
		}
		public String printInfo(){
			return "The piece is a " + pType + "\n"
			+ "its color is " + color + "\n"
			+ "and is located at " + xPosition + ", " + yPosition;
		}
}
