// TODO: Auto-generated Javadoc
/**
 * The Class Plot.
 */
/*

 * Class: CMSC203 

 * Program:Assignment 4

 *  Instructor: Dr. Grinberg

 * Description: The class creates the plot structor for the company

 * Due: 03/27/2020 

 * I pledge that I have completed the programming assignment independently.

   I have not copied the code from a student or any source.

   I have not given my code to any student.

   Print your Name here: Abdul Akibu

*/
public class Plot {
	
	/** The x. */
	private int x;
	
	/** The y. */
	private int y;
	
	/** The width. */
	private int width;
	
	/** The depth. */
	private int depth;

	/**
	 * Instantiates a new plot.
	 */
	public Plot() {
		setX(0);
		setY(0);
		setWidth(1);
		setDepth(1);
	}

	/**
	 * Instantiates a new plot.
	 *
	 * @param p the p
	 */
	public Plot(Plot p) {
		this.x = p.getX();
		this.y = p.getY();
		this.width = p.getWidth();
		this.depth = p.getDepth();
	}

	/**
	 * Instantiates a new plot.
	 *
	 * @param xPlot the x plot
	 * @param yPlot the y plot
	 * @param widthPlot the width plot
	 * @param depthPlot the depth plot
	 */
	public Plot(int xPlot, int yPlot, int widthPlot, int depthPlot) {
		setX(xPlot);
		setY(yPlot);
		setWidth(widthPlot);
		setDepth(depthPlot);
	}

	/**
	 * Overlaps.
	 *
	 * @param p the p
	 * @return true, if successful
	 */
	public boolean overlaps(Plot p) {
		return x < p.x + p.width && x + width > p.x && y < p.y + p.depth && y + depth > p.y;
	}

	/**
	 * Encompasses.
	 *
	 * @param p the p
	 * @return true, if successful
	 */
	public boolean encompasses(Plot p) {
		return (((p.x >= x && p.x <= (x + width)) && (p.y >= y && p.y <= (y + depth)))
			&& (((p.x + p.width) >= x && (p.x + p.width) <= (x + width)) && 
			(p.y >= y && p.y <= (y + depth))));
	}

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Gets the depth.
	 *
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * Sets the depth.
	 *
	 * @param depth the new depth
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}

}
