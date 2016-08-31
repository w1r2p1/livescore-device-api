package ro.szzsa.livescore.api.device.client.handler;

import java.util.List;

import ro.szzsa.livescore.model.Game;

/**
 * Handles the up to date games just received from the server.
 */
public interface GamesUpdateHandler {

  void handleGamesUpdate(List<Game> teams);
}
