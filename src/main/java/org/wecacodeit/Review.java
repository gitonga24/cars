package org.wecacodeit;

public class Review {

	private Long id;
	private String name;
	private String description;
	private String image;
	
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
	
	public Review(long id, String name, String description, String image, String string4, String string5) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
	}


}
