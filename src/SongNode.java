public class SongNode {
    String songName;
    SongNode next ;
    SongNode prev;

    public SongNode(String songName){
        this.songName = songName;
        this.next = null;
        this.prev = null;
    }
}
