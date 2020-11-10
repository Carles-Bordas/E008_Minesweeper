package com.omar;

public class Display {

    Board board;

    public Display(Board board) {
        this.board = board;
    }

    public void update(Board board) {
        this.board = board;
    }

    /**
     * Draws the board on the screen
     */
    public void draw() {
        for (int i = 0; i < board.getWidth(); i++) {
            System.out.println("");
            for (int j = 0; j < board.getHeight(); j++) {
                switch (board.getCell(i, j).getState()) {
                    case FLAGGED:
                        System.out.print("◘ ");
                        break;
                    case COVERED:
                        System.out.print("■ ");
                        break;
                    case UNCOVERED:
                        if (board.getCell(i, j).isMined()) {
                            System.out.println("☼ ");
                        } else {
                            System.out.print(board.getSurroundingMines(i, j) + " ");
                        }
                        break;

                }
            }
        }

        System.out.println("");
    }

}
