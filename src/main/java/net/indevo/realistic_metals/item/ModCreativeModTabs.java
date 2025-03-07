package net.indevo.realistic_metals.item;

import net.indevo.realistic_metals.Realistic_Metals;
import net.indevo.realistic_metals.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Realistic_Metals.MOD_ID);

    public static final RegistryObject<CreativeModeTab> REALISTIC_METALS_TAB = CREATIVE_MODE_TABS.register("realistic_metals_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Platinum_Ingot.get()))
                    .title(Component.translatable("creativetab.realistic_metals_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.Aluminum_Coin.get());
                        pOutput.accept(ModItems.Aluminum_Dust.get());
                        pOutput.accept(ModItems.Aluminum_Gear.get());
                        pOutput.accept(ModItems.Aluminum_Ingot.get());
                        pOutput.accept(ModItems.Aluminum_Nugget.get());
                        pOutput.accept(ModItems.Aluminum_Plate.get());
                        pOutput.accept(ModItems.Aluminum_Rod.get());
                        pOutput.accept(ModItems.Amethyst_Dust.get());
                        pOutput.accept(ModItems.Andesite_Alloy_Coin.get());
                        pOutput.accept(ModItems.Andesite_Alloy_Dust.get());
                        pOutput.accept(ModItems.Andesite_Alloy_Gear.get());
                        pOutput.accept(ModItems.Andesite_Alloy_Ingot.get());
                        pOutput.accept(ModItems.Andesite_Alloy_Nugget.get());
                        pOutput.accept(ModItems.Andesite_Alloy_Plate.get());
                        pOutput.accept(ModItems.Andesite_Alloy_Rod.get());
                        pOutput.accept(ModItems.Apatite.get());
                        pOutput.accept(ModItems.Apatite_Coin.get());
                        pOutput.accept(ModItems.Apatite_Dust.get());
                        pOutput.accept(ModItems.Apatite_Plate.get());
                        pOutput.accept(ModItems.Apatite_Rod.get());
                        pOutput.accept(ModItems.Brass_Coin.get());
                        pOutput.accept(ModItems.Brass_Dust.get());
                        pOutput.accept(ModItems.Brass_Gear.get());
                        pOutput.accept(ModItems.Brass_Ingot.get());
                        pOutput.accept(ModItems.Brass_Nugget.get());
                        pOutput.accept(ModItems.Brass_Plate.get());
                        pOutput.accept(ModItems.Brass_Rod.get());
                        pOutput.accept(ModItems.Bronze_Coin.get());
                        pOutput.accept(ModItems.Bronze_Dust.get());
                        pOutput.accept(ModItems.Bronze_Gear.get());
                        pOutput.accept(ModItems.Bronze_Ingot.get());
                        pOutput.accept(ModItems.Bronze_Nugget.get());
                        pOutput.accept(ModItems.Bronze_Plate.get());
                        pOutput.accept(ModItems.Bronze_Rod.get());
                        pOutput.accept(ModItems.Calcite_Dust.get());
                        pOutput.accept(ModItems.Charcoal_Dust.get());
                        pOutput.accept(ModItems.Cinnabar.get());
                        pOutput.accept(ModItems.Cinnabar_Coin.get());
                        pOutput.accept(ModItems.Cinnabar_Dust.get());
                        pOutput.accept(ModItems.Cinnabar_Plate.get());
                        pOutput.accept(ModItems.Cinnabar_Rod.get());
                        pOutput.accept(ModItems.Coal_Dust.get());
                        pOutput.accept(ModItems.Constantan_Coin.get());
                        pOutput.accept(ModItems.Constantan_Dust.get());
                        pOutput.accept(ModItems.Constantan_Gear.get());
                        pOutput.accept(ModItems.Constantan_Ingot.get());
                        pOutput.accept(ModItems.Constantan_Nugget.get());
                        pOutput.accept(ModItems.Constantan_Plate.get());
                        pOutput.accept(ModItems.Constantan_Rod.get());
                        pOutput.accept(ModItems.Copper_Coin.get());
                        pOutput.accept(ModItems.Copper_Dust.get());
                        pOutput.accept(ModItems.Copper_Gear.get());
                        pOutput.accept(ModItems.Copper_Nugget.get());
                        pOutput.accept(ModItems.Copper_Plate.get());
                        pOutput.accept(ModItems.Copper_Rod.get());
                        pOutput.accept(ModItems.Diamond_Coin.get());
                        pOutput.accept(ModItems.Diamond_Dust.get());
                        pOutput.accept(ModItems.Diamond_Gear.get());
                        pOutput.accept(ModItems.Diamond_Plate.get());
                        pOutput.accept(ModItems.Electrum_Coin.get());
                        pOutput.accept(ModItems.Electrum_Dust.get());
                        pOutput.accept(ModItems.Electrum_Gear.get());
                        pOutput.accept(ModItems.Electrum_Ingot.get());
                        pOutput.accept(ModItems.Electrum_Nugget.get());
                        pOutput.accept(ModItems.Electrum_Plate.get());
                        pOutput.accept(ModItems.Electrum_Rod.get());
                        pOutput.accept(ModItems.Emerald_Coin.get());
                        pOutput.accept(ModItems.Emerald_Dust.get());
                        pOutput.accept(ModItems.Emerald_Gear.get());
                        pOutput.accept(ModItems.Emerald_Plate.get());
                        pOutput.accept(ModItems.Ender_Pearl_Dust.get());
                        pOutput.accept(ModItems.End_Stone_Dust.get());
                        pOutput.accept(ModItems.Enderium_Coin.get());
                        pOutput.accept(ModItems.Enderium_Dust.get());
                        pOutput.accept(ModItems.Enderium_Gear.get());
                        pOutput.accept(ModItems.Enderium_Ingot.get());
                        pOutput.accept(ModItems.Enderium_Nugget.get());
                        pOutput.accept(ModItems.Enderium_Plate.get());
                        pOutput.accept(ModItems.Enderium_Rod.get());
                        pOutput.accept(ModItems.Enriched_Uranium.get());
                        pOutput.accept(ModItems.Enriched_Uranium_Dust.get());
                        pOutput.accept(ModItems.Gold_Coin.get());
                        pOutput.accept(ModItems.Gold_Dust.get());
                        pOutput.accept(ModItems.Gold_Gear.get());
                        pOutput.accept(ModItems.Gold_Plate.get());
                        pOutput.accept(ModItems.Gold_Rod.get());
                        pOutput.accept(ModItems.Graphite_Dust.get());
                        pOutput.accept(ModItems.Graphite_Ingot.get());
                        pOutput.accept(ModItems.Graphite_Plate.get());
                        pOutput.accept(ModItems.Graphite_Rod.get());
                        pOutput.accept(ModItems.Invar_Coin.get());
                        pOutput.accept(ModItems.Invar_Dust.get());
                        pOutput.accept(ModItems.Invar_Gear.get());
                        pOutput.accept(ModItems.Invar_Ingot.get());
                        pOutput.accept(ModItems.Invar_Nugget.get());
                        pOutput.accept(ModItems.Invar_Plate.get());
                        pOutput.accept(ModItems.Invar_Rod.get());
                        pOutput.accept(ModItems.Iridium_Coin.get());
                        pOutput.accept(ModItems.Iridium_Dust.get());
                        pOutput.accept(ModItems.Iridium_Gear.get());
                        pOutput.accept(ModItems.Iridium_Ingot.get());
                        pOutput.accept(ModItems.Iridium_Nugget.get());
                        pOutput.accept(ModItems.Iridium_Plate.get());
                        pOutput.accept(ModItems.Iridium_Rod.get());
                        pOutput.accept(ModItems.Iron_Coin.get());
                        pOutput.accept(ModItems.Iron_Dust.get());
                        pOutput.accept(ModItems.Iron_Gear.get());
                        pOutput.accept(ModItems.Iron_Plate.get());
                        pOutput.accept(ModItems.Iron_Rod.get());
                        pOutput.accept(ModItems.Platinum_Ingot.get());
                        pOutput.accept(ModItems.Lapis_Lazuli_Coin.get());
                        pOutput.accept(ModItems.Lapis_Lazuli_Dust.get());
                        pOutput.accept(ModItems.Lapis_Lazuli_Gear.get());
                        pOutput.accept(ModItems.Lapis_Lazuli_Plate.get());
                        pOutput.accept(ModItems.Lead_Coin.get());
                        pOutput.accept(ModItems.Lead_Dust.get());
                        pOutput.accept(ModItems.Lead_Gear.get());
                        pOutput.accept(ModItems.Lead_Ingot.get());
                        pOutput.accept(ModItems.Lead_Nugget.get());
                        pOutput.accept(ModItems.Lead_Plate.get());
                        pOutput.accept(ModItems.Lead_Rod.get());
                        pOutput.accept(ModItems.Lumium_Coin.get());
                        pOutput.accept(ModItems.Lumium_Dust.get());
                        pOutput.accept(ModItems.Lumium_Gear.get());
                        pOutput.accept(ModItems.Lumium_Ingot.get());
                        pOutput.accept(ModItems.Lumium_Nugget.get());
                        pOutput.accept(ModItems.Lumium_Plate.get());
                        pOutput.accept(ModItems.Lumium_Rod.get());
                        pOutput.accept(ModItems.Netherrack_Dust.get());
                        pOutput.accept(ModItems.Netherite_Coin.get());
                        pOutput.accept(ModItems.Netherite_Dust.get());
                        pOutput.accept(ModItems.Netherite_Gear.get());
                        pOutput.accept(ModItems.Netherite_Nugget.get());
                        pOutput.accept(ModItems.Netherite_Plate.get());
                        pOutput.accept(ModItems.Netherite_Rod.get());
                        pOutput.accept(ModItems.Nickel_Coin.get());
                        pOutput.accept(ModItems.Nickel_Dust.get());
                        pOutput.accept(ModItems.Nickel_Gear.get());
                        pOutput.accept(ModItems.Nickel_Ingot.get());
                        pOutput.accept(ModItems.Nickel_Nugget.get());
                        pOutput.accept(ModItems.Nickel_Plate.get());
                        pOutput.accept(ModItems.Nickel_Rod.get());
                        pOutput.accept(ModItems.Obsidian_Dust.get());
                        pOutput.accept(ModItems.Osmium_Coin.get());
                        pOutput.accept(ModItems.Osmium_Dust.get());
                        pOutput.accept(ModItems.Osmium_Gear.get());
                        pOutput.accept(ModItems.Osmium_Ingot.get());
                        pOutput.accept(ModItems.Osmium_Nugget.get());
                        pOutput.accept(ModItems.Osmium_Plate.get());
                        pOutput.accept(ModItems.Osmium_Rod.get());
                        pOutput.accept(ModItems.Plastic_Plate.get());
                        pOutput.accept(ModItems.Plastic_Rod.get());
                        pOutput.accept(ModItems.Platinum_Coin.get());
                        pOutput.accept(ModItems.Platinum_Dust.get());
                        pOutput.accept(ModItems.Platinum_Gear.get());
                        pOutput.accept(ModItems.Platinum_Ingot.get());
                        pOutput.accept(ModItems.Platinum_Nugget.get());
                        pOutput.accept(ModItems.Platinum_Plate.get());
                        pOutput.accept(ModItems.Platinum_Rod.get());
                        pOutput.accept(ModItems.Polished_Apatite.get());
                        pOutput.accept(ModItems.Polished_Cinnabar.get());
                        pOutput.accept(ModItems.Polished_Diamond.get());
                        pOutput.accept(ModItems.Polished_Emerald.get());
                        pOutput.accept(ModItems.Polished_Quartz.get());
                        pOutput.accept(ModItems.Polished_Lapis_Lazuli.get());
                        pOutput.accept(ModItems.Polished_Ruby.get());
                        pOutput.accept(ModItems.Polished_Sapphire.get());
                        pOutput.accept(ModItems.Crying_Obsidian_Dust.get());
                        pOutput.accept(ModItems.Prismarine_Dust.get());
                        pOutput.accept(ModItems.Quartz_Coin.get());
                        pOutput.accept(ModItems.Quartz_Dust.get());
                        pOutput.accept(ModItems.Quartz_Enriched_Iron_Coin.get());
                        pOutput.accept(ModItems.Quartz_Enriched_Iron_Dust.get());
                        pOutput.accept(ModItems.Quartz_Enriched_Iron_Gear.get());
                        pOutput.accept(ModItems.Quartz_Enriched_Iron_Ingot.get());
                        pOutput.accept(ModItems.Quartz_Enriched_Iron_Nugget.get());
                        pOutput.accept(ModItems.Quartz_Enriched_Iron_Plate.get());
                        pOutput.accept(ModItems.Quartz_Enriched_Iron_Rod.get());
                        pOutput.accept(ModItems.Quartz_Gear.get());
                        pOutput.accept(ModItems.Quartz_Plate.get());
                        pOutput.accept(ModItems.Quartz_Coin.get());
                        pOutput.accept(ModItems.Quartz_Dust.get());
                        pOutput.accept(ModItems.Raw_Aluminum.get());
                        pOutput.accept(ModItems.Raw_Iridium.get());
                        pOutput.accept(ModItems.Raw_Lead.get());
                        pOutput.accept(ModItems.Raw_Nickel.get());
                        pOutput.accept(ModItems.Raw_Osmium.get());
                        pOutput.accept(ModItems.Raw_Platinum.get());
                        pOutput.accept(ModItems.Raw_Silver.get());
                        pOutput.accept(ModItems.Raw_Tin.get());
                        pOutput.accept(ModItems.Raw_Uranium.get());
                        pOutput.accept(ModItems.Raw_Zinc.get());
                        pOutput.accept(ModItems.Refined_Glowstone_Coin.get());
                        pOutput.accept(ModItems.Refined_Glowstone_Dust.get());
                        pOutput.accept(ModItems.Refined_Glowstone_Gear.get());
                        pOutput.accept(ModItems.Refined_Glowstone_Ingot.get());
                        pOutput.accept(ModItems.Refined_Glowstone_Nugget.get());
                        pOutput.accept(ModItems.Refined_Glowstone_Plate.get());
                        pOutput.accept(ModItems.Refined_Glowstone_Rod.get());
                        pOutput.accept(ModItems.Refined_Obsidian_Coin.get());
                        pOutput.accept(ModItems.Refined_Obsidian_Dust.get());
                        pOutput.accept(ModItems.Refined_Obsidian_Gear.get());
                        pOutput.accept(ModItems.Refined_Obsidian_Ingot.get());
                        pOutput.accept(ModItems.Refined_Obsidian_Nugget.get());
                        pOutput.accept(ModItems.Refined_Obsidian_Plate.get());
                        pOutput.accept(ModItems.Refined_Obsidian_Rod.get());
                        pOutput.accept(ModItems.Rose_Gold_Coin.get());
                        pOutput.accept(ModItems.Rose_Gold_Dust.get());
                        pOutput.accept(ModItems.Rose_Gold_Gear.get());
                        pOutput.accept(ModItems.Rose_Gold_Ingot.get());
                        pOutput.accept(ModItems.Rose_Gold_Nugget.get());
                        pOutput.accept(ModItems.Rose_Gold_Plate.get());
                        pOutput.accept(ModItems.Rose_Gold_Rod.get());
                        pOutput.accept(ModItems.Ruby.get());
                        pOutput.accept(ModItems.Ruby_Coin.get());
                        pOutput.accept(ModItems.Ruby_Dust.get());
                        pOutput.accept(ModItems.Ruby_Gear.get());
                        pOutput.accept(ModItems.Ruby_Plate.get());
                        pOutput.accept(ModItems.Ruby_Rod.get());
                        pOutput.accept(ModItems.Sapphire.get());
                        pOutput.accept(ModItems.Sapphire_Coin.get());
                        pOutput.accept(ModItems.Sapphire_Dust.get());
                        pOutput.accept(ModItems.Sapphire_Gear.get());
                        pOutput.accept(ModItems.Sapphire_Plate.get());
                        pOutput.accept(ModItems.Sapphire_Rod.get());
                        pOutput.accept(ModItems.Signalum_Coin.get());
                        pOutput.accept(ModItems.Signalum_Dust.get());
                        pOutput.accept(ModItems.Signalum_Gear.get());
                        pOutput.accept(ModItems.Signalum_Ingot.get());
                        pOutput.accept(ModItems.Signalum_Nugget.get());
                        pOutput.accept(ModItems.Signalum_Plate.get());
                        pOutput.accept(ModItems.Signalum_Rod.get());
                        pOutput.accept(ModItems.Silver_Coin.get());
                        pOutput.accept(ModItems.Silver_Dust.get());
                        pOutput.accept(ModItems.Silver_Gear.get());
                        pOutput.accept(ModItems.Silver_Ingot.get());
                        pOutput.accept(ModItems.Silver_Nugget.get());
                        pOutput.accept(ModItems.Silver_Plate.get());
                        pOutput.accept(ModItems.Silver_Rod.get());
                        pOutput.accept(ModItems.Steel_Coin.get());
                        pOutput.accept(ModItems.Steel_Dust.get());
                        pOutput.accept(ModItems.Steel_Gear.get());
                        pOutput.accept(ModItems.Steel_Ingot.get());
                        pOutput.accept(ModItems.Steel_Nugget.get());
                        pOutput.accept(ModItems.Steel_Plate.get());
                        pOutput.accept(ModItems.Steel_Rod.get());
                        pOutput.accept(ModItems.Iron_Compressed_Coin.get());
                        pOutput.accept(ModItems.Iron_Compressed_Dust.get());
                        pOutput.accept(ModItems.Iron_Compressed_Gear.get());
                        pOutput.accept(ModItems.Iron_Compressed_Ingot.get());
                        pOutput.accept(ModItems.Iron_Compressed_Nugget.get());
                        pOutput.accept(ModItems.Iron_Compressed_Plate.get());
                        pOutput.accept(ModItems.Iron_Compressed_Rod.get());
                        pOutput.accept(ModItems.Tin_Coin.get());
                        pOutput.accept(ModItems.Tin_Dust.get());
                        pOutput.accept(ModItems.Tin_Gear.get());
                        pOutput.accept(ModItems.Tin_Ingot.get());
                        pOutput.accept(ModItems.Tin_Nugget.get());
                        pOutput.accept(ModItems.Tin_Plate.get());
                        pOutput.accept(ModItems.Tin_Rod.get());
                        pOutput.accept(ModItems.Uranium_Coin.get());
                        pOutput.accept(ModItems.Uranium_Dust.get());
                        pOutput.accept(ModItems.Uranium_Gear.get());
                        pOutput.accept(ModItems.Uranium_Ingot.get());
                        pOutput.accept(ModItems.Uranium_Nugget.get());
                        pOutput.accept(ModItems.Uranium_Plate.get());
                        pOutput.accept(ModItems.Uranium_Rod.get());
                        pOutput.accept(ModItems.Zinc_Dust.get());
                        pOutput.accept(ModItems.Zinc_Coin.get());
                        pOutput.accept(ModItems.Zinc_Gear.get());
                        pOutput.accept(ModItems.Zinc_Ingot.get());
                        pOutput.accept(ModItems.Zinc_Plate.get());
                        pOutput.accept(ModItems.Zinc_Nugget.get());
                        pOutput.accept(ModItems.Zinc_Rod.get());
                        pOutput.accept(ModItems.Iron_Hammer.get());
                        pOutput.accept(ModItems.Brass_Hammer.get());
                        pOutput.accept(ModItems.Enderium_Hammer.get());
                        pOutput.accept(ModItems.Osmium_Hammer.get());

                        pOutput.accept(ModBlocks.Aluminum_Block.get());
                        pOutput.accept(ModBlocks.Aluminum_Ore.get());
                        pOutput.accept(ModBlocks.Andesite_Alloy_Block.get());
                        pOutput.accept(ModBlocks.Apatite_Block.get());
                        pOutput.accept(ModBlocks.Apatite_Ore.get());
                        pOutput.accept(ModBlocks.Brass_Block.get());
                        pOutput.accept(ModBlocks.Bronze_Block.get());
                        pOutput.accept(ModBlocks.Cinnabar_Block.get());
                        pOutput.accept(ModBlocks.Cinnabar_Ore.get());
                        pOutput.accept(ModBlocks.Constantan_Block.get());
                        pOutput.accept(ModBlocks.Deepslate_Aluminum_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Apatite_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Cinnabar_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Iridium_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Lead_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Nickel_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Osmium_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Platinum_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Ruby_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Sapphire_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Silver_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Tin_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Uranium_Ore.get());
                        pOutput.accept(ModBlocks.Deepslate_Zinc_Ore.get());
                        pOutput.accept(ModBlocks.Electrum_Block.get());
                        pOutput.accept(ModBlocks.Enderium_Block.get());
                        pOutput.accept(ModBlocks.Graphite_Block.get());
                        pOutput.accept(ModBlocks.Iron_Compressed_Block.get());
                        pOutput.accept(ModBlocks.Invar_Block.get());
                        pOutput.accept(ModBlocks.Iridium_Block.get());
                        pOutput.accept(ModBlocks.Iridium_Ore.get());
                        pOutput.accept(ModBlocks.Lead_Block.get());
                        pOutput.accept(ModBlocks.Lead_Ore.get());
                        pOutput.accept(ModBlocks.Lumium_Block.get());
                        pOutput.accept(ModBlocks.Nickel_Block.get());
                        pOutput.accept(ModBlocks.Nickel_Ore.get());
                        pOutput.accept(ModBlocks.Osmium_Block.get());
                        pOutput.accept(ModBlocks.Osmium_Ore.get());
                        pOutput.accept(ModBlocks.Platinum_Block.get());
                        pOutput.accept(ModBlocks.Platinum_Ore.get());
                        pOutput.accept(ModBlocks.Quartz_Enriched_Iron_Block.get());
                        pOutput.accept(ModBlocks.Raw_Aluminum_Block.get());
                        pOutput.accept(ModBlocks.Raw_Iridium_Block.get());
                        pOutput.accept(ModBlocks.Raw_Lead_Block.get());
                        pOutput.accept(ModBlocks.Raw_Nickel_Block.get());
                        pOutput.accept(ModBlocks.Raw_Osmium_Block.get());
                        pOutput.accept(ModBlocks.Raw_Platinum_Block.get());
                        pOutput.accept(ModBlocks.Raw_Silver_Block.get());
                        pOutput.accept(ModBlocks.Raw_Tin_Block.get());
                        pOutput.accept(ModBlocks.Raw_Uranium_Block.get());
                        pOutput.accept(ModBlocks.Raw_Zinc_Block.get());
                        pOutput.accept(ModBlocks.Refined_Glowstone_Block.get());
                        pOutput.accept(ModBlocks.Refined_Obsidian_Block.get());
                        pOutput.accept(ModBlocks.Rose_Gold_Block.get());
                        pOutput.accept(ModBlocks.Ruby_Block.get());
                        pOutput.accept(ModBlocks.Ruby_Ore.get());
                        pOutput.accept(ModBlocks.Sapphire_Block.get());
                        pOutput.accept(ModBlocks.Sapphire_Ore.get());
                        pOutput.accept(ModBlocks.Signalum_Block.get());
                        pOutput.accept(ModBlocks.Silver_Block.get());
                        pOutput.accept(ModBlocks.Silver_Ore.get());
                        pOutput.accept(ModBlocks.Steel_Block.get());
                        pOutput.accept(ModBlocks.Tin_Block.get());
                        pOutput.accept(ModBlocks.Tin_Ore.get());
                        pOutput.accept(ModBlocks.Uranium_Block.get());
                        pOutput.accept(ModBlocks.Uranium_Ore.get());
                        pOutput.accept(ModBlocks.Zinc_Block.get());
                        pOutput.accept(ModBlocks.Zinc_Ore.get());
                    }))
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
