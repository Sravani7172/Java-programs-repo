import java.util.Scanner;
class Movie{
    private String title;
    private String director;
    private String actors;
    private String reviews;
    public void setMovie(String title,String director,String actors,String reviews){
        this.title=title;
        this.director=director;
        this.actors=actors;
        this.reviews=reviews;
    }
    public String gettitle(){
        return this.title;
    }
    public String getdirector(){
        return this.director;
    }
    public String getactors(){
        return this.actors;
    }
    public String getreviews(){
        return this.reviews;
    }
}
public class MovieReview {
    public static void main(String[]args){
        Movie movie = new Movie();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the title of the movie:");
        String title=scan.nextLine();
        System.out.println("Enter the director of the movie:");
        String director=scan.nextLine();
        System.out.println("Enter the actor of the movie:");
        String actor=scan.nextLine();
         System.out.println("Enter the reviews of the movie");
         String reviews=scan.nextLine();
    }
    
}
