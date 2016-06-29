package xbony2.shutup;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ShutUp.MODID, version = ShutUp.VERSION)
public class ShutUp {
	public static final String MODID = "shutup";
	public static final String VERSION = "1.0.0a";

	@EventHandler
	public void init(FMLInitializationEvent event){
		System.out.println("DIRT BLOCK >> " + Blocks.DIRT.getUnlocalizedName());
	}
}
