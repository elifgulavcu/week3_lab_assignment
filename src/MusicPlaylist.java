public class MusicPlaylist {
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    public MusicPlaylist(){
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    public void addSong(String songName){
        SongNode newNode = new SongNode(songName);

        if (head == null){
            head = newNode;
            tail = newNode;
            current = newNode;
            System.out.println("the first song added: " + songName);
        }else{
            tail.next = newNode;
            newNode.prev = tail ;
            tail = newNode;
            System.out.println("new song added: " + songName);
        }
    }

    public void removeSong(String songName){
        System.out.println("=== AFTER REMOVING " + songName + " SONG ===");
        if (head == null){
            System.out.println("The list is already empty, there are not song to delete. ");
            return;
        }

        SongNode currentPtr = head ;

        while ( currentPtr != null && !currentPtr.songName.equals(songName)){
            current = currentPtr.next;
        }

        if (currentPtr == null){
            System.out.println("song not found: "+ songName);
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            current = null;
        }else if (currentPtr == head){
            head = head.next;
            head.prev = null;
            if (current == currentPtr){
                current = head;
            }
        } else if (currentPtr == tail) {
            tail = tail.prev;
            tail = tail.prev;
            if(current == currentPtr){
                current = tail;
            }
        }else{
            currentPtr.prev.next= currentPtr.next;
            currentPtr.next.prev = currentPtr.prev;
            if(current == currentPtr){
                current = currentPtr.next;
            }
        }

        System.out.println("Removed: "+ songName);
    }

    public void moveToNext(){
        System.out.println("=== NEXT SONG TO PLAY ===");
        if (head == null || current == null){
            System.out.println("playlist is empty.");
            return;
        }
        if ( current.next != null){
            current = current.next;
            System.out.println("Playing: " + current.songName);
        }else{
            System.out.println("Already at the last song of the playlist.");
        }
    }

    public void moveToPrevious() {
        System.out.println("=== PREVIOUS SONG TO PLAY ===");
        if (head == null || current == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.songName);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }

    public void displayCurrentSong(){
        if ( current == null){
            System.out.println("=== CURRENT SONG PLAYING ===");
        }else{
            System.out.println("Current Song: "+ current.songName);

        }
    }

    public void displayAllSong(){
        System.out.println("=== PLAYLIST ===");
        if( head == null){
            System.out.println("END");
            return;
        }
        SongNode temp = head ;

        while(temp != null){
            if(temp == current){
                System.out.println(temp.songName + " <-> ");
            }else{
                System.out.println("  " + temp.songName);
            }
            temp = temp.next;
        }

        System.out.println("END");
    }


}
