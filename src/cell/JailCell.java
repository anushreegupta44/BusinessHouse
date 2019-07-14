package cell;

import type.buyable.NotBuyable;
import type.earnable.NoEarning;
import type.penalizable.JailPenalty;
import type.rentable.NotRentable;
import type.upgradable.NotUpgradable;

public class JailCell extends Cell {

    public JailCell() {
        penalizable = new JailPenalty();
        earnable = new NoEarning();
        buyable = new NotBuyable();
        rentable = new NotRentable();
        upgradable = new NotUpgradable();
        owner = null;
    }
}
