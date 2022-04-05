package Thread;
class BookMyShow 
{
	int Total_Tickets=12;
	synchronized public void bookTickets(int requestTickets)
	{
		if(Total_Tickets>=requestTickets)
		{
			Total_Tickets=Total_Tickets-requestTickets;
			System.out.println(Thread.currentThread().getName()+"Has Booked "+requestTickets+"Tickets And remaining are "+Total_Tickets+"Tickets");
		}
		else
		{
			System.out.println("Sorry only"+Total_Tickets+"are remaining");
		}
	}
}
public class MyMovieApp extends Thread
{
	BookMyShow bookMyShow;
	int bookticket;
	public MyMovieApp(BookMyShow obj)
	{
        bookMyShow=obj;
	}
	public void run()
	{
		bookMyShow.bookTickets(bookticket);
	}

	public static void main(String[] args) 
	{
		BookMyShow obj=new BookMyShow();
		MyMovieApp movie=new MyMovieApp(obj);
		movie.setName("Surya");
		movie.bookticket=6;
		
		movie.start();
		
		BookMyShow obj1=new BookMyShow();
		MyMovieApp movie1=new MyMovieApp(obj);
		movie1.setName("Mani");
		movie1.bookticket=5;
		
		movie1.start();
		
		BookMyShow obj2=new BookMyShow();
		MyMovieApp movie2=new MyMovieApp(obj);
		movie2.setName("Aruna");
		movie2.bookticket=3;
		
		movie2.start();
		
		
		
	}
	

}
