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
        public void findLast() {
            MovieManager manager = new MovieManager();

            manager.add("film4");
            manager.add("film5");
            manager.add("film6");
            manager.add("film7");
            manager.add("film8");
            manager.add("film9");
            manager.add("film10");

            String[] actual = manager.findLast();
            String[] expected = { "film10", "film9", "film8", "film7", "film6", "film5", "film4" };

            Assertions.assertArrayEquals(expected, actual);
        }
    }

