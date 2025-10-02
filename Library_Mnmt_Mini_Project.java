// Use Methods --->  AddBook(), ShowAvailableBooks(), IssueBooks(), & RetirnBooks().

class Library{
    String[] LibBooks;
    int num_of_books;

    Library(){
        this.LibBooks = new String[100];
        num_of_books = 0;
    }

    public void AddBook(String book){
        LibBooks[num_of_books]=book;
        this.num_of_books++;
        // System.out.println("Book Has Been Added ..!!");   // It is Spamming Always When EAch Book Is Added
    }

    public void ShowAvailableBooks(){
        for (int i =0 ; i<this.LibBooks.length; i++) {
            if (LibBooks[i]==null) {
                continue;
            }
            System.out.println("* "+LibBooks[i]);
        }
    }

    public void IssueBooks(String book){
        System.out.println("Checking For Availability of Books ");
        for (int i = 0; i < LibBooks.length; i++) {
            if (LibBooks[i] != null && LibBooks[i].equalsIgnoreCase(book)) {
                System.out.println("Book Available & ISSUED >>");
                LibBooks[i]=null;
                return;
            }
        }
        System.out.println("Sorry, Book Is UNAVAILABLE");
    }

    public void returnBook(String book){
        System.out.println("Returning The Book..!!");
        for(int i = 0; i<LibBooks.length; i++){
            if (LibBooks[i]==null) {
                System.out.println("Book Returned Thanks For Punctuality");
                LibBooks[i]=book;
                return;
            }

        }
        
    }

}

public class Library_Mnmt_Mini_Project {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        myLibrary.AddBook("Pranav Dudhe Ek Prem Katha");
        myLibrary.AddBook("Algorithms");
        myLibrary.AddBook("C++");
        myLibrary.AddBook("DSA");
        myLibrary.AddBook("Java");
        myLibrary.AddBook("Operating System");
        myLibrary.AddBook("Rich Dad Poor Dad");
        myLibrary.AddBook("Breaking Bad");
        myLibrary.AddBook("Python");
        myLibrary.AddBook("JavaScript");
        myLibrary.ShowAvailableBooks();
        myLibrary.IssueBooks("C++");
        myLibrary.ShowAvailableBooks();
        myLibrary.returnBook("C++");
        myLibrary.ShowAvailableBooks();

    }
}
