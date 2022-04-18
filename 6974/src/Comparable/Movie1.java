package Comparable;

import java.util.Comparator;

//A Java program to demonstrate Comparator interface

	 
	// A class 'Movie' that implements Comparable
	class Movie1 implements Comparable<Movie1>
	{
	    private double rating;
	    private String name;
	    private int year;
	 
	    // Used to sort movies by year
	    public int compareTo(Movie1 m)
	    {
	        return this.year - m.year;
	    }
	 
	    // Constructor
	    public Movie1(String nm, double rt, int yr)
	    {
	        this.name = nm;
	        this.rating = rt;
	        this.year = yr;
	    }
	 
	    // Getter methods for accessing private data
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
	 
	// Class to compare Movies by ratings
	class RatingCompare implements Comparator<Movie1>
	{
	    public int compare(Movie1 m1, Movie1 m2)
	    {
	        if (m1.getRating() < m2.getRating()) return -1;
	        if (m1.getRating() > m2.getRating()) return 1;
	        else return 0;
	    }
	}
	 
	// Class to compare Movies by name
	class Namecompare2 implements Comparator<Movie1>
	{
	    public int compare(Movie1 m1, Movie1 m2)
	    {
	        return m1.getName().compareTo(m2.getName());
	    }
	}


