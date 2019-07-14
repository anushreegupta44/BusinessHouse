package type.upgradable;

import cell.Cell;
import com.business.house.Bank;
import com.business.house.Player;

public interface Upgradable {
    boolean upgrade(Player player, Bank bank, Cell cell);

    boolean upgradeCellType(Cell cell);
}
