// TODO: Auto-generated Javadoc
/**
 * The Class ManagementCompany.
 */
/*

 * Class: CMSC203 

 * Program:Assignment 4

 *  Instructor: Dr. Grinberg

 * Description: This is the main driver the program. Creates the company and allows for property and plot creation.

 * Due: 03/28/2020 

 * I pledge that I have completed the programming assignment independently.

   I have not copied the code from a student or any source.

   I have not given my code to any student.

   Print your Name here: Abdul Akibu

*/
public class ManagementCompany {
	
	/** The max property. */
	private final int MAX_PROPERTY = 5;
	
	/** The mgm fee per. */
	private double mgmFeePer;
	
	/** The name. */
	private String name;
	
	/** The p. */
	private Property[] p;
	
	/** The tax ID. */
	private String taxID;
	
	/** The mgmt width. */
	private final int MGMT_WIDTH = 10;
	
	/** The mgmt depth. */
	private final int MGMT_DEPTH = 10;
	
	/** The plot. */
	Plot plot;
	
	/** The num properties. */
	private int numProperties = 0;

	/**
	 * Instantiates a new management company.
	 */
	public ManagementCompany() {
		setName("");
		setMgmFeePer(0);
		setTaxID("");
		setPlot(0, 0, 10, 10);
	}

	/**
	 * Instantiates a new management company.
	 *
	 * @param name the name
	 * @param Id the id
	 * @param fee the fee
	 */
	public ManagementCompany(String name, String Id, double fee) {
		p = new Property[MAX_PROPERTY];
		setName(name);
		setTaxID(Id);
		setMgmFeePer(fee);
		setPlot(0, 0, 10, 10);
	}

	/**
	 * Instantiates a new management company.
	 *
	 * @param name the name
	 * @param Id the id
	 * @param fee the fee
	 * @param xPlot the x plot
	 * @param yPlot the y plot
	 * @param widthPlot the width plot
	 * @param depthPlot the depth plot
	 */
	public ManagementCompany(String name, String Id, double fee, int xPlot, int yPlot, int widthPlot, int depthPlot) {
		p = new Property[MAX_PROPERTY];
		setName(name);
		setTaxID(Id);
		setMgmFeePer(fee);
		setPlot(xPlot, yPlot, widthPlot, depthPlot);
	}

	/**
	 * Instantiates a new management company.
	 *
	 * @param m the m
	 */
	public ManagementCompany(ManagementCompany m) {
		p = new Property[MAX_PROPERTY];
		this.name = m.getName();
		this.taxID = m.getTaxID();
		this.mgmFeePer = m.getMgmFeePer();
		this.plot = m.getPlot();
	}

	/**
	 * Gets the max property.
	 *
	 * @return the max property
	 */
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	/**
	 * Adds the property.
	 *
	 * @param property the property
	 * @return the int
	 */
	public int addProperty(Property property) {
		for (int i = 0; i < numProperties; i++) {
			if (p[i].getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		if (numProperties == MAX_PROPERTY) {
			return -1;
		}

		if (property == null) {
			return -2;
		}

		if (this.plot.encompasses(property.getPlot())) {
			return -3;
		} else {
			p[numProperties] = property;
			numProperties++;
			return numProperties;
		}

	}

	/**
	 * Adds the property.
	 *
	 * @param name the name
	 * @param city the city
	 * @param rent the rent
	 * @param owner the owner
	 * @return the int
	 */
	public int addProperty(String name, String city, double rent, String owner) {
		Property property = new Property(name, city, rent, owner, 0, 0, 1, 1);
		p[numProperties] = property;
		numProperties++;
		for (int i = 0; i < numProperties; i++) {
			if (p[i].getPlot().overlaps(property.getPlot()))
				return -4;
		}
		if (numProperties == MAX_PROPERTY) {
			return -1;
		}
		if (this.plot.encompasses(property.getPlot())) {
			return -3;
		}

		p[numProperties] = property;
		numProperties++;
		return numProperties;

	}

	/**
	 * Adds the property.
	 *
	 * @param name the name
	 * @param city the city
	 * @param rent the rent
	 * @param owner the owner
	 * @param x the x
	 * @param y the y
	 * @param width the width
	 * @param depth the depth
	 * @return the int
	 */
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		p[numProperties] = property;
		numProperties++;
		for (int i = 0; i < numProperties; i++) {
			if (p[i].getPlot().overlaps(property.getPlot()))
				return -4;
		}
		if (numProperties == MAX_PROPERTY) {
			return -1;
		}
		if (this.plot.encompasses(property.getPlot())) {
			return -3;
		}

		p[numProperties] = property;
		numProperties++;
		return numProperties;

	}

	/**
	 * Total rent.
	 *
	 * @return the double
	 */
	public double totalRent() {
		double total = 0.0;
		for (int i = 0; i < numProperties; i++) {
			total += p[i].getRentAmount();
		}
		return total;
	}

	/**
	 * Max rent prop.
	 *
	 * @return the double
	 */
	public double maxRentProp() {
		double maxRentAmount = 0.0;
		maxRentAmount = p[maxRentPropertyIndex()].getRentAmount();
		return maxRentAmount;
	}

	/**
	 * Max rent property index.
	 *
	 * @return the int
	 */
	public int maxRentPropertyIndex() {
		int maxIndex = 0;
		for (int i = 0; i < numProperties; i++) {
			if (p[i].getRentAmount() >= p[maxIndex].getRentAmount()) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * Display property at index.
	 *
	 * @param i the i
	 * @return the string
	 */
	public String displayPropertyAtIndex(int i) {
		String str = "";
		if (p[i] != null) {
			str = ("Owner: " + p[i].getOwner() + "City: " + p[i].getCity() + "Property Name: "
					+ p[i].getPropertyName() + "Rent Amount: " + p[i].getRentAmount() + "Plot: "
					+ p[i].getPlot());
		}
		return str;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		String printContent = "";
		System.out.println("List of the properties for Alliance, taxID: " + taxID);
		System.out.println("__________________________________________________");
		for (int i = 0; i < numProperties; i++) {

			if (p[i] != null)
				printContent = (" Property Name: " + p[i].getPropertyName() + "\n" + "  Located in: "
						+ p[i].getCity() + "\n" + "  Belonging to: " + p[i].getOwner() + "\n"
						+ "  Rent Amount: " + p[i].getRentAmount());

		}
		System.out.println("__________________________________________________");
		System.out.println("Total management Fee: " + mgmFeePer);
		return printContent;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the tax ID.
	 *
	 * @return the tax ID
	 */
	public String getTaxID() {
		return taxID;
	}

	/**
	 * Sets the tax ID.
	 *
	 * @param taxID the new tax ID
	 */
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	/**
	 * Gets the mgmt width.
	 *
	 * @return the mgmt width
	 */
	public int getMGMT_WIDTH() {
		return MGMT_WIDTH;
	}

	/**
	 * Gets the mgmt depth.
	 *
	 * @return the mgmt depth
	 */
	public int getMGMT_DEPTH() {
		return MGMT_DEPTH;
	}

	/**
	 * Gets the mgm fee per.
	 *
	 * @return the mgm fee per
	 */
	public double getMgmFeePer() {
		return mgmFeePer;
	}

	/**
	 * Sets the mgm fee per.
	 *
	 * @param mgmFeePer the new mgm fee per
	 */
	public void setMgmFeePer(double mgmFeePer) {
		this.mgmFeePer = mgmFeePer;
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

}