/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterface;

/**
 *
 * @author MyBook Hype AMD
 */

public class MainProfesi implements Kuli, Pedagang, Kasir {

    // Implementasi interface Kuli
    @Override
    public void angkatBarang() {
        System.out.println("Kuli sedang mengangkat barang berat.");
    }

    @Override
    public void turunkanBarang() {
        System.out.println("Kuli menurunkan barang di gudang.");
    }

    @Override
    public void istirahat() {
        System.out.println("Kuli sedang beristirahat sejenak.");
    }

    // Implementasi interface Pedagang
    @Override
    public void jualan() {
        System.out.println("Pedagang sedang menjual dagangannya.");
    }

    @Override
    public void tawarMenawar() {
        System.out.println("Pedagang sedang tawar-menawar harga dengan pembeli.");
    }

    @Override
    public void hitungUntung() {
        System.out.println("Pedagang menghitung keuntungan harian.");
    }

    // Implementasi interface Kasir
    @Override
    public void hitungTransaksi() {
        System.out.println("Kasir sedang menghitung total belanjaan.");
    }

    @Override
    public void cetakStruk() {
        System.out.println("Kasir mencetak struk belanja.");
    }

    @Override
    public void simpanUang() {
        System.out.println("Kasir menyimpan uang ke dalam laci kas.");
    }

    // Main method
    public static void main(String[] args) {
        MainProfesi profesi = new MainProfesi();

        System.out.println("=== Demonstrasi Interface Profesi ===");

        System.out.println("\n-- Kuli --");
        profesi.angkatBarang();
        profesi.turunkanBarang();
        profesi.istirahat();

        System.out.println("\n-- Pedagang --");
        profesi.jualan();
        profesi.tawarMenawar();
        profesi.hitungUntung();

        System.out.println("\n-- Kasir --");
        profesi.hitungTransaksi();
        profesi.cetakStruk();
        profesi.simpanUang();
    }
}
