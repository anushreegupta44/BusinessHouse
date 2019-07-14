package type.buyable;

import com.business.house.Bank;
import com.business.house.Player;

public class NotBuyable implements Buyable {
    @Override
    public boolean buy(Player player, Bank bank) {
        return false;
    }
}
