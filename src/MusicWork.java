import java.util.ArrayList;
import java.util.List;

class MusicWork {
    private String name;
    private int duration;
    private MusicalMedium musicalMedia;

    public MusicWork(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void setMusicalMedia(MusicalMedium musicalMedia) {
        this.musicalMedia = musicalMedia;
    }

    public MusicalMedium getMusicalMedia() {
        return musicalMedia;
    }
}
