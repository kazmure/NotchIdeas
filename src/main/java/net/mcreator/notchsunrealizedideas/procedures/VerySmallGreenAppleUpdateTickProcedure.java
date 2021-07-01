package net.mcreator.notchsunrealizedideas.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.notchsunrealizedideas.block.VerySmallGreenAppleBlock;
import net.mcreator.notchsunrealizedideas.block.SmallGreenAppleBlock;
import net.mcreator.notchsunrealizedideas.NotchsUnrealizedIdeasModElements;
import net.mcreator.notchsunrealizedideas.NotchsUnrealizedIdeasMod;

import java.util.Map;

@NotchsUnrealizedIdeasModElements.ModElement.Tag
public class VerySmallGreenAppleUpdateTickProcedure extends NotchsUnrealizedIdeasModElements.ModElement {
	public VerySmallGreenAppleUpdateTickProcedure(NotchsUnrealizedIdeasModElements instance) {
		super(instance, 25);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NotchsUnrealizedIdeasMod.LOGGER.warn("Failed to load dependency x for procedure VerySmallGreenAppleUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NotchsUnrealizedIdeasMod.LOGGER.warn("Failed to load dependency y for procedure VerySmallGreenAppleUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NotchsUnrealizedIdeasMod.LOGGER.warn("Failed to load dependency z for procedure VerySmallGreenAppleUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NotchsUnrealizedIdeasMod.LOGGER.warn("Failed to load dependency world for procedure VerySmallGreenAppleUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == VerySmallGreenAppleBlock.block.getDefaultState()
				.getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SmallGreenAppleBlock.block.getDefaultState(), 3);
		}
	}
}
