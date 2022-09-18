import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.mvn.MovieManager;

public class MovieManagerTest {


    @Test
    public void findAll() {
        MovieManager manager = new MovieManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");


        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastLess() {
        MovieManager manager = new MovieManager();

        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");


        String[] actual = manager.findLast();
        String[] expected = {"film7", "film6", "film5", "film4"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEqual() {
        MovieManager manager = new MovieManager();

        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");
        manager.add("film12");
        manager.add("film13");
        manager.add("film14");
        manager.add("film15");
        manager.add("film16");
        manager.add("film17");


        String[] actual = manager.findLast();
        String[] expected = {"film17", "film16", "film15", "film14", "film13", "film12", "film11", "film10", "film9", "film8"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findMore() {
        MovieManager manager = new MovieManager();

        manager.add("film18");
        manager.add("film19");
        manager.add("film20");
        manager.add("film21");
        manager.add("film22");
        manager.add("film23");
        manager.add("film24");
        manager.add("film25");
        manager.add("film26");
        manager.add("film27");
        manager.add("film28");


        String[] actual = manager.findLast();
        String[] expected = {"film28", "film27", "film26", "film25", "film24", "film23", "film22", "film21", "film20", "film19"};

        Assertions.assertArrayEquals(expected, actual);
    }


}

