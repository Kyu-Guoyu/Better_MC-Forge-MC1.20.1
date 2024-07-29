
package net.guoyu.better_mc.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MusicdiscFUNKESTRANHOSUPERSLOWEDExplicitItem extends RecordItem {
	public MusicdiscFUNKESTRANHOSUPERSLOWEDExplicitItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("better_mc:music_disc.funk_estranho_super_slowed_explicit")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 3000);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
