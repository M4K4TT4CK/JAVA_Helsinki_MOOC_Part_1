
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared){
        // compare if Object equlas compared in memory
        if(this == compared){
            return true;
        }
        // if it is not an instance of Song
        if(!(compared instanceof Song)){
            return false;
        }
        // create new object of Song of comparedSong
        Song comparedSong = (Song) compared;

        // if the value of the objects are equal than the songs are equal
        if(this.artist.equals(comparedSong.artist) &&
        this.name.equals(comparedSong.name) &&
        this.durationInSeconds == comparedSong.durationInSeconds) {
        return true;

        }
        // otherwise objects are not the same
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
