package functionaltests.cukes.data.redskyproduct;


public class ListPrice {
	
	double minPrice;
	double maxPrice;
	double price;
	String formattedPrice;
	String priceType;
	
	
	public double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}
	public double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFormattedPrice() {
		return formattedPrice;
	}
	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	

}
