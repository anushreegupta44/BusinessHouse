package cell;

import com.business.house.Bank;
import com.business.house.Player;
import type.buyable.Buyable;
import type.earnable.Earnable;
import type.penalizable.Penalizable;
import type.rentable.Rentable;
import type.rentable.SilverRentableHotel;
import type.upgradable.SilverUpgradableHotel;
import type.upgradable.Upgradable;

public abstract class Cell {
    Penalizable penalizable;
    Earnable earnable;
    Buyable buyable;
    Rentable rentable;
    Upgradable upgradable;
    Player owner;

    public Cell() {
    }

    public boolean penalize(Player player, Bank bank) {
        return penalizable.deductMoney(player, bank);
    }

    public boolean earn(Player player, Bank bank) {
        return earnable.addMoney(player, bank);
    }

    public boolean buy(Player player, Bank bank) {
        boolean bought = false;
        if (owner == null) {
            bought = buyable.buy(player, bank);
        }
        if (bought) {
            setOwner(player);

            rentable = new SilverRentableHotel();
            upgradable = new SilverUpgradableHotel();
            return true;
        }
        return bought;
    }

    public boolean payRent(Player player, Bank bank) {
        if (owner != null && !owner.equals(player))
            return rentable.payRent(player, owner);
        return false;
    }

    public boolean upgrade(Player player, Bank bank, Cell cell) {
        return upgradable.upgrade(player, bank, cell);
    }

    public void setUpgradable(Upgradable upgradable) {
        this.upgradable = upgradable;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Player getOwner() {
        return owner;
    }
}
