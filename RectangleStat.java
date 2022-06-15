
public class RectangleStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Length = 34;
		int Width = 19;
		
		int AreaofRec; // reference variable for area of rectangle
		int PerofRec; //reference variable for perimeter of rectangle

		PerofRec = 2 * (Length + Width);
		AreaofRec = Length * Width;

		System.out.println("When one side is " + Length + " and the other side is " + Width + ", the area is "
				+ AreaofRec + " and the perimeter is " + PerofRec);
		
	}

}
