package mediatheque;

public class PrintCDsVisitor implements ItemVisitor {

    public void visit(CD cd) {
        System.out.println("CD { title = " + cd.getTitle() + " , numberOfTracts = " + cd.getNumberOfTracks() + " }");
    }

    public void visit(Book book) {
        // Ne rien faire
    }
}
