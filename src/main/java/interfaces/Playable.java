package interfaces;

public interface Playable {

    public int increaseVol(int x);

    public int decreaseVol(int x);

    public int screenResolution(int x);

    public String toString();
}

class VideoPlayer implements Playable{

    private int vol;
    private int screenResolution;

    @Override
    public int increaseVol(int vol) {
        return this.vol = vol;
    }

    @Override
    public int decreaseVol(int vol) {
        return this.vol = vol;
    }

    @Override
    public int screenResolution(int screenResolution) {
        return this.screenResolution = screenResolution;
    }

    @Override
    public String toString() {
        return "VideoPlayer: {" +
                "Volume: " + vol +
                " ; Screen Resolution: " + screenResolution + "}";
    }
}


class GamePlayer implements Playable{

    private int vol;
    private int screenResolution;

    @Override
    public int increaseVol(int x) {
        this.vol = x;
        if(vol > 10) return 10;
        return vol;
    }

    @Override
    public int decreaseVol(int x) {

        if(x < 0) {
            return 0;
        } else {
            this.vol = x;
            return x;
        }

    }

    @Override
    public int screenResolution(int x) {
        this.screenResolution = x;
        switch(x){
            case 240: ;
                return 240;

            case 360:
                return 360;

            case 720:
                return 720;

            default:
                System.out.println("Selection invalid.");
                return 0;
        }
    }

    @Override
    public String toString() {
        return "GamePlayer: {" +
                "Volume: " + vol +
                " ; Screen Resolution: " + screenResolution + "}";
    }
}