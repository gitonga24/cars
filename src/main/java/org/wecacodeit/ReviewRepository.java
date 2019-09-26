package org.wecacodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	private Review reviewOne = new Review(1L, "Lamborghini", "Dimensions: 186 L x 73 W x 56 H", "images/Lamborghini_I.jpg", "Lamborghini defines the requirements of the third millennium in terms of energy storage and innovative materials to secure the most emotional and ultimate driving experience.", "$450,000");
	private Review reviewTwo = new Review(2L, "Rolls-Royce Phantom", "Curb weight: 3,450 to 3,627 lbs", "images/Rolls_Royce_II.jpg", "The Rolls-Royce Phantom VIII is a full-sized luxury saloon manufactured by Rolls-Royce Motor Cars. It is the eighth and current generation of the Rolls-Royce Phantom, and the second launched by Rolls-Royce under BMW ownership. It is offered in two wheelbase lengths.", "$80,000");
	private Review reviewThree = new Review(3L, "Buhatti", "MPG: Up to 30 city / 38 highway", "images/Bugatti.jpg", "The modernized and reinterpreted supercar – which features six exhaust pipes. It was sold to an anonymous male buyer , who agreed to buy the car based only on plans before Bugatti began to build it.", "$19,000,000");
	
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
