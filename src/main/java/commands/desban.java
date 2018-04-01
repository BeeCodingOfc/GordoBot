package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Member;

public class desban extends Command{
    public desban(){
        this.name = "unban";
        this.aliases = new String[]{"removerban", "desbanir","desbane","tirarmartelo"};
        this.help = "Realizar desbanimento do servidor";
        this.guildOnly = true;
    }

    @Override
    public void execute(CommandEvent event){
        Guild guild = event.getGuild();
        Member author = event.getMessage().getMember();

        if(event.getMessage().getMentionedUsers().isEmpty()){
            event.reply("você não falou ninguem para desbanir");
        }

        if(!author.hasPermission(Permission.BAN_MEMBERS)){
            event.reply("Não tenho permissão para remover o banimento de ninguém, fale com o adiminstrador do servidor");
            return;
        }

        event.reply("comando em desenvolvimento, nada vai acontecer");
        //guild.getController().unban());

    }
}