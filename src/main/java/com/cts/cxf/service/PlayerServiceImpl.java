package com.cts.cxf.service;

import org.springframework.stereotype.Service;

import com.cts.player.PlayerListType;
import com.cts.player.PlayerType;

@Service("playerService")
public class PlayerServiceImpl implements IPlayerService {

	
	@Override
	public String createOrSaveNewPLayerInfo(PlayerType playerType) {

		// get the player information from formal arguments and inserts into database & return playerId (primary_key)
		return "Player information saved successfully with PLAYER_ID " + 238;
	}

	
	@Override
	public PlayerType getPlayerInfo(int playerId) {

		// retrieve player based on the id supplied in the formal argument
		PlayerType getplayer = new PlayerType	();
		getplayer.setPlayerId(playerId);
		getplayer.setName("Allan Donald");
		getplayer.setAge(47);
		getplayer.setMatches(72);
		return getplayer;
	}

	
	@Override
	public String updatePlayerInfo(PlayerType playerType) {

		// update player info & return SUCCESS message
		return "Player information updated successfully";
	}

	
	@Override
	public String deletePlayerInfo(PlayerType playerType) {

		// delete player info & return SUCCESS message
		return "Player information deleted successfully";
	}


	@Override
	public PlayerListType getAllPlayerInfo() {

		// create a object of type PlayerType which takes player objects in its list
		PlayerListType playerListType = new PlayerListType();

		// player 1 info
		PlayerType playerOne = new PlayerType();
		playerOne.setPlayerId(237);
		playerOne.setName("Hansie Cronje");
		playerOne.setAge(33);
		playerOne.setMatches(68);
		playerListType.getPlayerType().add(playerOne); // add to playerListType

		// player 2 info
		PlayerType playerTwo = new PlayerType();
		playerTwo.setPlayerId(265);
		playerTwo.setName("Lance Klusener");
		playerTwo.setAge(42);
		playerTwo.setMatches(49);
		playerListType.getPlayerType().add(playerTwo); // add to playerListType

		return playerListType;
	}
}