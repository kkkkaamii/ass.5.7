import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class MusicalMedium {
    private String authorGroup;
    private String genre;
    private int yearOfManufacture;
    private List<MusicWork> musicalWorks = new ArrayList<>();
    private Collection collection;

    public MusicalMedium(String authorGroup, String genre, int yearOfManufacture) {
        this.authorGroup = authorGroup;
        this.genre = genre;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void addMusicalWork(MusicWork work) {
        musicalWorks.add(work);
        work.setMusicalMedia(this);
    }

    public String getAuthorGroup() {
        return authorGroup;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public List<MusicWork> getMusicalWorks() {
        return musicalWorks;
    }

    public int getTotalDurationOfSound() {
        int total = 0;
        for (MusicWork work : musicalWorks) {
            total += work.getDuration();
        }
        return total;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Collection getCollection() {
        return collection;
    }
}
