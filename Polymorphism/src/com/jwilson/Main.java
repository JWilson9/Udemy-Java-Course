package com.jwilson;

/**
 * Created by jwilson on 15/05/2017.
 */


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("jaws");
    }

    public String plot() {
        return "A shark eats a lot of people";
    }
}

class HarryPotter extends Movie {
    public HarryPotter() {
        super("Harry Potter");
    }

    @Override
    public String plot() {
        return "Magical school for wizards";
    }

}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class Starwars extends Movie {
    public Starwars() {
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}


public class Main {

    public static void main(String[] args) {

        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #: " + i + ": " + movie.getName() + "\n"
            + "plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("random no.: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new HarryPotter();
            case 3:
                return new MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgettable();

        }

        return null;

    }
}
