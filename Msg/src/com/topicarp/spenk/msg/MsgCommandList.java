package com.topicarp.spenk.msg;

import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.Command;
import net.canarymod.commandsys.CommandListener;

public class MsgCommandList implements CommandListener {

	MsgCommands commands;

	public MsgCommandList(MsgCommands commands) {
		this.commands = commands;
	}

	@Command(aliases = { "msg", "m" }, description = "Send a private message to another player", permissions = { "canary.command.player.msg" }, toolTip = "/msg <Player> <Message>", min = 3)
	public void runMsgCommand(MessageReceiver sender, String[] split) {
		commands.runMsg(sender, split);
	}

	@Command(aliases = { "reply", "r" }, description = "Reply on incoming private messages", permissions = { "canary.command.player.msg" }, toolTip = "/reply <Message>", min = 2)
	public void runReplyCommand(MessageReceiver sender, String[] split) {
		commands.reply(sender, split);
	}

	@Command(aliases = { "wmsg" }, description = "watch other's messages", permissions = { "canary.command.player.msg.watch" }, toolTip = "/wmsg", min = 1, max = 1)
	public void runWatchMessage(MessageReceiver sender, String[] split) {
		commands.runWatch(sender, split);
	}

}