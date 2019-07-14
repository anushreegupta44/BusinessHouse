package type.upgradable;

import cell.Cell;
import com.business.house.Bank;
import com.business.house.Player;

public class PlatinumUpgradableHotel implements Upgradable {
    @Override
    public boolean upgrade(Player player, Bank bank, Cell cell) {
        return false;
    }

    @Override
    public boolean upgradeCellType(Cell cell) {
        return false;
    }
}
