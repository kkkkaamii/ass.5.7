public class Main {
    public static void main(String[] args) {

        Collection myCollection = new Collection("My music", "Kami Kami");


        MusicalMedium album1 = new MusicalMedium("Arctic Monkeys", "Indie Rock", 2013);
        MusicalMedium album2 = new MusicalMedium("Ivan Dorn", "Pop", 2014);


        myCollection.addMedia(album1);
        myCollection.addMedia(album2);


        MusicWork song1 = new MusicWork("R U Mine?", 240);
        MusicWork song2 = new MusicWork("Arabella", 220);
        MusicWork song3 = new MusicWork("Слишком влюблен", 200);


        album1.addMusicalWork(song1);
        album1.addMusicalWork(song2);


        album2.addMusicalWork(song3);


        System.out.println("Коллекция: " + myCollection.getName());
        System.out.println("Владелец: " + myCollection.getOwnersName());


        for (MusicalMedium medium : myCollection.getMedia()) {
            System.out.println("Альбом: " + medium.getAuthorGroup());
            System.out.println("Жанр: " + medium.getGenre());
            System.out.println("Год выпуска: " + medium.getYearOfManufacture());
            System.out.println("Песни в альбоме:");
            for (MusicWork work : medium.getMusicalWorks()) {
                System.out.println(" - " + work.getName() + " (продолжительность: " + work.getDuration() + " секунд)");
            }
            System.out.println("Общая продолжительность альбома: " + medium.getTotalDurationOfSound() + " секунд");
        }


        MusicWork foundWork = myCollection.findWorkByTitle("Arabella");
        if (foundWork != null) {
            System.out.println("Найденная песня: " + foundWork.getName());
            System.out.println("Продолжительность: " + foundWork.getDuration() + " секунд");
            System.out.println("Альбом: " + foundWork.getMusicalMedia().getAuthorGroup());
        } else {
            System.out.println("Песня не найдена.");
        }
    }
}




