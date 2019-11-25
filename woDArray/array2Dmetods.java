package sk.itsovy.matysko.woDArray;

public class array2Dmetods {
    public static boolean state(String text) {
        int state = 0;
        int i = 0;
        while(state != 6) {
            if (i==text.length()) {
                break;
            }
            char z = text.charAt(i);
            i++;
            if (state == 0 && z == 'R')
                state = 1;
            else if (state == 1 && z == 'A')
                state = 2;
            else if (state == 2 && z == 'T')
                state = 3;
            else if (state == 3 && z == 'R')
                state = 4;
            else if (state == 4 && z == 'A')
                state = 5;
            else if (state == 5 && z == 'K') {
                state = 6;
                return true;
            }
            else {
                state = 0;
            }
        }
        return false;
    }
}
