package minesweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        String[][] gameField = createField();
        setMines(gameField);
        setMineNumberAround(gameField);
        printField(gameField);
    }
    public static String[][] createField() {

        String[][] gameField = new String[9][9];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                gameField[i][j] = "0";
            }
        }
        return gameField;
    }
    public static void setMines(String[][] gameField) {

        System.out.println("How many mines do you want on the field?");
        int mineNum = scanner.nextInt();
        Random random = new Random();
        while (mineNum > 0) {
            int a = random.nextInt(0,9);
            int b = random.nextInt(0, 9);
            if (!gameField[a][b].equals("X")) {

                gameField[a][b] = "X";
                mineNum--;
            }
        }
    }
    public static void printField(String[][] gameField) {

        System.out.println(Arrays.deepToString(gameField).replace("], ", "\n")
                .replace("[", "").replace("[[", "").replace("]]", "")
                .replace(",", "").replace(" ", ""));
    }
    public static void setMineNumberAround(String[][] gameField) {

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                if (gameField[i][j].equals("X")) {
                    if (i > 0 && i < gameField.length - 1 && j > 0 && j < gameField[0].length - 1) {

                        if (!gameField[i - 1][j - 1].equals("X")) {
                            gameField[i - 1][j - 1] = Integer.toString(Integer.parseInt(gameField[i - 1][j - 1]) + 1);
                        }
                        if (!gameField[i - 1][j].equals("X")) {
                            gameField[i - 1][j] = Integer.toString(Integer.parseInt(gameField[i - 1][j]) + 1);
                        }
                        if (!gameField[i - 1][j + 1].equals("X")) {
                            gameField[i - 1][j + 1] = Integer.toString(Integer.parseInt(gameField[i - 1][j + 1]) + 1);
                        }
                        if (!gameField[i][j - 1].equals("X")) {
                            gameField[i][j - 1] = Integer.toString(Integer.parseInt(gameField[i][j - 1]) + 1);
                        }
                        if (!gameField[i][j + 1].equals("X")) {
                            gameField[i][j + 1] = Integer.toString(Integer.parseInt(gameField[i][j + 1]) + 1);
                        }
                        if (!gameField[i + 1][j - 1].equals("X")) {
                            gameField[i + 1][j - 1] = Integer.toString(Integer.parseInt(gameField[i + 1][j - 1]) + 1);
                        }
                        if (!gameField[i + 1][j].equals("X")) {
                            gameField[i + 1][j] = Integer.toString(Integer.parseInt(gameField[i + 1][j]) + 1);
                        }
                        if (!gameField[i + 1][j + 1].equals("X")) {
                            gameField[i + 1][j + 1] = Integer.toString(Integer.parseInt(gameField[i + 1][j + 1]) + 1);
                        }

                    } else if (i == 0 && j == 0) {

                        if (!gameField[i][j + 1].equals("X")) {
                            gameField[i][j + 1] = Integer.toString(Integer.parseInt(gameField[i][j + 1]) + 1);
                        }
                        if (!gameField[i + 1][j].equals("X")) {
                            gameField[i + 1][j] = Integer.toString(Integer.parseInt(gameField[i + 1][j]) + 1);
                        }
                        if (!gameField[i + 1][j + 1].equals("X")) {
                            gameField[i + 1][j + 1] = Integer.toString(Integer.parseInt(gameField[i + 1][j + 1]) + 1);
                        }

                    } else if (i != 0 && i != gameField[0].length - 1 && j == 0) {

                        if (!gameField[i - 1][j].equals("X")) {
                            gameField[i - 1][j] = Integer.toString(Integer.parseInt(gameField[i - 1][j]) + 1);
                        }
                        if (!gameField[i - 1][j + 1].equals("X")) {
                            gameField[i - 1][j + 1] = Integer.toString(Integer.parseInt(gameField[i - 1][j + 1]) + 1);
                        }
                        if (!gameField[i][j + 1].equals("X")) {
                            gameField[i][j + 1] = Integer.toString(Integer.parseInt(gameField[i][j + 1]) + 1);
                        }
                        if (!gameField[i + 1][j].equals("X")) {
                            gameField[i + 1][j] = Integer.toString(Integer.parseInt(gameField[i + 1][j]) + 1);
                        }
                        if (!gameField[i + 1][j + 1].equals("X")) {
                            gameField[i + 1][j + 1] = Integer.toString(Integer.parseInt(gameField[i + 1][j + 1]) + 1);
                        }

                    } else if (i == 0 && j != 0 && j != gameField[0].length - 1) {

                        if (!gameField[i][j - 1].equals("X")) {
                            gameField[i][j - 1] = Integer.toString(Integer.parseInt(gameField[i][j - 1]) + 1);
                        }
                        if (!gameField[i][j + 1].equals("X")) {
                            gameField[i][j + 1] = Integer.toString(Integer.parseInt(gameField[i][j + 1]) + 1);
                        }
                        if (!gameField[i + 1][j - 1].equals("X")) {
                            gameField[i + 1][j - 1] = Integer.toString(Integer.parseInt(gameField[i + 1][j - 1]) + 1);
                        }
                        if (!gameField[i + 1][j].equals("X")) {
                            gameField[i + 1][j] = Integer.toString(Integer.parseInt(gameField[i + 1][j]) + 1);
                        }
                        if (!gameField[i + 1][j + 1].equals("X")) {
                            gameField[i + 1][j + 1] = Integer.toString(Integer.parseInt(gameField[i + 1][j + 1]) + 1);
                        }

                    } else if (i == 0 && j == gameField[0].length - 1) {

                        if (!gameField[i][j - 1].equals("X")) {
                            gameField[i][j - 1] = Integer.toString(Integer.parseInt(gameField[i][j - 1]) + 1);
                        }
                        if (!gameField[i + 1][j - 1].equals("X")) {
                            gameField[i + 1][j - 1] = Integer.toString(Integer.parseInt(gameField[i + 1][j - 1]) + 1);
                        }
                        if (!gameField[i + 1][j].equals("X")) {
                            gameField[i + 1][j] = Integer.toString(Integer.parseInt(gameField[i + 1][j]) + 1);
                        }

                    } else if (i != 0 && i != gameField[0].length - 1 && j == gameField[0].length - 1) {

                        if (!gameField[i - 1][j - 1].equals("X")) {
                            gameField[i - 1][j - 1] = Integer.toString(Integer.parseInt(gameField[i - 1][j - 1]) + 1);
                        }
                        if (!gameField[i - 1][j].equals("X")) {
                            gameField[i - 1][j] = Integer.toString(Integer.parseInt(gameField[i - 1][j]) + 1);
                        }
                        if (!gameField[i][j - 1].equals("X")) {
                            gameField[i][j - 1] = Integer.toString(Integer.parseInt(gameField[i][j - 1]) + 1);
                        }
                        if (!gameField[i + 1][j - 1].equals("X")) {
                            gameField[i + 1][j - 1] = Integer.toString(Integer.parseInt(gameField[i + 1][j - 1]) + 1);
                        }
                        if (!gameField[i + 1][j].equals("X")) {
                            gameField[i + 1][j] = Integer.toString(Integer.parseInt(gameField[i + 1][j]) + 1);
                        }

                    } else if (i == gameField[0].length - 1 && j == gameField[0].length - 1) {

                        if (!gameField[i - 1][j - 1].equals("X")) {
                            gameField[i - 1][j - 1] = Integer.toString(Integer.parseInt(gameField[i - 1][j - 1]) + 1);
                        }
                        if (!gameField[i - 1][j].equals("X")) {
                            gameField[i - 1][j] = Integer.toString(Integer.parseInt(gameField[i - 1][j]) + 1);
                        }
                        if (!gameField[i][j - 1].equals("X")) {
                            gameField[i][j - 1] = Integer.toString(Integer.parseInt(gameField[i][j - 1]) + 1);
                        }

                    } else if (i == gameField[0].length - 1 && j != 0 && j != gameField[0].length - 1) {

                        if (!gameField[i - 1][j - 1].equals("X")) {
                            gameField[i - 1][j - 1] = Integer.toString(Integer.parseInt(gameField[i - 1][j - 1]) + 1);
                        }
                        if (!gameField[i - 1][j].equals("X")) {
                            gameField[i - 1][j] = Integer.toString(Integer.parseInt(gameField[i - 1][j]) + 1);
                        }
                        if (!gameField[i - 1][j + 1].equals("X")) {
                            gameField[i - 1][j + 1] = Integer.toString(Integer.parseInt(gameField[i - 1][j + 1]) + 1);
                        }
                        if (!gameField[i][j - 1].equals("X")) {
                            gameField[i][j - 1] = Integer.toString(Integer.parseInt(gameField[i][j - 1]) + 1);
                        }
                        if (!gameField[i][j + 1].equals("X")) {
                            gameField[i][j + 1] = Integer.toString(Integer.parseInt(gameField[i][j + 1]) + 1);
                        }

                    } else if (i == gameField[0].length - 1 && j == 0) {

                        if (!gameField[i - 1][j].equals("X")) {
                            gameField[i - 1][j] = Integer.toString(Integer.parseInt(gameField[i - 1][j]) + 1);
                        }
                        if (!gameField[i - 1][j + 1].equals("X")) {
                            gameField[i - 1][j + 1] = Integer.toString(Integer.parseInt(gameField[i - 1][j + 1]) + 1);
                        }
                        if (!gameField[i][j + 1].equals("X")) {
                            gameField[i][j + 1] = Integer.toString(Integer.parseInt(gameField[i][j + 1]) + 1);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                if (gameField[i][j].equals("0")) {

                    gameField[i][j] = ".";
                };
            }
        }
    }
}

