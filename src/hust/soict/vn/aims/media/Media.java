package hust.soict.vn.aims.media;

public abstract class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
	public Media() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Media))
			return false;
		Media m1 = (Media) obj;
		if (m1.getTitle() == this.getTitle())
			return true;
		else return false;
	}
	
	public abstract String toString();
}
