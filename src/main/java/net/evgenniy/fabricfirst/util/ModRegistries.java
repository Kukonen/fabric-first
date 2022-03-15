package net.evgenniy.fabricfirst.util;

import net.evgenniy.fabricfirst.FabricFirst;
import net.evgenniy.fabricfirst.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStaff() {
        registerFuel();
    }

    private static void registerFuel() {
        FabricFirst.LOGGER.info("Register Fuels fro " + FabricFirst.MOD_ID);

        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 400);
    }
}
