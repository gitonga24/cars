package org.wecacodeit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.hasSize;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Test;
import org.wecacodeit.Review;
import org.wecacodeit.ReviewRepository;

public class ReviewRepositoryTest {
	
	@Resource
	private ReviewRepository underTest;
	
	private Review reviewOne = new Review(1L, "BMW", "Decription", "image url", "Review", "price");
	private Review reviewTwo = new Review(2L, "Honda", "Decription", "image url", "Review", "price1");
	
	
	@Test
	public void shouldFindReviewOneById() {
		underTest = new ReviewRepository (reviewOne);
		Review foundReview = underTest.findOneReview(1L);
		assertThat(foundReview, is(reviewOne));
	}

	@Test 
	public void shouldFindReviewTwoById() {
		underTest = new ReviewRepository (reviewTwo);
		Review foundReview = underTest.findOneReview(2L);
		assertThat(foundReview, is(reviewTwo));
	}
	
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository (reviewOne, reviewTwo); 
		Collection <Review> foundReviews = underTest.findAllReviews();
		assertThat(foundReviews, hasSize(2));
		assertThat (foundReviews, containsInAnyOrder(reviewOne, reviewTwo));
	}
}
