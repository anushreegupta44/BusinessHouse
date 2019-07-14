package com.business.house;

import cell.Cell;

import java.util.List;
import java.util.Queue;

public class BusinessH {
    List<Cell> cells;
    Queue<Player> players;
    Bank bank;

    public BusinessH(List<Cell> cells, Queue<Player> players, Bank bank) {
        this.cells = cells;
        this.players = players;
        this.bank = bank;
    }

    public void play(int[] diceOutput) {
        for (int i = 0; i < diceOutput.length; i++) {
            Player currentPlayer = players.remove();
            currentPlayer.move(diceOutput[i]);
            int pos = findPlayersCurrentPosition(currentPlayer, diceOutput[i]);
            Cell cell = getCellAtPlayerPosition(pos);
            performActions(currentPlayer, cell);
            players.add(currentPlayer);
        }
    }

    private int findPlayersCurrentPosition(Player currentPlayer, int moveSize) {
        if (currentPlayer.getTotalStepsTaken() >= cells.size()) {
            return (currentPlayer.getTotalStepsTaken() % cells.size());
        }
        return currentPlayer.getTotalStepsTaken();
    }

    private void performActions(Player currentPlayer, Cell cell) {
        cell.penalize(currentPlayer, bank);
        cell.earn(currentPlayer, bank);
        cell.upgrade(currentPlayer, bank, cell);
        cell.payRent(currentPlayer, bank);
        cell.buy(currentPlayer, bank);

    }

    private Cell getCellAtPlayerPosition(int pos) {
        return cells.get(pos);
    }

    public void start(int[] diceOutput) {
        play(diceOutput);
        declareWinner();
    }

    private void declareWinner() {
        int i = 1;
        while (!players.isEmpty()) {
            Player player = players.remove();
            System.out.println("Player" + i + "has total money" + player.getCurrentBalance()
                + "and asset of amount :" + player.getTotalAssetBalance());
            i++;
        }
        System.out.println("Balance at Bank : " + bank.getCurrentBal());

    }
}
