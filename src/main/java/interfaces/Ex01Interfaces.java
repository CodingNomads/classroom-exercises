package interfaces;


/**
 * Create a couple of classes that have some behaviour and some specific behaviour in common
 * and extract an interface with the common behaviour.
 * <p>
 * Put all the created classes into an array and iterate calling a method from the interface.
 */
public class Ex01Interfaces{

    public static void main(String[] args) {
        Playable myVideoPlayer = new VideoPlayer();
        myVideoPlayer.increaseVol(2);
        myVideoPlayer.screenResolution(140);

        Playable myGamePlayer = new GamePlayer();
        myGamePlayer.decreaseVol(-10);
        myGamePlayer.screenResolution(240);

        Playable myMusicPlayer = new VideoPlayer();
        myMusicPlayer.increaseVol(1);
        myMusicPlayer.screenResolution(720);

        Playable[] myPlayers = new Playable[3];
        myPlayers[0] = myVideoPlayer;
        myPlayers[1] = myGamePlayer;
        myPlayers[2] = myMusicPlayer;

        for(int i = 0; i< myPlayers.length; i++){
            System.out.println(myPlayers[i].toString());
        }
    }


}

