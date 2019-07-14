package type.upgradable;

import cell.Cell;
import com.business.house.Bank;
import com.business.house.Player;

public class GoldUpgradableHotel implements Upgradable {

    private final int upgradeCost = 200;

    @Override
    public boolean upgrade(Player player, Bank bank, Cell cell) {
        if (cell.getOwner() == player) {
            player.deductMoney(upgradeCost);
            bank.addMoney(upgradeCost);
            player.addProperty(200);
            return upgradeCellType(cell);
        }
        return false;
    }

    @Override
    public boolean upgradeCellType(Cell cell) {
        cell.setUpgradable(new PlatinumUpgradableHotel());
        return true;
    }
}
