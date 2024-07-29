
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.guoyu.better_mc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.guoyu.better_mc.BetterMcMod;

public class BetterMcModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BetterMcMod.MODID);
	public static final RegistryObject<SoundEvent> MUSIC_DISC_SEA_OF_TRANQUILITY = REGISTRY.register("music_disc.sea_of_tranquility", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_mc", "music_disc.sea_of_tranquility")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_GIGACHAD_THEME_PHONK_HOUSE_VERSION = REGISTRY.register("music_disc.gigachad_theme_phonk_house_version",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_mc", "music_disc.gigachad_theme_phonk_house_version")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_HU_DIE_BU_PHONK = REGISTRY.register("music_disc.hu_die_bu_phonk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_mc", "music_disc.hu_die_bu_phonk")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_BANKAI_EXPLICIT = REGISTRY.register("music_disc.bankai_explicit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_mc", "music_disc.bankai_explicit")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_DARKSIDE = REGISTRY.register("music_disc.darkside", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_mc", "music_disc.darkside")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_FUNK_ESTRANHO_SUPER_SLOWED_EXPLICIT = REGISTRY.register("music_disc.funk_estranho_super_slowed_explicit",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_mc", "music_disc.funk_estranho_super_slowed_explicit")));
	public static final RegistryObject<SoundEvent> MUSIC_DISC_9_IN_MY_HAND_FAST_FURIOUS_DRIFT_TAPE_PHONK_VOL_1 = REGISTRY.register("music_disc.9_in_my_hand_fast_furious_drift_tape_phonk_vol_1",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("better_mc", "music_disc.9_in_my_hand_fast_furious_drift_tape_phonk_vol_1")));
}
