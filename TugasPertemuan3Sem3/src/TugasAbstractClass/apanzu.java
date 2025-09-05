/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasAbstractClass;

public abstract class apanzu extends Mobil {

    protected String tipe;

    public apanzu(String nama, int kecepatan, int jumlahPintu, String tipe) {
        super(nama, kecepatan, jumlahPintu);
        this.tipe = tipe;
    }

    public abstract void fiturAvanza();
}
