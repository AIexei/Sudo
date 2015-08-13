package by.ea.sudoku.view.reader;

import by.ea.sudoku.model.Point;

import java.io.File;

/**
 * Created by alexei on 14.08.15.
 */

public interface ISudoReader {
    Point[][] readSudoku ();
}
