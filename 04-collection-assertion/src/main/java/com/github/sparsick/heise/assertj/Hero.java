package com.github.sparsick.heise.assertj;


import java.util.Objects;

public class Hero {

    private String id;

    private String name;

    private String city;

    private ComicUniversum universum;

    public Hero(String name, String city, ComicUniversum universum) {
        this.name = name;
        this.city = city;
        this.universum = universum;
    }

    public Hero() {

    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public ComicUniversum getUniversum() {
        return universum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Objects.equals(name, hero.name) &&
                Objects.equals(city, hero.city) &&
                universum == hero.universum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, universum);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", universum=" + universum.getDisplayName() +
                '}';
    }
}
