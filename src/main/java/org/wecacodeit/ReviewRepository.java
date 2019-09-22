package org.wecacodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	private Review reviewOne = new Review(1L, "BMW1", "Dimensions: 186 L x 73 W x 56 H", "images/BMW.jpg", "Original Meets Innovation in The BMW 3 Series With Back-Up Assistant. Not Every Journey Has An End. Learn More About The 3 Series Today. Dominating Performance. Athletic Aesthetics. Dynamic Engineering. Legendary Design. Advanced Innovations");
	private Review reviewTwo = new Review(2L, "Audi A4", "Curb weight: 3,450 to 3,627 lbs", "images/Audi.jpg", "Experience Life In The Fast Lane. Explore The Audi A4 Sedan Today. Audi Pre Sense City. Audi Virtual Cockpit. Full LED Headlights. Available quattro® AWD. Audi Magnetic Ride. 2.0 TFSI Engine. Models: A3, A4, A6, Q3, Q5, Q7");
	private Review reviewThree = new Review(3L, "Honda Accord", "MPG: Up to 30 city / 38 highway", "images/Honda.jpg", "See What the 2020 Honda Accord Has to Offer. Specs, Prices, Features & More. Cruise Control. Mobile Connectivity. Smart Entry. Brake Assist");
	
	public ReviewRepository() {
		reviewList.put(reviewOne.getId(), reviewOne);
		reviewList.put(reviewTwo.getId(), reviewTwo);
		reviewList.put(reviewThree.getId(), reviewThree);
	}
	
	
	public ReviewRepository(Review...reviews) {
		for (Review review: reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOneReview(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAllReviews() {
		return reviewList.values();
	}

}
