package com.exemple;

public class Client {
    //Nom
    String nom;

    //Prénom
    String prenom;

    //Numéro
    Integer numero;

    Integer calculReduction(/*Integer numero*/) {
        if(this.numero < 200000) {
            return 10;

        }
        return 0;
    }

}
