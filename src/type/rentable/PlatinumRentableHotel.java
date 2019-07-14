package type.rentable;

import com.business.house.Bank;
import com.business.house.Player;

public class PlatinumRentableHotel implements Rentable {

    final int rent = 300;

    @Override
    public boolean payRent(Player player, Player owner) {
        player.deductMoney(rent);
        owner.addMoney(rent);
        return true;
    }
}
