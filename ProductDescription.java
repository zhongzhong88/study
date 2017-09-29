package functionaltests.cukes.data.redskyproduct;


public class ProductDescription {
	
	
	String title;
	int parent_items;
	String buy_url;
	String general_description;
	String[] bullet_description;
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBuy_url() {
		return buy_url;
	}
	public void setBuy_url(String buy_url) {
		this.buy_url = buy_url;
	}
	public String getGeneral_description() {
		return general_description;
	}
	public void setGeneral_description(String general_description) {
		this.general_description = general_description;
	}
	public String[] getBullet_description() {
		return bullet_description;
	}
	public void setBullet_description(String[] bullet_description) {
		this.bullet_description = bullet_description;
	}
	public int getParent_items() {
		return parent_items;
	}
	public void setParent_items(int parent_items) {
		this.parent_items = parent_items;
	}
	
	
	
	
}
