/*

Created on Friday 10 April


@author: Deepanshu

*/
import java.util.*;
public class librarymanagment_BY_44
{
	public static void main(String arg[])
	{
	char r;
	do
	 {
		System.out.println("welcome to the library");
		System.out.println("press 1 to add book");
		System.out.println("press 2 to issue a book");
		System.out.println("press 3 to return a book");
		System.out.println("press 4 to print complete issue detail");
		System.out.println("press 5 to exit");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the choice");
		int c=input.nextInt();
		switch(c)
		{
			case 1:
			Library first=new Library();
			first.add();
			break;
			case 2:
			Library second=new Library();
			second.issue();
			break;
			case 3:
			Library third=new Library();
			third.returnbook();
			break;
			case 4:
			Library fourth=new Library();
			fourth.detail();
			break;
			case 5:
			Library fifth=new Library();
			fifth.exit();
			break;
			default:
			System.out.println("wrong choice");
		}
		System.out.println("You want to select again Y/N");
		r=input.next().charAt(0);
	  }
		while(r=='Y'||r=='y');
		if(r=='n'||r=='N')
		{
			Library z=new Library();
			z.exit();
		}
	}
}
class Library
{
	static String name,date,returndate;
	static int no,id;
	void add()
	{
		System.out.println("enter book name,book id");
		Scanner obj=new Scanner(System.in);
		String  name=obj.nextLine();
		int book_id=obj.nextInt();
		System.out.println("your details is    "+name +book_id);
	}
	void issue()
	{
		Scanner obj1=new Scanner(System.in);
		System.out.println("Book name");
		name=obj1.nextLine();
		System.out.println("BOOK_Id");
		id=obj1.nextInt();
		obj1.nextLine();
		System.out.println("issue date");
		date=obj1.nextLine();
		System.out.println("Total no of book issued");
		no=obj1.nextInt();
		obj1.nextLine();
		System.out.println("Return book date");
		returndate=obj1.nextLine();
	}
	int getid()
	{
		return id;
	}
	void returnbook()
	{
		librarymanagment o=new librarymanagment();
		System.out.println("enter book name and book_id");
		Scanner c=new Scanner(System.in);
		String name=c.nextLine();
		int book_id=c.nextInt();
		if(id==book_id)
		{
			System.out.println("All details of the student");
			System.out.println("book name:"+  Library.name);
			System.out.println("book id:"+  Library.id);
			System.out.println("issue date:"+  Library.date);
			System.out.println("total book issued:"+  Library.no);
			System.out.println("book reurn date:"+ Library.returndate);
        }
        else
       {
        	System.out.println("wrong id please input the id again");
        }
	}
	void detail()
	{
		System.out.println("book name:"+  Library.name);
		System.out.println("book id:"+  Library.id);
		System.out.println("issue date"+  Library.date);
		System.out.println("total book issued:"+  Library.no);
		System.out.println("book reurn date:"+  Library.returndate);
	}
	void exit()
	{
		System.exit(0);
	}
}
