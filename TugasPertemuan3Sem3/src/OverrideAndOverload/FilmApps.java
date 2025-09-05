/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverrideAndOverload;

/**
 *
 * @author MyBook Hype AMD
 */
public class FilmApps {

    String judul;
    String Sutradara;

    public FilmApps(String judul, String Sutradara) {
        this.judul = judul;
        this.Sutradara = Sutradara;
    }

    
    
    void infoFilm() {
        System.out.println("mencari Film dengan genre: " + judul + ", Sutradara: " + Sutradara);
    }

    // Overload method cariFilm
    void cariFilm(String judul) {
        System.out.println("Menemukan film dengan judul: " + judul);
    }

    void cariFilm(double rating) {
        System.out.println("Menemukan film dengan rating: " + rating);
    }

    void cariFilm(String Sutradara, int tahun) {
        System.out.println("Menemukan film yang di sutradarai oleh: " + Sutradara + " tahun " + tahun);
    }
}

