package functionaltests.cukes.data.redskyproduct;


public class Price {
	
	int partNumber;
	int channelAvailability;
	ListPrice listPrice;
	OfferPrice offerPrice;
	String ppu;
	boolean mapPriceFlag;
	
	
	
	public int getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}
	public int getChannelAvailability() {
		return channelAvailability;
	}
	public void setChannelAvailability(int channelAvailability) {
		this.channelAvailability = channelAvailability;
	}
	public ListPrice getListPrice() {
		return listPrice;
	}
	public void setListPrice(ListPrice listPrice) {
		this.listPrice = listPrice;
	}
	public OfferPrice getOfferPrice() {
		return offerPrice;
	}
	public void setOfferPrice(OfferPrice offerPrice) {
		this.offerPrice = offerPrice;
	}
	public String getPpu() {
		return ppu;
	}
	public void setPpu(String ppu) {
		this.ppu = ppu;
	}
	public boolean isMapPriceFlag() {
		return mapPriceFlag;
	}
	public void setMapPriceFlag(boolean mapPriceFlag) {
		this.mapPriceFlag = mapPriceFlag;
	}

}
