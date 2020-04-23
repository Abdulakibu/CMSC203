/**
 * The Class ManagementCompany.
 */
/*

 * Class: CMSC203 

 * Program:Assignment 5

 *  Instructor: Dr. Grinberg

 * Description: This class takes the ragged arrays and loops through them to calculate the holiday bonus for the highest, lowest, and other facilities. Also calculates the total bonuses.

 * Due: 04/19/2020 

 * I pledge that I have completed the programming assignment independently.

   I have not copied the code from a student or any source.

   I have not given my code to any student.

   Print your Name here: Abdul Akibu

*/
public class HolidayBonus {

	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonusAmounts = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				double highestSalesCat = TwoDimRaggedArrayUtility.getHighestInColumn(data, j);
				double lowestSalesCat = TwoDimRaggedArrayUtility.getLowestInColumn(data, j);
				if (data[i][j] > 0) {
					if (data[i][j] == highestSalesCat) {
						bonusAmounts[i] = bonusAmounts[i] + high;
					} else if (data[i][j] == lowestSalesCat) {
						bonusAmounts[i] = bonusAmounts[i] + low;
					} else {
						bonusAmounts[i] = bonusAmounts[i] + other;
					}
				}
			}
		}
		return bonusAmounts;
	}

	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonus = calculateHolidayBonus(data, high, low, other);
		int i = 0;
		double sum = 0;
		while(i < bonus.length) {
			   sum += bonus[i];
			   i++;
		}
		return sum;
	}
}
