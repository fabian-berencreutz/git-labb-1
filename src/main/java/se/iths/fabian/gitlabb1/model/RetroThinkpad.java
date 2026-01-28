package se.iths.fabian.gitlabb1.model;

public class RetroThinkpad {
    String model;
    int releaseYear;
    String serie;

    public RetroThinkpad(String model, int releaseYear, String serie) {
        this.model = model;
        this.releaseYear = releaseYear;
        this.serie = serie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
