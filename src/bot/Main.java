package bot;

import javax.security.auth.login.LoginException;
 
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
 
public class Main {
    public static JDA jda;
    public static String prefix = "~";
    public static String mention = "void";
   
    public static void main(String[] args) throws LoginException {
        jda = new JDABuilder(AccountType.BOT).setToken("NTg3NDY1NjQ2Mjc1NTU5NDU0.XP3W6w._HCmaolDzeNuZmZvhZMPYzNojfo").build();
        jda.getPresence().setStatus(OnlineStatus.ONLINE);
        jda.getPresence().setGame(Game.watching("The Void"));
       
        jda.addEventListener(new Commands());
    }
}