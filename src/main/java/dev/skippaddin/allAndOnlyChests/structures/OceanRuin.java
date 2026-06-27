package dev.skippaddin.allAndOnlyChests.structures;

import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class OceanRuin extends Structure {

    private final HashMap<Material, Boolean> loot = new HashMap<>() {{
        put(Material.COAL, false);
        put(Material.WHEAT, false);
        put(Material.GOLD_NUGGET, false);
        put(Material.ROTTEN_FLESH, false);
        put(Material.FILLED_MAP, false);
        put(Material.STONE_AXE, false);
        put(Material.STONE_SPEAR, false);
        put(Material.ENCHANTED_BOOK, false);
        put(Material.EMERALD, false);
        put(Material.COPPER_NAUTILUS_ARMOR, false);
        put(Material.IRON_NAUTILUS_ARMOR, false);
        put(Material.LEATHER_CHESTPLATE, false);
        put(Material.GOLDEN_APPLE, false);
        put(Material.GOLDEN_HELMET, false);
        put(Material.GOLDEN_NAUTILUS_ARMOR, false);
        put(Material.DIAMOND_NAUTILUS_ARMOR, false);
    }};

    private final HashMap<Material, Boolean> enchantedLoot = new HashMap<>() {{
        put(Material.FISHING_ROD, false);
    }};


    public static int getItemCount() {
        return 17;
    }

    @Override
    public String getName() {
        return "underwater_ruin";
    }

    @Override
    public @NotNull HashMap<Material, Boolean> getLoot() {
        return loot;
    }

    public HashMap<Material, Boolean> getEnchantedLoot() {
        return enchantedLoot;
    }
}
