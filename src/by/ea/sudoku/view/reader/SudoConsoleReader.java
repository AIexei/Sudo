package by.ea.sudoku.view.reader;

import by.ea.sudoku.model.Point;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by alexei on 14.08.15.
 */

public class SudoConsoleReader implements ISudoReader {

    @Override
    public Point[][] readSudoku() {
        System.out.println("Введите судоку. На месте пустой клетки ставьте 0.\n");

        Point[][] field = new Point[9][9];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                field[i][j] = new Point(in.nextInt());
            }
        }

        return field;
    }
}
