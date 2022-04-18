package Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Movie2 implements Comparable<Movie2>
{
	private double rating;
	private String name;
	private int year;
	
	//used to sort movies by year
	public int compareTo(Movie2 m2)
	{
		return this.year - m2.year;
	}
	//Constructor
	public Movie2(String nm,double rt,int yr)
	{
		this.name=nm;
		this.rating=rt;
		this.year=yr;
	}
	//Getter methods for accessing private data
	public double getRating()
	{
		return rating;
	}
	public String getName()
	{
		return name;
	}
	public int getYear()
	{
		return year;
	}
	
}
public class Main2 
{

	public static void main(String[] args) 
	{
		ArrayList<Movie2> list = new ArrayList<Movie2>();
		list.add(new Movie2("RRR",9.5,2022));
		list.add(new Movie2("Pushpa",9.0,2022));
		list.add(new Movie2("Acharya",8.3,2021));
		list.add(new Movie2("Radhey Sham",8.9,2022));
		
		Collections.sort(list);
		System.out.println("Movie2 after sorting : ");
		for(Movie2 movie2 : list)
		{
			System.out.println(movie2.getName() + " "+movie2.getRating() + " "+movie2.getYear());
		}

	}

}
