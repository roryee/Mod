package roryee.mod.item;

import net.minecraft.item.Item;
import roryee.mod.lib.IDs;

public class ModItems {

    public static Item portFurn;
    public static Item receiver;
    public static Item wire;
    public static Item batteryNormal;

    public static void init() {
        portFurn = new PortableFurnace(IDs.ITEM_ID + IDs.PORT_FURN_ITEM_META);
        receiver = new Receiver(IDs.ITEM_ID + IDs.RECEIVER_ITEM_META);
        wire = new Wire(IDs.ITEM_ID + IDs.WIRE_ITEM_META);
        batteryNormal = new Battery(IDs.ITEM_ID + IDs.BATTERY_NORMAL_ITEM_META,
                1000, false);
    }

}
