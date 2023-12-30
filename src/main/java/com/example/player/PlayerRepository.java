// Write your code here
package com.example.player;

import java.util.ArrayList;

public interface PlayerRepository {

    ArrayList<Player> getPlayersList();

    Player addPlayer(Player player);

    Player getPlayerById(int playerId);

    Player updatePlayer(int playerId, Player player);

    void deletePlayer(int playerId);

}
