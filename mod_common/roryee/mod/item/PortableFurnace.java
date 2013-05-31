package roryee.mod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PortableFurnace extends Item {
    public PortableFurnace(int id) {
        super(id);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world,
            EntityPlayer player) {
        
        return itemstack;
    }
}
