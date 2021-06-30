package net.mcreator.notchsunrealizedideas.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.notchsunrealizedideas.item.GreenApple21Item;
import net.mcreator.notchsunrealizedideas.block.GreenAppleBlock;
import net.mcreator.notchsunrealizedideas.NotchsUnrealizedIdeasModElements;
import net.mcreator.notchsunrealizedideas.NotchsUnrealizedIdeasMod;

import java.util.Map;

@NotchsUnrealizedIdeasModElements.ModElement.Tag
public class GreenApple21RightClickedOnBlockProcedure extends NotchsUnrealizedIdeasModElements.ModElement {
	public GreenApple21RightClickedOnBlockProcedure(NotchsUnrealizedIdeasModElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NotchsUnrealizedIdeasMod.LOGGER.warn("Failed to load dependency entity for procedure GreenApple21RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NotchsUnrealizedIdeasMod.LOGGER.warn("Failed to load dependency x for procedure GreenApple21RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NotchsUnrealizedIdeasMod.LOGGER.warn("Failed to load dependency y for procedure GreenApple21RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NotchsUnrealizedIdeasMod.LOGGER.warn("Failed to load dependency z for procedure GreenApple21RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NotchsUnrealizedIdeasMod.LOGGER.warn("Failed to load dependency world for procedure GreenApple21RightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.LEAVES)) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(GreenApple21Item.block, (int) (1)).getItem())) {
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), GreenAppleBlock.block.getDefaultState(), 3);
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(GreenAppleBlock.block, (int) (1));
					_setstack.setCount(
							(int) (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getCount())
									- 1));
					((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(GreenApple21Item.block, (int) (1)).getItem())) {
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), GreenAppleBlock.block.getDefaultState(), 3);
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.OFF_HAND, true);
				}
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(GreenAppleBlock.block, (int) (1));
					_setstack.setCount(
							(int) (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)).getCount())
									- 1));
					((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			}
		}
	}
}
