package type.upgradable;

import cell.Cell;
import com.business.house.Bank;
import com.business.house.Player;

public class SilverUpgradableHotel implements Upgradable {

    private final int upgradeCost = 100;

    @Override
    public boolean upgrade(Player player, Bank bank, Cell cell) {
        if (cell.getOwner() == player) {
            player.deductMoney(upgradeCost);
            bank.addMoney(upgradeCost);
            player.addProperty(100);
            return upgradeCellType(cell);
        }
        return false;
    }

    @Override
    public boolean upgradeCellType(Cell cell) {
        cell.setUpgradable(new GoldUpgradableHotel());
        return true;
    }

}
