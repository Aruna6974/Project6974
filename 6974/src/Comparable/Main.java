package Comparable;

import java.util.*;
import java.util.*;

//Driver class
	class Main
	{
		public static void main(String[] args)
		{
			ArrayList<Movie> list = new ArrayList<Movie>();
			list.add(new Movie("RRR", 10, 2022));
			list.add(new Movie("Beast",8.3,2021));
			list.add(new Movie("Radhey Sham", 8.9, 2022));
			list.add(new Movie("Acharya", 9.0, 2021));

			Collections.sort(list);

			System.out.println("Movies after sorting : ");
			for (Movie movie: list)
			{
				System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
			}
		}
	}



