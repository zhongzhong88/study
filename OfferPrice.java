package functionaltests.cukes.data.redskyproduct;

import java.sql.Date;

public class OfferPrice {
	
	double minPrice;
	double maxPrice;
	double price;
	String formattedPrice;
	String priceType;
	Date startDate;
	Date endDate;
	double saveDollar;
	double savePercent;
	String eyebrow;
	
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getSaveDollar() {
		return saveDollar;
	}
	public void setSaveDollar(double saveDollar) {
		this.saveDollar = saveDollar;
	}
	public double getSavePercent() {
		return savePercent;
	}
	public void setSavePercent(double savePercent) {
		this.savePercent = savePercent;
	}
	public String getEyebrow() {
		return eyebrow;
	}
	public void setEyebrow(String eyebrow) {
		this.eyebrow = eyebrow;
	}
	
	
	

}
