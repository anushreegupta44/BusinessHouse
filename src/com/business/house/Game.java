package com.business.house;

import cell.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    public static void main(String[] args) {
        List<Cell> cells = new ArrayList<>();
        cells = addCells(cells);

        Queue<Player> players = new LinkedList<>();
        players = addPlayers(players);

        Bank bank = new Bank();

        int[] diceOutput = new int[]{2, 2, 1, 4, 4, 2, 4, 4, 2, 2, 2, 1, 4, 4, 2, 4, 4, 2, 2, 2, 1};
        BusinessH businessH = new BusinessH(cells, players, bank);
        businessH.start(diceOutput);
    }

    private static Queue<Player> addPlayers(Queue<Player> players) {
        players.add(new Player());
        players.add(new Player());
        players.add(new Player());
        return players;
    }

    private static List<Cell> addCells(List<Cell> cells) {
        cells.add(new JailCell());
        cells.add(new HotelCell());
        cells.add(new LotteryCell());
        cells.add(new HotelCell());
        cells.add(new EmptyCell());
        cells.add(new LotteryCell());
        cells.add(new HotelCell());
        cells.add(new LotteryCell());
        cells.add(new HotelCell());
        cells.add(new JailCell());

        return cells;
    }
}
