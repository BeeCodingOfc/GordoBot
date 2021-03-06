package commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Emote;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/*
 COMANDO PARA TESTE DE ARGUMENTOS E ETC... NÃO POSSUI OBJETIVO, APENAS PARA TESTES

*/

public class teste extends Command {
    public teste(){
        this.name = "teste";
        this.arguments = "<teste1> , <teste2>";
        this.cooldown = 0;
        this.ownerCommand = true;
    }

    @Override
    public void execute(CommandEvent event){
    /*  String guildid = event.getGuild().getId();
        String authorid = event.getAuthor().getId();
        String testePath = ("coinsystem"+"\\"+guildid+"\\"+authorid);
        String authorFile = (authorid+".txt");
        Path pathtxt = Paths.get(testePath + "\\" + authorFile);
        File file = new File(testePath);
        String str = "0";
        byte[] strToBytes = str.getBytes();
        try {
            file.mkdirs();
            Files.createFile(Paths.get(testePath + "\\" + authorFile));
            event.reply("Arquivo criado");
            Files.write(Paths.get(testePath + "\\" + authorFile), strToBytes);

        }catch (Exception ignoredException){
            event.reply("erro arquivo já criado");
        }

        try {
            String readfiletxt = Files.readAllLines(pathtxt).get(0);
            int teste1 = Integer.parseInt(readfiletxt);
            event.reply("entrada:"+teste1);
            teste1 = teste1 - 100;
            String teste2 = String.valueOf(teste1);
            event.reply("saida:"+teste2);
            Files.write(pathtxt, Collections.singleton(teste2));
        } catch (IOException e) {
            e.printStackTrace();
        }


        EmbedBuilder EB = new EmbedBuilder();
        Random random = new Random();
        List<String> randomList = new ArrayList<>();
        randomList.add(":pizza:");
        randomList.add(":chocolate_bar:");
        randomList.add(":hotdog:");
        randomList.add(":salad:");
        String result1 = randomList.get(random.nextInt(randomList.size()));
        String result2 = randomList.get(random.nextInt(randomList.size()));
        String result3 = randomList.get(random.nextInt(randomList.size()));
        String notResult1 = randomList.get(random.nextInt(randomList.size()));
        String notResult2 = randomList.get(random.nextInt(randomList.size()));
        String notResult3 = randomList.get(random.nextInt(randomList.size()));
        String guildId = event.getGuild().getId();
        String authorId = event.getAuthor().getId();
        String finalPath = ("GeneralConfig"+"\\"+guildId+"\\"+authorId);
        String authorFile = (authorId+".txt");
        Path pathtxt = Paths.get(finalPath + "\\" + authorFile);
        String readFileGiveResult = "nada";


        try {
            readFileGiveResult = Files.readAllLines(pathtxt).get(0);
        } catch (IOException ignored) {
                event.reply(event.getAuthor().getAsMention()+" você ainda não criou uma conta no banco.\nDigite ``gordo banco`` para criar uma conta.");
            return;
        }

        int x = Integer.valueOf(readFileGiveResult);
        EB.setAuthor("CAÇA-NIQUEL");
        EB.setTitle("O RESULTADO É:");
        EB.setColor(14395649);
        EB.setFooter("Comando executado por: "+event.getAuthor().getName(),event.getAuthor().getEffectiveAvatarUrl());
        EB.setTimestamp(event.getMessage().getCreationTime());

        EB.setDescription("["+result1+"]"+"["+result2+"]"+"["+result3+"]");
        if(result1 == result2 && result2 == result3){
            if(result2 == ":pizza:"){
                x = x +1000;
                EB.addField("VOCÊ GANHOU: ","1000 pizzas",false);
                String fileout = String.valueOf(x);
                try {
                    Files.write(pathtxt, Collections.singleton(fileout));
                } catch (IOException ignored) { }
                event.reply(EB.build());
                return;
            }

            if(result2 == ":chocolate_bar:"){
                x = x + 500;
                EB.addField("VOCÊ GANHOU: ","500 pizzas",false);
                String fileout = String.valueOf(x);
                try {
                    Files.write(pathtxt, Collections.singleton(fileout));
                } catch (IOException ignored) { }
                event.reply(EB.build());
                return;
            }

            if(result2 == ":hotdog:"){
                x = x + 250;
                EB.addField("VOCÊ GANHOU: ","250 pizzas",false);
                String fileout = String.valueOf(x);
                try {
                    Files.write(pathtxt, Collections.singleton(fileout));
                } catch (IOException ignored) { }
                event.reply(EB.build());
                return;
            }

            if(result2 == ":salad:"){
                EB.addField("Você ganhou:","nada... ninguem gosta de saladas",false);

                event.reply(EB.build());
                return;
            }
            return;
        }

        if (result1 == result2 || result2 == result3 || result1 == result3){
            if(result2 == ":pizza:" || result1 ==":pizza:"){
                x = x + 500;
                EB.addField("VOCÊ GANHOU: ","500 pizzas",false);
                String fileout = String.valueOf(x);
                try {
                    Files.write(pathtxt, Collections.singleton(fileout));
                } catch (IOException ignored) { }
                event.reply(EB.build());
                return;
            }

            if(result2 == ":chocolate_bar:"|| result1 == ":chocolate_bar:"){
                x = x + 250;
                EB.addField("VOCÊ GANHOU: ","250 pizzas",false);
                String fileout = String.valueOf(x);
                try {
                    Files.write(pathtxt, Collections.singleton(fileout));
                } catch (IOException ignored) { }
                event.reply(EB.build());
                return;
            }

            if(result2 == ":hotdog:" || result1 ==":hotdog:"){
                x = x + 175;
                EB.addField("VOCÊ GANHOU: ","175 pizzas",false);
                String fileout = String.valueOf(x);
                try {
                    Files.write(pathtxt, Collections.singleton(fileout));
                } catch (IOException ignored) { }
                event.reply(EB.build());
                return;
            }

            if(result2 == ":salad:"|| result1== ":salad:"){
                EB.addField("Você ganhou:","nada... ninguem gosta de saladas",false);

                event.reply(EB.build());
                return;
            }
        }
        EB.addField("uma pena!","tente novamente",false);
        event.reply(EB.build());
        return;
            */
    }
}
