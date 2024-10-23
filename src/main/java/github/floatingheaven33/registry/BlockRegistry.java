package github.floatingheaven33.registry;

import github.floatingheaven33.GymMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlockRegistry {
    public static final Block CHECKMATE_BLOCK = registerBlock(new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)),
            "checkmate",
            true);













    public static Block registerBlock(Block block, String name, boolean shouldRegisterItem){
        Identifier id = GymMod.id(name);

        if(shouldRegisterItem){
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);

        }
        return Registry.register(Registries.BLOCK,id,block);
    }

    public static void blockLoad() {}
}
