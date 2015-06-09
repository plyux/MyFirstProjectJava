package com.lesson4;

/**
 * Created by Вевдюк on 09.06.2015.
 */
public class Field {

    private static final int FIELD_SIZE = 3;

    private static final char DEFAULT_CELL_VALUE=' ';

    private char[][] items = new char[FIELD_SIZE][FIELD_SIZE];

    public void eraseField(){
        for(int i = 0; i < FIELD_SIZE; i++) {
            for(int j = 0; j < FIELD_SIZE; j++) {
                items[i][j] = DEFAULT_CELL_VALUE;
            }
        }
    }

    public void showField(){
        for(int i = 0; i < FIELD_SIZE; i++) {
            for(int j = 0; j < FIELD_SIZE; j++) {
                showCell(i, j);
            }
            System.out.println();
        }
    }

    public void showCell(int numb, int numb2){
        System.out.print("{" + items[numb][numb2] + "}");
    }

}
