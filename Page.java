package application;

public class Page {
	protected String desc;
	protected String image;
	protected int pageNb;
	protected String cat;
	protected String title;
	
	public Page(String desc, String image, int pageNb, String cat, String title) {
		super();
		this.desc = desc;
		this.image = image;
		this.pageNb = pageNb;
		this.cat = cat;
		this.title = title;
	}
	
}
