package roryee.mod.item;

import roryee.mod.lib.IDs;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Wire extends Item {

    public Wire(int id) {
        super(id);
    }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player,
            World world, int x, int y, int z, int side, float par8, float par9,
            float par10) {

        int id = world.getBlockId(x, y, z);

        if (id != Block.vine.blockID && id != Block.tallGrass.blockID) {

        }

        if (itemstack.stackSize == 0) {
            return false;
        }

        if (world.canPlaceEntityOnSide(IDs.MACHINE_BLOCK_ID
                + IDs.WIRE_BLOCK_META, x, y, z, false, side, player, itemstack)) {

            world.setBlock(x, y, z, IDs.MACHINE_BLOCK_ID + IDs.WIRE_BLOCK_META);

            return true;
        } else {
            return false;
        }
    }

}
