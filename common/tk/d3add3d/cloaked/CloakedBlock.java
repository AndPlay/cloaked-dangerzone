package tk.d3add3d.cloaked;

import tk.d3add3d.cloaked.lib.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.client.*;
import cpw.mods.fml.relauncher.*;

@SuppressWarnings("unused")
public class CloakedBlock extends Block {
	public static CloakedCreativeTab tab = new CloakedCreativeTab(CloakedCreativeTab.getNextID(),Reference.MOD_ID);
	private String blockTexture;
	/**
	 * @param id - ID (please use IDs form ConfigHandler >> BlockIDs.BLOCK_name)
	 * @param mtl - material of block
	 * @param texture - texture file name
	 */
	public CloakedBlock(int id, Material mtl, String texture) {
		super(id, mtl);
		this.blockTexture = texture;
		this.setCreativeTab(CloakedBlock.tab);
		this.setUnlocalizedName(texture);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister par1IconRegister){ //loading inventory icons
		this.blockIcon = par1IconRegister.registerIcon("cloaked:" + this.blockTexture);
	}
	
}
