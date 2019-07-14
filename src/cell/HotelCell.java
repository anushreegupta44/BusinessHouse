package cell;

import type.buyable.SilverBuyableHotel;
import type.earnable.NoEarning;
import type.penalizable.NoPenalty;
import type.rentable.NotRentable;
import type.upgradable.NotUpgradable;

public class HotelCell extends Cell {
    public HotelCell() {
        penalizable = new NoPenalty();
        earnable = new NoEarning();
        buyable = new SilverBuyableHotel();
        rentable = new NotRentable();
        upgradable = new NotUpgradable();
        owner = null;
    }

}
