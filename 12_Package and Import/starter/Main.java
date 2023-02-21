import model.Game;
import model.Team;

public class Main {

    public static void main(String[] args) {

        /* package and import
         * - package: specifies the package that a class belongs to
         * - import: allows you to use classes that exist in other packages
         */
        
        Team bulls = new Team("Chicago Bulls");
        bulls.setPlayer("SHOOTING_GUARD", "Michael Jordan");
        bulls.setPlayer("SMALL_FORWARD", "Scottie Pippen");
        bulls.setPlayer("POWER_FORWARD", "Dennis Rodman");
        bulls.setPlayer("CENTER", "Bill Wennington");
        bulls.setPlayer("POINT_GUARD", "Randy Brown");

        Team pistons = new Team("Detroit Pistons");
        pistons.setPlayer("SHOOTING_GUARD", "Joe Dumars");
        pistons.setPlayer("SMALL_FORWARD", "Grant Hill");
        pistons.setPlayer("POWER_FORWARD", "Otis Thorpe");
        pistons.setPlayer("CENTER", "William Bedford");
        pistons.setPlayer("POINT_GUARD", "Isiah Thomas");

        Game game = new Game("Etihad Stadium");
        game.begin(bulls, pistons);
    }

}
