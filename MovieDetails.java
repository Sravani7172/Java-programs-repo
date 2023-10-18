import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Movie {
    private String title;
    private String director;
    private String actors;
    private List<String> reviews;
    public Movie(String title, String director, String actors){
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }
    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public String getActors() {
        return actors;
    }
    public List<String> getReviews() {
        return reviews;
    }
    public void addReview(String review) {
        reviews.add(review);
    }  
    
}
public class MovieDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the movie director: ");
        String director = scanner.nextLine();
        System.out.print("Enter the movie actors: ");
        String actors = scanner.nextLine();
        Movie movie = new Movie(title, director, actors);
        System.out.print("Enter the number of reviews: ");
        int numberOfReviews = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numberOfReviews; i++) {
            System.out.print("Enter a review: ");
            String review = scanner.nextLine();
            movie.addReview(review);
        }
        scanner.close();
    }
}
