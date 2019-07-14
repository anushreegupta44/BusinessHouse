package type.penalizable;

import com.business.house.Bank;
import com.business.house.Player;

public class JailPenalty implements Penalizable {
    final int penalty = 150;

    @Override
    public boolean deductMoney(Player player, Bank bank) {
        player.deductMoney(penalty);
        bank.addMoney(penalty);
        return true;
    }
}
