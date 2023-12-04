import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    public void start(){

        //Game Login//

        System.out.println("Welcome Adventurer , please enter your name :");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("This is a good name "+player.getPlayerName()+",now we need to select a class :");
        player.selectChar();
        player.selectLocation();









    }
}
