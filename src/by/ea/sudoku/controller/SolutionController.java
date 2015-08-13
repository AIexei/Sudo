package by.ea.sudoku.controller;

import by.ea.sudoku.model.Field;

/**
 * Created by alexei on 14.08.15.
 */

public class SolutionController {
    public boolean isSolution (Field field) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (field.getPoint(i, j).isEmpty())
                    return false;

        return true;
    }
}
