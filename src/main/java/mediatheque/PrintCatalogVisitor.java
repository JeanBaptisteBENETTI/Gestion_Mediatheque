package mediatheque;

public class PrintCatalogVisitor implements ItemVisitor {

    public void visit(Book book) {
        System.out.println("Book { title = " + book.getTitle() + " , author = " + book.getAuthor() + " }");
    }

    public void visit (CD cd) {
        System.out.println("CD { title = " + cd.getTitle() + " , numberOfTracts = " + cd.getNumberOfTracks() + " }");
    }
}
