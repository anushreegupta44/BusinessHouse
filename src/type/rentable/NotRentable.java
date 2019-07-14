package type.rentable;

import com.business.house.Bank;
import com.business.house.Player;

public class NotRentable implements Rentable {
    @Override
    public boolean payRent(Player player, Player owner) {
        return false;
    }
}
