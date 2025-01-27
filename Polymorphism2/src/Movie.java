public class Movie {
    private String title;
    private String director;

    public Movie(String title, String director){
        this.title = title;
        this.director = director;
    }

    public void Play(){
        System.out.println("The \'" + getTitle() +"\' movie is directed by " + getDirector());
    }

    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }
}

class ActionMovie extends Movie{
    public ActionMovie(String title, String director){
        super(title, director);
    }

    @Override
    public void Play() {
        System.out.println("The Action movie \'" + getTitle() + "\' is directed by " + getDirector());
    }
}

class HorrorMovie extends Movie{
    public HorrorMovie(String title, String director){
        super(title, director);
    }

    @Override
    public void Play() {
        System.out.println("The Horror Movie \'" + getTitle() + "\'" +
                " is directed by " + getDirector());
    }
}

class Main1{
    public static void main(String[] args) {
        Movie m = new Movie("The Start", "Mark Twain");
        ActionMovie am = new ActionMovie("Fighter", "Anubhav Sinha");
        HorrorMovie horrorMovie = new HorrorMovie("The Red Eye", "Ben Clark");

        m.Play();
        am.Play();
        horrorMovie.Play();
    }
}