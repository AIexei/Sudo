package by.ea.sudoku.controller;

import by.ea.sudoku.model.Field;
import by.ea.sudoku.model.Point;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by alexei on 14.08.15.
 */

public class CorrectnessController {
    public boolean isCorrect(Field field) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (field.getPoint(i, j).isEmpty() == true) {
                    if (takeVariants(field, i, j) == false)
                        return false;
                }
            }
        }

        return true;
    }

    private boolean takeVariants (Field field, int x, int y) {
        Set<Integer> variants = new HashSet<Integer>();

        for (int currentVariant = 1; currentVariant < 10; currentVariant++) {
            boolean isGoodVariant = true;

            for (int i = 0; i < 9; i++)
                if (field.getPointValue(i, y) == currentVariant)
                    isGoodVariant = false;

            if (isGoodVariant == true) {
                for (int i = 0; i < 9; i++)
                    if (field.getPointValue(x, i) == currentVariant)
                        isGoodVariant = false;
            }

            if (isGoodVariant == true) {
                int minX = (x / 3) * 3;
                int maxX = minX + 3;
                int minY = (y / 3) * 3;
                int maxY = minY + 3;

                for (int i = minX; i < maxX; i++)
                    for (int j = minY; j < maxY; j++)
                        if (field.getPointValue(i, j) == currentVariant)
                            isGoodVariant = false;
            }

            if (isGoodVariant == true) {
                variants.add(currentVariant);
            }
        }

        field.getPoint(x, y).setVariants(variants);

        if (variants.size() == 0) {
            return false;
        } else if (variants.size() == 1) {
            int truenessValue = variants.iterator().next();

            field.getPoint(x, y).setValue(truenessValue);
        }

        return true;
    }
}
