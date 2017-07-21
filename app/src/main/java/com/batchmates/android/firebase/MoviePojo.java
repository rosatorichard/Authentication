package com.batchmates.android.firebase;

/**
 * Created by Android on 7/20/2017.
 */

public class MoviePojo {

    String name;
    String discription;
    String genre;
    String mainActor;
    String inTheaters;

    public MoviePojo(String name, String discription, String genre, String mainActor, String inTheaters) {
        this.name = name;
        this.discription = discription;
        this.genre = genre;
        this.mainActor = mainActor;
        this.inTheaters = inTheaters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public void setInTheaters(String inTheaters) {
        this.inTheaters = inTheaters;
    }

    public String getName() {
        return name;
    }

    public String getDiscription() {
        return discription;
    }

    public String getGenre() {
        return genre;
    }

    public String getMainActor() {
        return mainActor;
    }

    public String getInTheaters() {
        return inTheaters;
    }
}
