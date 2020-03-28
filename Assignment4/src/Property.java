// TODO: Auto-generated Javadoc
/**
 * The Class Property.
 */
/*

 * Class: CMSC203 

 * Program:Assignment 4

 *  Instructor: Dr. Grinberg

 * Description: The class creates the propeties for the program.

 * Due: 03/27/2020 

 * I pledge that I have completed the programming assignment independently.

   I have not copied the code from a student or any source.

   I have not given my code to any student.

   Print your Name here: Abdul Akibu

*/
public class Property {

	/** The property name. */
	private String propertyName;
	
	/** The city. */
	private String city;
	
	/** The rent amount. */
	private double rentAmount;
	
	/** The owner. */
	private String owner;
	
	/** The plot. */
	Plot plot;
	
	/**
	 * Instantiates a new property.
	 */
	public Property() {
		setPropertyName("");
		setCity("");
		setOwner("");
		setRentAmount(0);
		setPlot(0,0,1,1);
	}

	/**
	 * Instantiates a new property.
	 *
	 * @param p the p
	 */
	public Property(Property p) {
		this.city = p.getCity();
		this.owner = p.getOwner();
		this.propertyName = p.getPropertyName();
		this.rentAmount = p.getRentAmount();
		this.plot = p.getPlot();
	}

	/**
	 * Instantiates a new property.
	 *
	 * @param property the property
	 * @param cityName the city name
	 * @param rent the rent
	 * @param ownerName the owner name
	 */
	public Property(String property, String cityName, double rent, String ownerName) {
		setPropertyName(property);
		setCity(cityName);
		setRentAmount(rent);
		setOwner(ownerName);
	}
	
	/**
	 * Instantiates a new property.
	 *
	 * @param property the property
	 * @param cityName the city name
	 * @param rent the rent
	 * @param ownerName the owner name
	 * @param xPlot the x plot
	 * @param yPlot the y plot
	 * @param widthPlot the width plot
	 * @param depthPlot the depth plot
	 */
	public Property(String property, String cityName, double rent, String ownerName, int xPlot, int yPlot, int widthPlot, int depthPlot) {
		setPropertyName(property);
		setCity(cityName);
		setRentAmount(rent);
		setOwner(ownerName);
		setPlot(xPlot,yPlot, widthPlot, depthPlot);
	}
	
	
	/**
	 * Gets the property name.
	 *
	 * @return the property name
	 */
	public String getPropertyName() {
		return propertyName;
	}
	
	/**
	 * Sets the property name.
	 *
	 * @param propertyName the new property name
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Gets the plot.
	 *
	 * @return the plot
	 */
	public Plot getPlot() {
		return plot;
	}

	/**
	 * Sets the plot.
	 *
	 * @param x the x
	 * @param y the y
	 * @param width the width
	 * @param depth the depth
	 */
	public void setPlot(int x, int y, int width, int depth) {
		plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Gets the rent amount.
	 *
	 * @return the rent amount
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	
	/**
	 * Sets the rent amount.
	 *
	 * @param rentAmount the new rent amount
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	/**
	 * Gets the owner.
	 *
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * Sets the owner.
	 *
	 * @param owner the new owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "Property Name: " + propertyName +"\n"+ "Located in city: " + city +"\n"+ "Belonging to: " + owner +
				"\n"+"Rent Amount: " + rentAmount ;
	}
}
