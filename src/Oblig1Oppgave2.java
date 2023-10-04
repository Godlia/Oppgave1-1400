import javax.swing.*;
public class Oblig1Oppgave2 {
    public static void main(String[] args) {
        String vare1Navn = JOptionPane.showInputDialog("Navn på første vare");
        String vare1AntallIO = JOptionPane.showInputDialog("Antall på første vare");
        String vare1PrisIO = JOptionPane.showInputDialog("Pris på første vare");
        int vare1Antall;
        double vare1Pris;


        String vare2Navn = JOptionPane.showInputDialog("Navn på andre vare");
        String vare2AntallIO = JOptionPane.showInputDialog("Antall på andre vare");
        String vare2PrisIO = JOptionPane.showInputDialog("Pris på andre vare");
        int vare2Antall;
        double vare2Pris;

        try {
            vare1Antall = Integer.parseInt(vare1AntallIO);
            vare1Pris = Double.parseDouble(vare1PrisIO);
            vare2Antall = Integer.parseInt(vare2AntallIO);
            vare2Pris = Double.parseDouble(vare2PrisIO);
        } catch (Exception e) {
            System.out.println("Feil ved konvertering - er tallet du skrev inn ett tall? \n" + e );
            return;
        }

        Vare vare1 = new Vare(vare1Navn, vare1Antall, vare1Pris);
        Vare vare2 = new Vare(vare2Navn, vare2Antall, vare2Pris);

        double Totalpris = (vare1.getPris() * vare1.getAntall()) + (vare2.getPris() * vare2.getAntall());
        System.out.println("Totalprisen ble: " + Totalpris + " kr");
    }
}