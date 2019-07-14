package type.rentable;

import com.business.house.Bank;
import com.business.house.Player;

public interface Rentable {
    boolean payRent(Player player, Player owner);
}
