package se.iths.fabian.gitlabb1.model;

public class RetroConsole {
    String name;
    int releaseYear;
    String manufacturer;

    public RetroConsole(String name, int releaseYear, String manufacturer) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
