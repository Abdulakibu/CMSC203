/**
 * The Class ManagementCompany.
 */
/*

 * Class: CMSC203 

 * Program:Assignment 5

 *  Instructor: Dr. Grinberg

 * Description: This class takes the ragged arrays and loops through them to be able to calculate different totals like average, highest in row, ect.

 * Due: 04/19/2020 

 * I pledge that I have completed the programming assignment independently.

   I have not copied the code from a student or any source.

   I have not given my code to any student.

   Print your Name here: Abdul Akibu

*/

import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class TwoDimRaggedArrayUtility {
	
	public static double getAverage(double[][] data) {
		 double sum=0;
         int count=0;
         for(int i=0;i<data.length;i++) {
             for(int j=0;j<data[i].length;j++) {   
            	 sum += data[i][j];
            	 count += 1;
             }
         }
         return sum/count;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		 double sum=0;
         for(int i=0;i<data.length;i++) {
             if(col<=data[i].length-1) {
            	 sum += data[i][col];
             }    
         }
         return sum;
	}
	
	public static double getHighestInArray(double[][] data) {
		 double highestArr=data[0][0];
         for(int i=0;i<data.length;i++) {
             for(int j=0;j<data[i].length;j++) {   
                  if(data[i][j]>highestArr) {
                	  highestArr= data[i][j];  
                  } 
             }
         }
         return highestArr;
	}
	
	public static double getHighestInColumn(double[][] data, int col) {
		 double highestCol = 0;
	        for (int i = 0; i < data.length; i++) {
	            for (int j = 0; j < data[i].length; j++) {//array of arrays
	                if (j == col - 1 && highestCol < data[i][j]) {
	                    highestCol = data[i][j];
	                }
	            }
	        }
	        return highestCol;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		 double highestRow = 0;
	        for (int j = 0; j < data[row].length; j++) {
	            if (highestRow > data[row][j]) {
	                highestRow = data[row][j];
	            }
	        }
	        return (int) highestRow;
	}
	
	public static double getLowestInArray(double[][] data) {
		double lowestArr=data[0][0];
        for(int i=0;i<data.length;i++) {
            for(int j=0;j<data[i].length;j++) {   
                 if(data[i][j]<lowestArr)
                	 lowestArr= data[i][j]; 
            }
        }
        return lowestArr;
	}
	
	public static double getLowestInColumn(double[][] data, int col) {
		double LwElem=data[0][col];
        for(int kk=0;kk<data.length;kk++) {
            if(col<=data[kk].length-1) {
            	if(data[kk][col]<LwElem) {
            		LwElem= data[kk][col];
            	}   
            }
        }
        return LwElem;    
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowestInCol = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (j == col - 1 && lowestInCol > data[i][j]) {
                    lowestInCol = data[i][j];
                }
            }
        }
        return (int) lowestInCol;
	}
	
	public static double getLowestInRow(double[][] data, int row) {
		double LowRow=data[row][0];
        for(int i=0;i<data[row].length;i++) {   
            if(data[row][i]<LowRow) {
            	LowRow= data[row][i];	
            }
        }
        return LowRow;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowestRow = data[row][0];
        for (int j = 0; j < data[row].length; j++) {
            if (lowestRow > data[row][j]) {
                lowestRow = data[row][j];
            }
        }
        return (int) lowestRow;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		double totalRow = 0;
        for (int j = 0; j < data[row].length; j++) {
            totalRow += data[row][j];
        }
        return totalRow;
	}
	
	public static double getTotal(double[][] data) {
		double total=0;
        for(int i=0;i<data.length;i++) {
            for(int j=0;j<data[i].length;j++) {   
            	total += data[i][j];
            }
        }
        return total;
	}
	
	public static double[][] readFile(java.io.File file) {
		  double data[][] = new double[10][10];
	        try {
	            List<String> fileData = Files.readAllLines(file.toPath());
	            int rows = fileData.size();
	            for (int i = 0; i < rows; i++) {
	                String s = fileData.get(i);
	                String strs[] = s.split(" ");
	                for (int j = 0; j < strs.length; j++) {
	                    data[i][j] = Double.parseDouble(strs[j]);
	                }
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return data;
	}
	
	public static void writeToFile(double[][] data, java.io.File outputFile) {
		   String text = "";
	        for (int i=0;i<data.length;i++) {
	            for (int j=0;j<data[i].length;j++) {
	            	text += data[i][j] + " ";
	            }
	            text += "\n";
	        }
	        try {
	            PrintWriter pw = new PrintWriter(outputFile);
	            pw.print(text);
	            pw.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            ;
	        }

	}
	
	
	
	
	
	
	
}
