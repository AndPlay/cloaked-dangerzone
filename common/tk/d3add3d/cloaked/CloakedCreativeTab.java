package tk.d3add3d.cloaked;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class CloakedCreativeTab extends CreativeTabs {
	public CloakedCreativeTab(int id, String name) {
		super(id, name);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public int getTabIconItemIndex() {
		return CloakedCore.oneBlock.blockID;
	}
	
	@Override
    public String getTranslatedTabLabel() {
        return "Cloaked Dangerzone";
    }
}
