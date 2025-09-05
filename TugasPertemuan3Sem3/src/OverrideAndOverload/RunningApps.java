/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverrideAndOverload;

/**
 *
 * @author MyBook Hype AMD
 */
public class RunningApps extends FilmApps {

    public RunningApps(String judul, String Sutradara) {
        super(judul, Sutradara);
    }

    public static void main(String[] args) {

        FilmApps b2 = new FilmApps("The Blacklist", "William C. deMille.") {
            @Override
            void infoFilm() {
                System.out.println("mencari film berjudul " + judul + "yang di sutradarai oleh " + Sutradara);
            }
        };
        b2.infoFilm();

        System.out.println();

        b2.cariFilm("The Blacklist");
        b2.cariFilm(7.6);
        b2.cariFilm("William C. deMille.", 1916);
    }

}
