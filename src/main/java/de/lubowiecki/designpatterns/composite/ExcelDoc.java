package de.lubowiecki.designpatterns.composite;

public class ExcelDoc implements Printable {

    private String title;
    private String[][] tabelle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[][] getTabelle() {
        return tabelle;
    }

    public void setTabelle(String[][] tabelle) {
        this.tabelle = tabelle;
    }


    @Override
    public void print() {
        System.out.println("ExcelDoc mit dem Titel \"" + title + "\" wird gedruckt!");
        for(String[] zeile : tabelle) {
            for(String zelle : zeile) {
                System.out.print(zelle + " ");
            }
            System.out.println();
        }
    }
}
