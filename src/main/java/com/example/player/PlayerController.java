/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    PlayerService playerService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayerList() {

        return playerService.getPlayersList();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {

        return playerService.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId) {

        return playerService.getPlayerById(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updateBook(@PathVariable("playerId") int playerId, @RequestBody Player player) {

        return playerService.updatePlayer(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public ArrayList<Player> deleteBook(@PathVariable("playerId") int playerId) {

        playerService.deletePlayer(playerId);
        return playerService.getPlayersList();
    }

}
