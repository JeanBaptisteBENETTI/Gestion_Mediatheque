package mediatheque;

public class CD extends Item {
	private int numberOfTracks;

	public CD(int numberOfTracks, String title) {
		super(title);
		this.numberOfTracks = numberOfTracks;
	}

	public int getNumberOfTracks() {
		return this.numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	public void accept(ItemVisitor itemVisitor) {
		itemVisitor.visit(this);
	}

	@Override
	public String toString() {
		return "CD { " + super.toString() + ", numberOfTracks = " + numberOfTracks + " }";
	}
	
}
