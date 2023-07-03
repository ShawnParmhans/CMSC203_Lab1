/*
 Class: CMSC203 CRN 40398
 Program: Lab 1
 Instructor: Farnaz Eivazi
 Summary of Description: Movie Driver class
 Due Date: 07/02/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Shawn Parmhans
*/

import java.util.Scanner;

public class MovieDriver 
{
	public static void main(String[] args)
	{
		//task 1
        Scanner keyboard = new Scanner(System.in);
        Movie movie = new Movie();
//Ask for movie info
        System.out.print("Enter title: ");
        String title = keyboard.nextLine();
        movie.setTitle(title);

        System.out.print("Enter movie rating: ");
        String rating = keyboard.nextLine();
        movie.setRating(rating);

        System.out.print("Enter the number of tickets sold: ");
        int soldTickets = keyboard.nextInt();
        movie.setSoldTickets(soldTickets);
//print movie info
        System.out.println(movie.toString());
      
        keyboard.close();
	}
}
