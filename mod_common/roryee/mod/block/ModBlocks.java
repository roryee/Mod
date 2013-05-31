package roryee.mod.block;

import net.minecraft.block.Block;
import roryee.mod.lib.IDs;
import roryee.mod.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    
    public static Block elecFurn;
    public static Block vaporizer;
    public static Block materializer;
    public static Block dataBank;
    public static Block metalBox;
    public static Block receiver;
    public static Block wire;

    public static void init() {
        elecFurn = new ElectricFurnace(IDs.MACHINE_BLOCK_ID
                + IDs.ELEC_FURN_BLOCK_META);
        vaporizer = new Vaporizer(IDs.MACHINE_BLOCK_ID
                + IDs.VAPORIZER_BLOCK_META);
        materializer = new Materializer(IDs.MACHINE_BLOCK_ID
                + IDs.MATERIALIZER_BLOCK_META);
        dataBank = new DataBank(IDs.MACHINE_BLOCK_ID + IDs.DATA_BANK_BLOCK_META);
        metalBox = new MetalBox(IDs.MACHINE_BLOCK_ID + IDs.METAL_BOX_BLOCK_META);
        receiver = new Receiver(IDs.MACHINE_BLOCK_ID + IDs.RECEIVER_BLOCK_META);
        wire = new Wire(IDs.MACHINE_BLOCK_ID + IDs.WIRE_BLOCK_META);

        GameRegistry.registerBlock(elecFurn, Strings.ELEC_FURN_BLOCK_NAME);
        GameRegistry.registerBlock(vaporizer, Strings.VAPORIZER_BLOCK_NAME);
        GameRegistry.registerBlock(materializer,
                Strings.MATERIALIZER_BLOCK_NAME);
        GameRegistry.registerBlock(dataBank, Strings.DATA_BANK_BLOCK_NAME);
        GameRegistry.registerBlock(metalBox, Strings.METAL_BOX_BLOCK_NAME);
        GameRegistry.registerBlock(receiver, Strings.RECEIVER_BLOCK_NAME);
        GameRegistry.registerBlock(wire, Strings.WIRE_BLOCK_NAME);
    }
}
