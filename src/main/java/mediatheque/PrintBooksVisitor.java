package mediatheque;

public class PrintBooksVisitor implements ItemVisitor {

    public void visit(Book book) {
        System.out.println("Book { title = " + book.getTitle() + " , author = " + book.getAuthor() + " }");
    }

    public void visit (CD cd) {
        // Ne rien faire
    }
}