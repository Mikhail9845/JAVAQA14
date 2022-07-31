import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void addNewMovies() {
        MoviesManager manager = new MoviesManager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void addZeroMovies() {
        MoviesManager manager = new MoviesManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void addOneMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add("First");


        String[] expected = {"First"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void addTenMovies() {
        MoviesManager manager = new MoviesManager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");

        String[] expected = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void addEleventhMovies() {
        MoviesManager manager = new MoviesManager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleventh");

        String[] expected = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void findAllMovies() {
        MoviesManager manager = new MoviesManager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleventh");

        String[] expected = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleventh"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void findLastNewMovies() {
        MoviesManager manager = new MoviesManager(1);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"Third"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void findLastTwoMoviesFromTen() {
        MoviesManager manager = new MoviesManager(2);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");


        String[] expected = {"Tenth", "Ninth"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void findOneMovies() {
        MoviesManager manager = new MoviesManager(1);

        manager.add("First");


        String[] expected = {"First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void findLastMoviesZero() {
        MoviesManager manager = new MoviesManager(1);


        String[] expected = {};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void findLastTenMoviesFromTen() {
        MoviesManager manager = new MoviesManager(10);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");


        String[] expected = {"Tenth", "Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second", "First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void findLastEleventhMoviesFromEleventh() {
        MoviesManager manager = new MoviesManager(11);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleventh");


        String[] expected = {"Eleventh", "Tenth", "Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second", "First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void findLastFiveMoviesFromTen() {
        MoviesManager manager = new MoviesManager(5);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");


        String[] expected = {"Tenth", "Ninth", "Eighth", "Seventh", "Sixth"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }


}
