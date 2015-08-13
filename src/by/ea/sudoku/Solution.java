package by.ea.sudoku;

import by.ea.sudoku.controller.CorrectnessController;
import by.ea.sudoku.model.Field;
import by.ea.sudoku.model.Point;
import by.ea.sudoku.view.SudoConsoleView;
import by.ea.sudoku.view.reader.SudoConsoleReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by alexei on 14.08.15.
 */

public class Solution {
    public static void main(String... args) throws FileNotFoundException {
        Point[][] p = new Point[9][9];
        Scanner scanner = new Scanner(new FileInputStream("src/by/ea/sudoku/data.sudo"));

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                p[i][j] = new Point(scanner.nextInt());
            }
        }

        Field f = new Field(p);

        SudoConsoleView sudoConsoleView = new SudoConsoleView();
        sudoConsoleView.showField(f);

        CorrectnessController correctnessController = new CorrectnessController();
        System.out.println(correctnessController.isCorrect(f));
    }
}
