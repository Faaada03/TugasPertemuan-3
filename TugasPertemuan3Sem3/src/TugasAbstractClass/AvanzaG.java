/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasAbstractClass;

public class AvanzaG extends apanzu {

    public AvanzaG(String nama, int kecepatan, int jumlahPintu, String tipe) {
        super(nama, kecepatan, jumlahPintu, tipe);
    }

    @Override
    public void bergerak() {
        System.out.println("Avanza tipe " + tipe + " melaju dengan kecepatan " + kecepatan + " km/jam.");
    }

    @Override
    public void infoMobil() {
        System.out.println("Mobil " + nama + " memiliki " + jumlahPintu + " pintu.");
    }

    @Override
    public void fiturAvanza() {
        System.out.println("Avanza tipe " + tipe + " memiliki fitur ECO Mode.");
    }

    public static void main(String[] args) {
        AvanzaG avanza = new AvanzaG("Avanza", 120, 4, "G");

        avanza.bergerak();
        avanza.infoMobil();
        avanza.fiturAvanza();
    }
}
