package org.wecacodeit;

public class Review {

	private Long id;
	private String name;
	private String description;
	private String image;
	private String marketStatement;
	private String price;
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription () {
		return description; 
	}
	
	public String getImage() {
		return image;
	}
	
	public String getPrice() {
		return price;
	}
	
	public String getMarketStatement() {
		return marketStatement;
	}
		
	public Review(long id, String name, String description, String image, String marketStatement, String price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.marketStatement = marketStatement;
		this.price = price;
	}




}
