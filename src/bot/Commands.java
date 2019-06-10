package bot;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
 
public class Commands extends ListenerAdapter{
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
       
        if (args[0].contains("void")) {
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("boo").queue();
        }
    }
}