package io.github.mooy1.infinityexpansion.items.gear;

import javax.annotation.Nonnull;

import io.github.thebusybiscuit.slimefun4.core.attributes.*;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;

import static io.github.mooy1.infinityexpansion.utils.Util.noCraftBarrier;

/**
 * armor
 *
 * @author Mooy1
 */
public final class InfinityArmor extends SlimefunArmorPiece implements ProtectiveArmor, Soulbound, NotPlaceable {

    private static final NamespacedKey KEY = InfinityExpansion.createKey("infinity_armor");

    public InfinityArmor(SlimefunItemStack item, PotionEffect[] effects, ItemStack[] recipe) {
        super(Groups.INFINITY_CHEAT, item, InfinityWorkbench.TYPE, new ItemStack[]{
                noCraftBarrier(), null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null
        }, effects);
    }

    @Nonnull
    @Override
    public ProtectionType[] getProtectionTypes() {
        return new ProtectionType[] {
                ProtectionType.BEES, ProtectionType.RADIATION, ProtectionType.FLYING_INTO_WALL
        };
    }

    @Override
    public boolean isFullSetRequired() {
        return false;
    }

    @Nonnull
    @Override
    public NamespacedKey getArmorSetId() {
        return KEY;
    }

}
