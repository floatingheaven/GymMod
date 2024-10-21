package github.floatingheaven33.list;


import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ConsumableList {
    public static final FoodComponent PROTEIN_BAR_SETTINGS = new FoodComponent.Builder()
            .nutrition(3).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1000, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0), 1.0F)
            .build();

    public static final FoodComponent STEROIDS_SETTINGS = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,10000,2),1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,1000,2),1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,100,3),0.5F)

            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,1,1),1F)


            .build();
}
