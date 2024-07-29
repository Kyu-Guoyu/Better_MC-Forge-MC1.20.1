
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.guoyu.better_mc.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.guoyu.better_mc.BetterMcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterMcModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterMcMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BetterMcModItems.MUSIC_DISC_SEA_OF_TRANQUILITY.get());
			tabData.accept(BetterMcModItems.MUSIC_DISC_GIGA_CHAD_THEME_PHONK_HOUSE_VERSION.get());
			tabData.accept(BetterMcModItems.MUSIC_DISC_HU_DIE_BU_PHONK.get());
			tabData.accept(BetterMcModItems.MUSIC_DISC_BANKAI_EXPLICIT.get());
			tabData.accept(BetterMcModItems.MUSIC_DISC_DARKSIDE_EXPLICIT.get());
			tabData.accept(BetterMcModItems.MUSIC_DISC_FUNKESTRANHOSUPERSLOWED_EXPLICIT.get());
			tabData.accept(BetterMcModItems.MUSIC_DISC_9_IN_MY_HAND_FAST_FURIOUS_DRIFT_TAPE_PHONK_VOL_1.get());
		}
	}
}
