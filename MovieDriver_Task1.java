import java.util.Scanner;

 

class MovieDriver_Task1{

private String name;

private String rating;

private int numOfTickets;

public MovieDriver_Task1(String aName, String aRating, int aNumOfTickets) {

super();

name = aName;

rating = aRating;

numOfTickets = aNumOfTickets;

}

public String getName() {

return name;

}

public void setName(String aName) {

name = aName;

}

public String getRating() {

return rating;

}

public void setRating(String aRating) {

rating = aRating;

}

public int getNumOfTickets() {

return numOfTickets;

}

public void setNumOfTickets(int aNumOfTickets) {

numOfTickets = aNumOfTickets;

}

public String toString(){

return getName()+" ("+getRating()+") Tickets sold : "+getNumOfTickets();

}




public static void main(String[] args) {

char ch='y';

Scanner sc = new Scanner(System.in);

String name="";

String rating="";

int tickets=0;


while(ch=='y' || ch=='Y'){

System.out.println("Enter the name of movie ");

name = sc.nextLine();

System.out.println("Enter the rating of movie ");

rating = sc.nextLine();

System.out.println("Enter number of tickets sold for this movie");

tickets = sc.nextInt();

sc.nextLine();

MovieDriver_Task1 m = new MovieDriver_Task1(name, rating, tickets);

System.out.println(m);

System.out.println("Goodbye!");

ch = sc.nextLine().charAt(0);

}

sc.close();

}

}