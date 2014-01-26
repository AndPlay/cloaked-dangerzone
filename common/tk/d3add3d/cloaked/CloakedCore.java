package tk.d3add3d.cloaked;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import tk.d3add3d.cloaked.lib.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.oredict.*;
import cpw.mods.fml.common.IWorldGenerator;

@SuppressWarnings("unused")
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
public class CloakedCore {
	public static Block oneBlock;
	public static Item oneItem;
	public static CloakedCreativeTab tab = new CloakedCreativeTab(CloakedCreativeTab.getNextID(),Reference.MOD_ID);
	CloakedEventHandler eventHandelr = new CloakedEventHandler();
}
