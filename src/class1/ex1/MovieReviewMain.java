package class1.ex1;

public class MovieReviewMain {
    public static void main(String[] args){
        MovieReview[] movieReviews = new MovieReview[2];
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title="1";
        movieReview1.review="good";
        movieReviews[0]=movieReview1;

        MovieReview movieReview2= new MovieReview();
        movieReview2.title="2";
        movieReview2.review="bad";
        movieReviews[1]=movieReview2;

        for( MovieReview m : movieReviews){
            System.out.println("title: "+ m.title + " review: "+ m.review);
        }

    }
}
