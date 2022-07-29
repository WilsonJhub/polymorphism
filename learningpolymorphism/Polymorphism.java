package learningpolymorphism;


public class Polymorphism {
    public static void main(String[] args){

        Game myGame = new Game();

        myGame.game();

        ApexLegends newGame = new ApexLegends();
        newGame.game();

        CallOfDuty addGame = new CallOfDuty();
        addGame.game();
    }
}
