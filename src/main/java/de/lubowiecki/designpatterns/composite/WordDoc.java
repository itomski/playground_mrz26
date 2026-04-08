package de.lubowiecki.designpatterns.composite;

public class WordDoc implements Printable {

    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("WordDoc mit dem Titel \"" + title + "\" wird gedruckt!");
    }
}
