package cell;

import type.buyable.NotBuyable;
import type.earnable.LotteryEarning;
import type.penalizable.NoPenalty;
import type.rentable.NotRentable;
import type.upgradable.NotUpgradable;

public class LotteryCell extends Cell {
    public LotteryCell() {
        penalizable = new NoPenalty();
        earnable = new LotteryEarning();
        buyable = new NotBuyable();
        rentable = new NotRentable();
        upgradable = new NotUpgradable();
        owner = null;
    }
}
