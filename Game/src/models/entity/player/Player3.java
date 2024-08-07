package models.entity.player;

import event.KeyHandler;
import models.Game;
import models.entity.skill.LightFootSkillBehavior;

public class Player3 extends Player {
	private static Player3 instance;
	private final int playerType = 3;

	private Player3(Game game, KeyHandler keyH) {
		super(game, keyH);
		skillBehavior = new LightFootSkillBehavior(this);
	}

	public static Player getInstance(Game game, KeyHandler keyH) {
		if (instance == null) {
			return instance = new Player3(game, keyH);
		}
		return instance;
	}

	public int getPlayerType() {
		return playerType;
	}

	@Override
	public void getPlayerImage() {

		right1 = setup("p1_right1");
		right2 = setup("p1_right2");
		left1 = setup("p1_left1");
		left2 = setup("p1_left2");

	}

}
