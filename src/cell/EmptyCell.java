package cell;

import type.buyable.NotBuyable;
import type.earnable.NoEarning;
import type.penalizable.NoPenalty;
import type.rentable.NotRentable;
import type.upgradable.NotUpgradable;

public class EmptyCell extends Cell {

    public EmptyCell() {
        penalizable = new NoPenalty();
        earnable = new NoEarning();
        buyable = new NotBuyable();
        rentable = new NotRentable();
        upgradable = new NotUpgradable();
        owner = null;
    }
}
