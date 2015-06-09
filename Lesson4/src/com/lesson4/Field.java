package com.lesson4;

/**
 * Created by Вевдюк on 09.06.2015.
 */
public class Field {

    private static final char DEFAULT_CELL_VALUE = ' ';

    private static final int DEFOULT_FIELD_SIZE = 3;

    private final int fieldSize;

    private final char[][] items;

    public Field(){
        this(DEFOULT_FIELD_SIZE);
    }

    public Field(int size){
        fieldSize = size;
        items = new char[fieldSize][fieldSize];
    }

    public int getFieldSize(){
        return fieldSize;
    }

    public void eraseField(){
        for(int i = 0; i < fieldSize; i++) {
            for(int j = 0; j < fieldSize; j++) {
                items[i][j] = DEFAULT_CELL_VALUE;
            }
        }
    }

    public void showField(){
        for(int i = 0; i < fieldSize; i++) {
            for(int j = 0; j < fieldSize; j++) {
                showCell(i, j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void showCell(int numb, int numb2){
        System.out.print("{" + items[numb][numb2] + "}");
    }

}
