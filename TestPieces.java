public class TestPieces{

	public static void main (String[] args){
		//First Piece
		ChessPiece piece1 = new ChessPiece();
		System.out.println("This is the first piece");
		piece1.setColor("black");
		piece1.setType("knight");
		piece1.setPosition(2,1);
		String infoA = piece1.printInfo();
		System.out.println(infoA);		
		System.out.println("\n");
		//Second Piece
		ChessPiece piece2 = new ChessPiece();
		System.out.println("This is another piece");
		piece2.setColor("white");
		piece2.setType("bishop");
		piece2.setPosition(6,8);
		String infoB = piece2.printInfo();
		System.out.println(infoB);

	}
}