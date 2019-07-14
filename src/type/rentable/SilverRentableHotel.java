package type.rentable;

import com.business.house.Bank;
import com.business.house.Player;

public class SilverRentableHotel implements Rentable {

    final int rent = 50;

    @Override
    public boolean payRent(Player player, Player owner) {
        player.deductMoney(rent);
        owner.addMoney(rent);
        return true;
    }
}
