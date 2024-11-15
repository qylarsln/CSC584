/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naim
 */
import java.util.ArrayList; // import the built-in ArrayList
import java.util.Scanner;

/**
 * A sample program that illustrate the use of ArrayList class in Java API
 * @author Zulaile Mabni
 */
public class MainBook
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<Book>(); // declare ArrayList object studList
        
        String bk;int pc; int yr; String au;
       // String nm;long id; int sc;
        
        System.out.print ("Number of books:");
        int num = in.nextInt();
        
        for (int i = 0; i < num; i++)
        {
            // 1- input data for the student here
            System.out.print("\nEnter title : ") ;
            bk = (in.next());
        
            System.out.print("Book price : ") ;
            pc = in.nextInt() ;
        
            System.out.print("Book year: ") ;
            yr = in.nextInt() ;
            
            System.out.print("Book au: ") ;
            au = in.next() ;
            
            Book book = new Book (bk, pc, yr,au); // 2- store data
            bookList.add(book); // 3- add/insert data at the end of ArrayList
        }
        System.out.println(" \nBook Details: ");
        for (int i = 0; i < bookList.size(); i++)
            System.out.println(bookList.get(i));
        
        // Calculate the total score
        int total = 0, avg;
        for (int i = 0; i < bookList.size(); i++)
        {
            Book book = bookList.get(i); // step 1 - retrieve object
            total = total + book.getPrice();// step 2 - retrieve score
        }
            System.out.println("\nThe total price: "+ total);
         // Complete the exercises 
         
        double average = (double) total / num;
        System.out.println("The average price: " + average);//1. Calculate and display the average of prices
        
         // Initialize minYear to maximum value possible
          // Initialize minYear to maximum value possible
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < bookList.size(); i++)
        {
            Book book = bookList.get(i);
            if (book.getPrice() < minPrice)
                minPrice = book.getPrice();
        }
        System.out.println("The minimum price: " + minPrice);//2. Calculate and display the minimum price

        int maxPrice = Integer.MIN_VALUE;
        for (int i = 0; i < bookList.size(); i++)
        {
            Book book = bookList.get(i);
            if (book.getPrice() > maxPrice)
                maxPrice = book.getPrice();
        }

        //Remove the book with the maximum price
        for (int i = 0; i < bookList.size(); i++)
        {
            Book book = bookList.get(i);
            if (book.getPrice() == maxPrice)
                bookList.remove(i);
        }

        System.out.println("The maximum price: " + maxPrice);//3. Calculate and display the maximum price
        System.out.println("Book Details after removing the book with the maximum price: ");
        for (int i = 0; i < bookList.size(); i++)
            System.out.println(bookList.get(i));
        
        
        int i = 10;
        int e = 20;
        int t = i +e;
        System.out.println(t);
        
      
    }}
