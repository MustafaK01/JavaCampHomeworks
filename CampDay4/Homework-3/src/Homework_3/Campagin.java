package Homework_3;

import java.time.LocalDate;

public class Campagin {
	private int id;
	private int discount;
	private String campaginName;
	private String start;
	private String end;
	private int price;
	
	
	public Campagin(int id, int discount, String start, String end, int price,String campaginName) {
		this.campaginName=campaginName;
		this.id = id;
		this.discount = discount;
		this.start = start;
		this.end = end;
		this.price = price;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaginName() {
		return campaginName;
	}


	public void setCampaginName(String campaginName) {
		this.campaginName = campaginName;
	}


	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
