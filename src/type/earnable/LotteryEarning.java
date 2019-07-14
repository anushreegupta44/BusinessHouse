package type.earnable;

import com.business.house.Bank;
import com.business.house.Player;

public class LotteryEarning implements Earnable {
    final int windfall = 200;

    @Override
    public boolean addMoney(Player player, Bank bank) {
        player.addMoney(windfall);
        bank.deductMoney(windfall);
        return true;
    }
}
