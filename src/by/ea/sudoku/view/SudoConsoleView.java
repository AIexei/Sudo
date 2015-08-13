package by.ea.sudoku.view;

import by.ea.sudoku.model.Field;

/**
 * Created by alexei on 14.08.15.
 */

public class SudoConsoleView implements ISudoView {

    @Override
    public void showField(Field field) {
        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(field.getPointValue(i, j));

                if (j != 8 && (j + 1) % 3 == 0)
                    System.out.print(" | ");
                else
                    System.out.print(' ');
            }

            System.out.println();

            if (i != 8 && (i + 1) % 3 == 0) {
                for (int k = 0; k < 21; k++)
                    System.out.print('-');

                System.out.println();
            }
        }
    }
}
