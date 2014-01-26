package tk.d3add3d.cloaked.lib;

import java.io.File;

import net.minecraftforge.common.Configuration;

import tk.d3add3d.cloaked.lib.BlockIDs;
import tk.d3add3d.cloaked.lib.MiscConfigs;

public class ConfigHandler {
public static void init(File configFile) {
Configuration config = new Configuration(configFile);

config.load();

BlockIDs.BLOCK_one = config.getBlock("oneBlock", BlockIDs.BLOCK_one_default).getInt();

MiscConfigs.MISC_generateNether = config.get("general", "Generate ores in Nether", MiscConfigs.MISC_generateNether_default, "0 for false, 1 for true").getInt();
MiscConfigs.MISC_generateEnd = config.get("general", "Generate ores in The End", MiscConfigs.MISC_generateEnd_default, "0 for false, 1 for true").getInt();

config.save();

}
}
