package net.mrblockplacer.JM.CuisineMod;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerSaltCollector implements IGuiHandler {

	//returns an instance of the Container you made earlier
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
                    int x, int y, int z) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if(tileEntity instanceof TileEntitySaltCollector){
                    return new ContainerSaltCollector(player.inventory, (TileEntitySaltCollector) tileEntity);
            }
            return null;
    }

    //returns an instance of the Gui you made earlier
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
                    int x, int y, int z) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if(tileEntity instanceof TileEntitySaltCollector){
                    return new GuiSaltCollector(player.inventory, (TileEntitySaltCollector) tileEntity);
            }
            return null;
    }

}
