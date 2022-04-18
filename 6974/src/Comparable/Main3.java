package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie3 
{
	private double rating;
	private String name;
	private int year;


	// Constructor
	public Movie3(String name, Double rating, int year) 
	{
		this.name = name;
		this.rating = rating;
		this.year = year;
	}


	public double getRating()
	{
		return rating;
	}


	public double setRating()
	{
		 return this.rating = rating;
	}


	public String getName() 
	{
		return name;
	}


	public String setName() 
	{
		return this.name = name;
	}


	public int getYear() 
	{
		return year;
	}


	public int setYear() 
	{
		 return this.year = year;
	}


	@Override
	public String toString() 
	{
		return "Movie3 (rating=" + rating + ", name=" + name + ", year=" + year + ")";
	}

}
//class to compare movies by year
class YearCompare implements Comparator<Movie3>
{

		@Override
		public int compare(Movie3 o1, Movie3 o2) 
		{
			return o1.getYear()-o2.getYear();
		}
	
}

// class to compare movies by rating
class RatingCompare1 implements Comparator<Movie3>
{
	@Override
	public int compare(Movie3 m1, Movie3 m2) 
	{
		if (m1.getRating() < m2.getRating()) 
		{
			return -1;
		}
		else if (m1.getRating() > m2.getRating())
		{
			return 1;
		} 
		else 
		{
			return 0;
		}
	}
}

	// class to Comapre Movies by Name
	class Namecompare1 implements Comparator<Movie3> 
	{ 
		@Override
		public int compare(Movie3 m1, Movie3 m2)
		{
			return m1.getName().compareTo(m2.getName());
		}
	}



public class Main3 
{

	public static void main(String[] args)
	{
		ArrayList<Movie3> list = new ArrayList<Movie3>();
		list.add(new Movie3("Billa", 8.4, 2004));
		list.add(new Movie3("Star Wars", 8.7, 1977));
		list.add(new Movie3("Julayi", 8.6, 2002));
		list.add(new Movie3("Beast",7.5,2022));

		// sort by rating
		System.out.println("Sorted by rating");
		RatingCompare1 ratingcompare = new RatingCompare1();
		Collections.sort(list, ratingcompare);
		for (Movie3 movie3 : list) 
		{
			System.out.println(movie3.getRating() + " " + movie3.getName() + " " + movie3.getYear());
		}
		System.out.println("......................");
		
		// sort by name
		System.out.println("Sorted by name");
		
		  Namecompare1 namecompare = new Namecompare1();
		  
		 Collections.sort(list, namecompare); 
		 for (Movie3 movie3 : list) 
		 {
		  System.out.println(movie3.getName() + " " + movie3.getRating() + " " + movie3.getYear());
		  
		  }
		 System.out.println("......................");
		 
		 // sort by year
		System.out.println("sorted by year");
         YearCompare yearcompare = new YearCompare();
		Collections.sort(list, yearcompare);
		for (Movie3 movie3 : list) {
			System.out.println(movie3.getYear() + " " + movie3.getRating() + " " + movie3.getName());
		}

	}

}
