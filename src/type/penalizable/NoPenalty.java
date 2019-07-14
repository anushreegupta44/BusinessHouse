package type.penalizable;

import com.business.house.Bank;
import com.business.house.Player;

public class NoPenalty implements Penalizable {
    @Override
    public boolean deductMoney(Player player, Bank bank) {
        return false;
    }
}
