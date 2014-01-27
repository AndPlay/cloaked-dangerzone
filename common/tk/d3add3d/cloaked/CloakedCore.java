package tk.d3add3d.cloaked;

import net.minecraft.block.Block; //we import Block and Material so we can make blocks and give them different materials 
import net.minecraft.block.material.Material;
import net.minecraft.item.Item; //we import Item so we can make items and ItemStack for crafting
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes; //let's make sure we can smelt stuff
import tk.d3add3d.cloaked.lib.*; //we import everything in tk.d3add3d.cloaked.lib
import cpw.mods.fml.common.Mod; //we can now make mod
import cpw.mods.fml.common.Loader; //Useful if you want to know if mod you are referencing is loaded
import cpw.mods.fml.common.Mod.EventHandler; //make sure we know when to load
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry; //allows you to register items and blocks to be in-game 
import cpw.mods.fml.common.registry.LanguageRegistry; //renames previously registered items and block from ClkdDZ.oneBlock.name to Block One
import net.minecraftforge.oredict.*; //let's just be nice and allow others to use our stuff and let's use their stuff :)
import cpw.mods.fml.common.IWorldGenerator; //Interface for adding stuff into world generation

@SuppressWarnings("unused")
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
public class CloakedCore {
	public static Block oneBlock;
	public static Item oneItem;
	CloakedEventHandler eventHandler = new CloakedEventHandler();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		oneBlock = new CloakedBlock(BlockIDs.BLOCK_one, Material.ground, "oneBlock").setHardness(0.0F).setResistance(0.0F).setStepSound(Block.soundStoneFootstep);

		GameRegistry.registerBlock(oneBlock, "oneBlock");
		
		LanguageRegistry.addName(oneBlock, "Block One");
		
		GameRegistry.registerWorldGenerator(eventHandler);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//crafting goes here
	}
}
