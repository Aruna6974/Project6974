package Comparable;

import java.util.ArrayList;
import java.util.Collections;

//Driver class
class Main1
{
 public static void main(String[] args)
 {
     ArrayList<Movie1> list = new ArrayList<Movie1>();
     list.add(new Movie1("RRR",10,2022));
     list.add(new Movie1("Beast",8.3,2021));
     list.add(new Movie1("Radhey Sham", 8.9, 2022));
     list.add(new Movie1("Acharya", 9.0, 2021));

     // Sort by rating : (1) Create an object of ratingCompare
     //                  (2) Call Collections.sort
     //                  (3) Print Sorted list
     System.out.println("Sorted by rating");
     RatingCompare ratingCompare = new RatingCompare();
     Collections.sort(list, ratingCompare);
     for (Movie1 movie1: list)
         System.out.println(movie1.getRating() + " " + movie1.getName() + " " + movie1.getYear());


     // Call overloaded sort method with RatingCompare
     // (Same three steps as above)
     System.out.println("\nSorted by name");
     Namecompare nameCompare = new Namecompare();
     Collections.sort(list, nameCompare);
     for (Movie1 movie1: list)
         System.out.println(movie1.getName() + " " + movie1.getRating() + movie1.getYear());

     // Uses Comparable to sort by year
     System.out.println("\nSorted by year");
     Collections.sort(list);
     for (Movie1 movie1: list)
         System.out.println(movie1.getYear() + " " + movie1.getRating() + " " + movie1.getName()+" ");
 }
} 