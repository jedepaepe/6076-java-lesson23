package eu.epfc.c6077.lesson23.lesson23;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String breed;
    private double size;
    private double weigth;

    public Cat(Long id, String breed, double size, double weigth) {
        this.id = id;
        this.breed = breed;
        this.size = size;
        this.weigth = weigth;
    }

    public Cat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
}
