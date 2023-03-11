package Lecture.Streams.Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductReviews {
    public static void main(String[] args) {
        List<ProductReview> reviews = new ArrayList<>();
        reviews.add(new ProductReview("iPhone 12", "Great phone, highly recommend it", 5));
        reviews.add(new ProductReview("Samsung Galaxy S21", "Good phone, but not as good as the iPhone", 4));
        reviews.add(new ProductReview("Sony Playstation 5", "Amazing console, love the graphics", 5));
        reviews.add(new ProductReview("Microsoft Xbox Series X", "Decent console, but the UI could be better", 3));
        reviews.add(new ProductReview("LG OLED TV", "Best TV I've ever owned, picture quality is outstanding", 5));

        int minRating = 4;
        List<ProductReview> highRatingReviews = reviews.stream()
                .filter(r -> r.getRating() > minRating)
                .collect(Collectors.toList());

        System.out.println("Product reviews with rating above " + minRating + ": " + highRatingReviews);
    }
}

class ProductReview {
    private String productName;
    private String reviewText;
    private int rating;

    public ProductReview(String productName, String reviewText, int rating) {
        this.productName = productName;
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public String getProductName() {
        return productName;
    }

    public String getReviewText() {
        return reviewText;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "ProductReview{" +
                "productName='" + productName + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", rating=" + rating +
                '}';
    }
}
