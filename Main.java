package minesweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many mines do you want on the field?");
        int mineNum = scanner.nextInt();
        Random random = new Random();

        String[][] gameField = new String[9][9];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                gameField[i][j] = ".";
            }
        }

        while (mineNum > 0) {
            int a = random.nextInt(0,9);
            int b = random.nextInt(0, 9);
            if (!gameField[a][b].equals("X")) {

                gameField[a][b] = "X";
                mineNum--;
            }
        }

        System.out.println(Arrays.deepToString(gameField).replace("], ", "\n")
                .replace("[", "").replace("[[", "").replace("]]", "")
                .replace(",", "").replace(" ", ""));
    }
}
