package com.topicarp.spenk.msg;

import java.util.ArrayList;
import java.util.HashMap;

import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.chat.MessageReceiver;

public class MsgCommands {

	ArrayList<Player> watchList = new ArrayList<Player>();
	HashMap<Player, Player> lastSendRecords = new HashMap<Player, Player>();

	public void runMsg(MessageReceiver sender, String[] split) {

	}

	public void runWatch(MessageReceiver sender, String[] split) {

	}

	public void reply(MessageReceiver sender, String[] split) {
	}

	public void messageWatch(String playerFromTo, String message) {
		for (Player watcher : watchList) {
			watcher.message(playerFromTo + ": " + message);
		}
	}

	public String combineSplit(int start, String[] split) {
		StringBuilder builder = new StringBuilder();
		for (int i = start; i < split.length; i++) {
			builder.append(split[i] + " ");
		}
		return builder.toString();
	}

	public void logMsg(Player sender, Player receiver) {
		if (lastSendRecords.containsKey(receiver)) {
			lastSendRecords.remove(receiver);
		}
		lastSendRecords.put(receiver, sender);
	}

	public Player getPlayer(MessageReceiver sender) {
		if (sender instanceof Player) {
			return (Player) sender;
		} else {
			return null;
		}
	}

}