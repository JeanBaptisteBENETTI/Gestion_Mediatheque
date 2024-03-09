package mediatheque;

public abstract class Item {
	private String title;

	protected Item(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public abstract void accept(ItemVisitor itemVisitor);

	@Override
	public String toString() {
		return "title = " + title ;
	}
	
}
