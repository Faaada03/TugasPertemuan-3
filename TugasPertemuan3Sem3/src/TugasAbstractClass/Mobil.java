/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasAbstractClass;

public abstract class Mobil extends Kendaraan {

    protected int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahPintu) {
        super(nama, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    public abstract void infoMobil();
}
