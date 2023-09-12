package library;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		Book b[]=new Book[5];
		int ch;
		int i=0;
		int bkid=0;
		
		do {
		
			System.out.println("Menu: \n1.Add Book \n2.Display Book \n3.Search Book \n4.Delete Book \n5.Exit");
			System.out.println("Enter your choice ");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				
				System.out.println("Enter Book name : ");
				String booknm=sc.next().toUpperCase();
				System.out.println("Enter Book author : ");
				String bkauthor=sc.next().toUpperCase();
				
				bkid++;
				b[i]=new Book(booknm, bkauthor, bkid );
				
				
				i++;
				break ;
				 
			case 2:	
				System.out.println("Book List -----------> ");
				try {
				for(int i1=0; i1<=b.length; i1++) {
				b[i1].Display();
				
				
				}
				}
				catch(NullPointerException e) {
					break;
				}
				break;
				
			case 3:
				System.out.println("Search Book : ");
				String search_book=sc.next().toUpperCase();
				try {
				for(i=0; i<=b.length; i++ ) {
					if(b[i].getName().equals(search_book)) {
						b[i].Display();
						}	
					}
				}
				
					catch(NullPointerException e)
					{
						break;
					}
					
				break;
			
			
			case 4:
				System.out.println("Enter Book id :  ");
				int delete_book= sc.nextInt();
				delete_book-=1;
				
				try {
				for (int i2 = 1; i2 <= b.length; i2++) {

					if (b[i2] == b[delete_book]) {
						b[delete_book] = new Book( null,null,0 );
						System.out.println("Record deleted successfully !");
						
						break;

					}

				}
				}
				catch(ArrayIndexOutOfBoundsException e) {
				
					System.out.println("Book id invalid !");
				}
				break;
				
			case 5:
				System.out.println("Thank you...");
				System.exit(0);
				break;
				
			default:
				System.out.println("Wrong input !...");
			}
}while(ch!=5);
sc.close();



		}
	}
