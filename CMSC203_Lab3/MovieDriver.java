package CMSC203_Lab3;
import java.util.Scanner;
import CMSC203_Lab3.Movie;
/**
 * MovieDriver
 */
public class MovieDriver {
  public static void main(String[] args) {
    // Create a new object of type Scanner that reads from the keyboard
    Scanner sc = new Scanner(System.in);
    // Create a new movie object
    Movie movie = new Movie();
    Boolean enterMoreMovies = false; 
    do {
      // Prompt the user to enter the title of a movie
      System.out.println("Enter the title of a movie");
      // Read in the line that the user types
      String title = sc.nextLine();
      // Set the title in the movie object
      movie.setTitle(title);
      // Prompt the user to enter the movie’s rating
      System.out.println("Enter the movie's rating");
      // Read in the line that the user types
      String rating = sc.nextLine();
      // Set the rating in the movie object
      movie.setRating(rating);
      // Prompt the user to enter the number of tickets sold at a (unnamed) theater
      System.out.println("Enter the number of tickets sold for this movie");
      // Read in the integer that the user types
      int soldTickets = sc.nextInt();
      // Set the number of tickets sold in the movie object
      movie.setSoldTickets(soldTickets);
      // Print out the information using the movie’s toString method
      String movieInfo = movie.toString();
      System.out.println(movieInfo);
      System.out.println("Do you want to enter another? (y or n)");
      sc.nextLine();
      String answer = sc.nextLine();
      if (answer.toLowerCase().equals("y")) {
        enterMoreMovies = true;
      } else {
        enterMoreMovies = false;
      }
    } while(enterMoreMovies);
    sc.close();
  }
}