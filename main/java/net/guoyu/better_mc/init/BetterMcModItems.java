
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.guoyu.better_mc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.guoyu.better_mc.item.MusicdiscSeaofTranquilityItem;
import net.guoyu.better_mc.item.MusicdiscHuDieBuPHONKItem;
import net.guoyu.better_mc.item.MusicdiscGigaChadThemePhonkHouseVersionItem;
import net.guoyu.better_mc.item.MusicdiscFUNKESTRANHOSUPERSLOWEDExplicitItem;
import net.guoyu.better_mc.item.MusicdiscDARKSIDEExplicitItem;
import net.guoyu.better_mc.item.MusicdiscBANKAIExplicitItem;
import net.guoyu.better_mc.item.Musicdisc9InMyHandFastFuriousDriftTapePhonkVol1Item;
import net.guoyu.better_mc.BetterMcMod;

public class BetterMcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetterMcMod.MODID);
	public static final RegistryObject<Item> MUSIC_DISC_SEA_OF_TRANQUILITY = REGISTRY.register("music_disc_sea_of_tranquility", () -> new MusicdiscSeaofTranquilityItem());
	public static final RegistryObject<Item> MUSIC_DISC_GIGA_CHAD_THEME_PHONK_HOUSE_VERSION = REGISTRY.register("music_disc_giga_chad_theme_phonk_house_version", () -> new MusicdiscGigaChadThemePhonkHouseVersionItem());
	public static final RegistryObject<Item> MUSIC_DISC_HU_DIE_BU_PHONK = REGISTRY.register("music_disc_hu_die_bu_phonk", () -> new MusicdiscHuDieBuPHONKItem());
	public static final RegistryObject<Item> MUSIC_DISC_BANKAI_EXPLICIT = REGISTRY.register("music_disc_bankai_explicit", () -> new MusicdiscBANKAIExplicitItem());
	public static final RegistryObject<Item> MUSIC_DISC_DARKSIDE_EXPLICIT = REGISTRY.register("music_disc_darkside_explicit", () -> new MusicdiscDARKSIDEExplicitItem());
	public static final RegistryObject<Item> MUSIC_DISC_FUNKESTRANHOSUPERSLOWED_EXPLICIT = REGISTRY.register("music_disc_funkestranhosuperslowed_explicit", () -> new MusicdiscFUNKESTRANHOSUPERSLOWEDExplicitItem());
	public static final RegistryObject<Item> MUSIC_DISC_9_IN_MY_HAND_FAST_FURIOUS_DRIFT_TAPE_PHONK_VOL_1 = REGISTRY.register("music_disc_9_in_my_hand_fast_furious_drift_tape_phonk_vol_1",
			() -> new Musicdisc9InMyHandFastFuriousDriftTapePhonkVol1Item());
}
