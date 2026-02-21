package rip.sayori.nbne.mixin;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(targets = "net.minecraft.inventory.ContainerEnchantment$2")
public class ContainerEnchantmentInnerMixin {
    /**
     * @author NotMonika
     * @reason patch
     */
    @Overwrite public boolean isItemValid(ItemStack stack){
        return stack.getItem() == Items.BOOK || stack.getItem() == Items.ENCHANTED_BOOK;
    }
}
