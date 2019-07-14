package type.buyable;

import com.business.house.Bank;
import com.business.house.Player;

public class SilverBuyableHotel implements Buyable {
    final int value = 200;

    @Override
    public boolean buy(Player player, Bank bank) {
        if (player.canAfford(value)) {
            player.deductMoney(value);
            bank.addMoney(value);
            player.addProperty(200);
            return true;
        }
        return false;
    }
}
