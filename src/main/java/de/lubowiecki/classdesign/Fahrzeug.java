package de.lubowiecki.classdesign;

public class Fahrzeug {

    // private Eigenschaften dürfen nur von der eigenen Klasse verwendet werden
    private String kennzeichen = "Unbekannt";
    private String marke;
    private String modell;
    private int baujahr;
    private int xPos;
    private int yPos;

    private boolean aktiv;

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr) {
        setKennzeichen(kennzeichen);
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setKennzeichen(String kennzeichen) {
        if(kennzeichen.length() > 8)
            this.kennzeichen = kennzeichen;
    }

    /**
     * Weist die X Position zu
     * @param xPos werte zweischen 0 und 100 erlaubt
     */
    public void setXPos(int xPos) {
        if(xPos > 0 && xPos <= 100)
            this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        if(yPos > 0)
            this.yPos = yPos;
    }
}
