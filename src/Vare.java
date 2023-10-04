public class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntall() {
        return antall;
    }

    public double getPris() {
        return pris;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAntall(int antall) {
        if(antall > 0) this.antall = antall;
    }

    public void setPris(double pris) {
        if(pris >= 0) this.pris = pris;
    }
    public double totalPris() {
        return this.pris * this.antall;
    }
}