package org.wecacodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	private Review reviewOne = new Review(1L, "BMW1", "Dimensions: 186 L x 73 W x 56 H", "images/BMW.jpg", "Review", "Content");
	private Review reviewTwo = new Review(2L, "Audi A4", "Curb weight: 3,450 to 3,627 lbs", "images/Audi.jpg", "Review2", "Content2");
	private Review reviewThree = new Review(3L, "Honda Accord", "MPG: Up to 30 city / 38 highway", "images/Honda.jpg", "Review2", "Content2");
	
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
