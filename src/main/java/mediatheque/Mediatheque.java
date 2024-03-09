package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		ItemVisitor printCatalogVisitor = new PrintCatalogVisitor();
		for (Item i : items)
			i.accept(printCatalogVisitor);
	}
	
	public void printOnlyBooks() {
		ItemVisitor printBooksVisitor = new PrintBooksVisitor();
		for (Item i : items) {
			i.accept(printBooksVisitor);
		}
	}

	public void printOnlyCDs() {
		ItemVisitor printCDsVisitor = new PrintCDsVisitor();
		for (Item i : items) {
			i.accept(printCDsVisitor);
		}

	}

}
