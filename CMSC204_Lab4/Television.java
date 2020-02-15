package CMSC204_Lab4;

/**
 * The purpose of this class is to model a television Abdul Akibu 2/15/2020
 */
public class Television {
  // manufacturer attribute will hold the brand name
  final String MANUFACTURER;
  // screenSize attribute will hold the size of the television screen
  final int SCREEN_SIZE;
  // powerOn attribute will hold the value true if the power is on, and false if
  // the power is off
  Boolean powerOn;
  // channel attribute will hold the value of the station that the television is
  // showing
  int channel;
  // volume attribute will hold a number value representing the loudness (0 being
  // no sound)
  int volume;

  /**
   * Constructor that takes data as input and sets them.
   * Also initlizes default tv settings
   * @param manufacturer the name of the manufacturer
   * @param screenSize   the size of the television 
   */
  public Television(String manufacturer, int screenSize) {
    this.MANUFACTURER = manufacturer;
    this.SCREEN_SIZE = screenSize;
    this.powerOn = false;
    this.volume = 20;
    this.channel = 2;
  }

  /**
   * returns tv current volume
   * 
   * @return an int representing tv's current volume
   */
  public int getVolume() {
    return this.volume;
  }

  /**
   * returns tv's current channel
   * 
   * @return an int representing tv's current channel
   */
  public int getChannel() {
    return this.channel;
  }

  /**
   * Returns the tv's manufacturer
   * 
   * @return a String corresponding to the tv's manufacturer
   */
  public String getManufacturer() {
    return this.MANUFACTURER;
  }

  /**
   * returns tv's screen size
   * 
   * @return an int representing tv's screen size
   */
  public int getScreenSize() {
    return this.SCREEN_SIZE;
  }

  /**
	 * sets tv's new channel
	 * @param newChannel tv's new channel 
	 */
  public void setChannel(int newChannel) {
    this.channel = newChannel;
  }

  /**
   * Toggles the tv's current on setting by switching between true and false when called
   */
  public void power() {
    this.powerOn = !powerOn;
  }

  /**
   * Increases the tv's current volume by an increment of 1
   */
  public void increaseVolume() {
    this.volume++;
  }

  /**
   * Decreases the tv's current volume by an increment of 1
   */
  public void decreaseVolume() {
    this.volume--;
  }

  // public static void main(String[] args) {
  //   Television tv = new Television("manufacturer", 100);
  //   System.out.println(tv.MANUFACTURER);
  //   System.out.println(tv.volume);
  //   tv.increaseVolume();
  //   System.out.println(tv.volume);
  // }

}