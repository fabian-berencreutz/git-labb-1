package se.iths.fabian.gitlabb1.model;

public class RetroGame {
    String title;
    int releaseYear;
    String console;

    public RetroGame(String title, int releaseYear, String console) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.console = console;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
}
