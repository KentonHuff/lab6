/**
 * Class to represent a square, a type of Rectangle.
 *
 * Specifically, defines a quadrilateral with exactly two pairs of parallel, equal sides and 90 degree angles at each corner. 
 * @author Kenton Huff
 * @version 2019-02-25
 */
public class Square extends Rectangle
{
	/**
	 * The square constructor. Calls the rectangle constructor with the square's id and size(sidelength)
	 * @param id
	 * @param size
	 */
	public Square(String id, double size)
	{
		super(id, size, size);
	}
	
	/**
	 * Gets the type of the shape.
	 *
	 * @return The string "Square"
	 */
	@Override
	public String getShapeType()
	{
		return "Square";
	}
}
