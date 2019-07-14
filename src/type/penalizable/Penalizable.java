package type.penalizable;

import com.business.house.Bank;
import com.business.house.Player;

public interface Penalizable {
    public boolean deductMoney(Player player, Bank bank);
}
