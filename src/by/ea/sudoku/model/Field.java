package by.ea.sudoku.model;

/**
 * Created by alexei on 14.08.15.
 */

public class Field {
    private Point field[][];

    public Field(Point[][] field) {
        this.field = field;
    }

    public int getPointValue(int x, int y) {
        return field[x][y].getValue();
    }

    public Point getPoint(int x, int y) {
        return field[x][y];
    }
}
