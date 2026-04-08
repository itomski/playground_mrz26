package de.lubowiecki.designpatterns.composite;

public class PowerPointDoc implements Printable {

    private String title;
    private String[] slides;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getSlides() {
        return slides;
    }

    public void setSlides(String... slides) {
        this.slides = slides;
    }

    @Override
    public void print() {
        System.out.println("PowerPointDoc mit dem Titel \"" + title + "\" wird gedruckt!");
        for(String slide : slides) {
            System.out.println("\t" + slide);
        }
    }
}
