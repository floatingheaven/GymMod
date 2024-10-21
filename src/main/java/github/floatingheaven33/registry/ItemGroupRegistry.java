package github.floatingheaven33.registry;

import github.floatingheaven33.GymMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ItemGroupRegistry {
    public static final Text GYM_GROUP_TITLE = Text.translatable("Gym Mod");


public static final ItemGroup GYM_MOD_MAIN_GROUP = registerGroup("gymmod_group",FabricItemGroup.builder()
        .displayName(GYM_GROUP_TITLE)
        .icon(ItemRegistry.PROTEIN_BAR::getDefaultStack)
        .entries((displayContext, entries) ->{
            entries.add(ItemRegistry.PROTEIN_BAR);
            entries.add(ItemRegistry.STEROIDS);



        } )
        .build()


);

    public static <T extends ItemGroup> T registerGroup(String name, T group){
        return Registry.register(Registries.ITEM_GROUP,GymMod.id(name),group);
    }
    public static void loadGroup(){

    }

}
