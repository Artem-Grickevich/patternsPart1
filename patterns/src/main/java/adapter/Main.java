package adapter;

public class Main {
    public static void main(String[] args) {
        ProductSystem productSystem = new ProductSystem();
        ISong newSong = new FormatSongAdapter(new ExternalSource());
        productSystem.checkSong(newSong.getSong("newSongEndpoint"));
    }
}