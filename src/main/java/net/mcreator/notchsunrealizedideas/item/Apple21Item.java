
package net.mcreator.notchsunrealizedideas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.notchsunrealizedideas.NotchsUnrealizedIdeasModElements;

@NotchsUnrealizedIdeasModElements.ModElement.Tag
public class Apple21Item extends NotchsUnrealizedIdeasModElements.ModElement {
	@ObjectHolder("notchs_unrealized_ideas_:apple_21")
	public static final Item block = null;
	public Apple21Item(NotchsUnrealizedIdeasModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("apple_21");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
