package type.buyable;

import com.business.house.Bank;
import com.business.house.Player;

public interface Buyable {
    boolean buy(Player player, Bank bank);
}
