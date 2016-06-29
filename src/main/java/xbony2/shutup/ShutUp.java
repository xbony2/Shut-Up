package xbony2.shutup;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@Mod(modid = ShutUp.MODID, version = ShutUp.VERSION)
public class ShutUp {
	public static final String MODID = "shutup";
	public static final String VERSION = "1.0.0a";

	@EventHandler
	public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new ShutUpEventHandler());
	}

	private class ShutUpEventHandler {
		@SubscribeEvent /* Debug code */
		public void join(PlayerLoggedInEvent event){
			EntityPlayer player = event.player;
			player.addChatComponentMessage(new TextComponentString("Hello there, bud!"));
		}
		
		@SubscribeEvent
		public void silence(ServerChatEvent event){/*This only works for player messages, and it's really bothering me :( */
			System.out.println(event.getUsername() + ";" + event.getMessage());
		}
	}
}
