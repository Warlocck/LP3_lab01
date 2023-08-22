package com.mycompany.principal;
public class Regalo {

    public static String elegir(int vida) {
        String gift = "";
                switch(vida) {
                    case 1 -> gift = "Un pasaje al caribe";
                    case 2 -> gift = "Un visita al museo más cercano a tu casa";
                    case 3 -> gift = "Una entrada al cine"; 
                }
                    return gift;
    }
}
