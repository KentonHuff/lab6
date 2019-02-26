import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Square("R1", 5.0);
		Shape b = new Square("R2", 4.0);
		Shape c = new Rectangle("R3", 2.0, 8.0);
		Shape d = new Square("R4", 1.0);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes();
		
		Assert.assertEquals("Shapes sorted incorrectly...", "R4", sorter.shapes.get(0).getId());
		Assert.assertEquals("Shapes sorted incorrectly...", "R2", sorter.shapes.get(1).getId());
		Assert.assertEquals("Shapes sorted incorrectly...", "R3", sorter.shapes.get(2).getId());
		Assert.assertEquals("Shapes sorted incorrectly...", "R1", sorter.shapes.get(3).getId());
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Square("R1", 5.0);
		Shape b = new Square("R2", 4.0);
		Shape c = new Square("R3", 4.5);
		Shape d = new Square("R4", 1.0);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes(new ShapeAreaComparator());
		
		Assert.assertEquals("Shapes sorted incorrectly...", "R4", sorter.shapes.get(0).getId());
		Assert.assertEquals("Shapes sorted incorrectly...", "R2", sorter.shapes.get(1).getId());
		Assert.assertEquals("Shapes sorted incorrectly...", "R3", sorter.shapes.get(2).getId());
		Assert.assertEquals("Shapes sorted incorrectly...", "R1", sorter.shapes.get(3).getId());
		
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Square("R1", 5.0);
		Shape b = new Square("R2", 4.0);
		Shape c = new EquilateralTriangle("R3", 6.0);
		Shape d = new Square("R4", 1.0);
		
		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes(new ShapePerimeterComparator());
		
		Assert.assertEquals("Shapes sorted incorrectly...", "R4", sorter.shapes.get(0).getId());
		Assert.assertEquals("Shapes sorted incorrectly...", "R2", sorter.shapes.get(1).getId());
		Assert.assertEquals("Shapes sorted incorrectly...", "R3", sorter.shapes.get(2).getId());
		Assert.assertEquals("Shapes sorted incorrectly...", "R1", sorter.shapes.get(3).getId());
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("Rect", 3.0, 4.0);
		Shape b = new Square("Sqr", 3.0);
		
		sorter.addShape(a);
		sorter.addShape(b);
		
		String expected = "Rectangle\t ID = Rect\t area = 12.000\t perimeter = 14.000Square\t ID = Sqr\t area = 9.000\t perimeter = 12.000";
		
		Assert.assertEquals("toString() is incorrect", expected, sorter.toString());
	}
}
