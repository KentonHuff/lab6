/**
 * Class to represent a rectangle, a type of Polygon.
 *
 * Specifically, defines a quadrilateral with exactly two pairs of parallel sides and 90 degree angles at each corner. 
 * @author Kenton Huff
 * @version 2019-02-25
 */
public class Rectangle extends Polygon
{
	/**
	 * The variables storing the width and height  of the rectangle
	 */
	private double height, width;

	/**
     * The rectangle constructor. Store the width and height information and store in the sideLengths array.
     *
     * @param id The created shape's name id.
     * @param height The height of the rectangle
     * @param width The width of the rectangle
     * 
     */
	public Rectangle(String id, double height, double width)
	{
		super(id);
		this.height = height;
		this.width = width;
		//Fill sidelengths with parameters. Height and width occur twice as a rectangle has 4 sides
		this.sideLengths.add(height);
		this.sideLengths.add(height);
		this.sideLengths.add(width);
		this.sideLengths.add(width);
	}

	/**
	 * Calculates and returns the area of the rectangle.
	 *
	 * @return Area of the rectangle (base * height).
	 */
	@Override
	public double getArea()
	{
		return this.width * this.height;
	}

	/**
	 * Gets the type of the shape.
	 *
	 * @return The string "Rectangle"
	 */
	@Override
	public String getShapeType()
	{
		return "Rectangle";
	}

}