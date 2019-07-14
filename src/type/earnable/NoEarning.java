package type.earnable;

import com.business.house.Bank;
import com.business.house.Player;

public class NoEarning implements Earnable {
    @Override
    public boolean addMoney(Player player, Bank bank) {
        return false;
    }
}
