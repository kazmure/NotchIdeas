package net.mcreator.notchsunrealizedideas.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.notchsunrealizedideas.NotchsUnrealizedIdeasModElements;
import net.mcreator.notchsunrealizedideas.NotchsUnrealizedIdeasMod;

import java.util.Map;

@NotchsUnrealizedIdeasModElements.ModElement.Tag
public class GreenApple21FoodEatenProcedure extends NotchsUnrealizedIdeasModElements.ModElement {
	public GreenApple21FoodEatenProcedure(NotchsUnrealizedIdeasModElements instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NotchsUnrealizedIdeasMod.LOGGER.warn("Failed to load dependency entity for procedure GreenApple21FoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() <= 0.5)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 200, (int) 1, (false), (false)));
		}
		if ((Math.random() <= 0.5)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 200, (int) 1, (false), (false)));
		}
		if ((Math.random() <= 0.5)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 200, (int) 1, (false), (false)));
		}
		if ((Math.random() <= 0.5)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 200, (int) 1, (false), (false)));
		}
	}
}
