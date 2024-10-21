package github.floatingheaven33.registry;

import github.floatingheaven33.GymMod;
import github.floatingheaven33.list.ConsumableList;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


import static github.floatingheaven33.GymMod.MOD_ID;

public class ItemRegistry {
    public static final Item PROTEIN_BAR = register("protein_bar",new Item(
            new Item.Settings().food(ConsumableList.PROTEIN_BAR_SETTINGS)));
    public static final Item STEROIDS = register("steroids",new Item(new Item.Settings().food(ConsumableList.STEROIDS_SETTINGS)));









    public static <T extends Item> T register(String name, T item){
        return Registry.register(Registries.ITEM, GymMod.id(name),item);
    }
    public static void load(){};
}