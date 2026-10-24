public class MusicPlayerDemo {
    public static void main(String[] args){
        MusicPlaylist myPlaylist = new MusicPlaylist();

        myPlaylist.addSong("Shape of You - Ed Sheeran");
        myPlaylist.addSong("Save Me - BTS");
        myPlaylist.addSong("Snap - Manifest");
        myPlaylist.addSong("like JENNIE - JENNIE");

        myPlaylist.displayCurrentSong();

        myPlaylist.displayCurrentSong();

        myPlaylist.moveToNext();

        myPlaylist.moveToNext();

        myPlaylist.moveToPrevious();

        myPlaylist.removeSong("Shape of You - Ed Sheeran");

        myPlaylist.removeSong("Snap - Manifest");

    }
}