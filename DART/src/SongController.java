import java.util.ArrayList;

public class SongController {

    static ArrayList<Rentable> songList = new ArrayList();

    public static void customerViewAllSongs(){

        for ( Rentable song : songList) {
            System.out.println(song.toString());
        }
    }

    public static void empViewAllSongs(){
        for ( Rentable song : songList) {
            System.out.println(song.toString());
        }
        Screens.employeeScreen();
    }
}
