package learningpolymorphism;

public class ApexLegends extends Game{
    private String genre;

    public void game(){
        System.out.println("This is Apex Legends");
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
}
