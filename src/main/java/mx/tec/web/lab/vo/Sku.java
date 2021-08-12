package mx.tec.web.lab.vo;

public class Sku {
	/**
	 * 
	 */
	
	private String id;
	private	String color;
	private String size;
	private double listPrice;
	private double salePrice;
	private long quantityOnHand;
	
	public Sku() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param color
	 * @param size
	 * @param listPrice
	 * @param salePrice
	 * @param quantityOnHand
	 */
	public Sku(String id, String color, String size, double listPrice, double salePrice, long quantityOnHand) {
		this.id = id;
		this.color = color;
		this.size = size;
		this.listPrice = listPrice;
		this.salePrice = salePrice;
		this.quantityOnHand = quantityOnHand;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the listPrice
	 */
	public double getListPrice() {
		return listPrice;
	}
	/**
	 * @param listPrice the listPrice to set
	 */
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}
	/**
	 * @return the salePrice
	 */
	public double getSalePrice() {
		return salePrice;
	}
	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	/**
	 * @return the quantityOnHand
	 */
	public long getQuantityOnHand() {
		return quantityOnHand;
	}
	/**
	 * @param quantityOnHand the quantityOnHand to set
	 */
	public void setQuantityOnHand(long quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
}
