package type.earnable;

import com.business.house.Bank;
import com.business.house.Player;

public interface Earnable {
    public boolean addMoney(Player player, Bank bank);

}
