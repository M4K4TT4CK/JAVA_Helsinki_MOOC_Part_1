import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birdList;

    public BirdDatabase() {
        this.birdList = new ArrayList<>();
    }

    public void addBird(Bird bird) {

        birdList.add(bird);

    }

    public void printBirdDb() {

        for (Bird i : birdList) {
            System.out.println(i);
        }

    }

    public void printBird(String name) {

        for (Bird i : birdList) {

            if (i.getName().equals(name)) {

                System.out.println(i);
            }
        }
    }

    public void observeDB(String name) {

        for (Bird i : birdList) {
            if (i.getName().toLowerCase().equals(name.toLowerCase())) {

                i.observation();
            }

        }

    }

}