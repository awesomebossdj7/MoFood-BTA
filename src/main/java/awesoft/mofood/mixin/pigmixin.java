package awesoft.mofood.mixin;

import awesoft.mofood.MoFood;
import net.minecraft.client.Minecraft;
import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.entity.animal.EntityPig;
import net.minecraft.core.item.Item;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EntityPig.class, remap = false)
public class pigmixin extends EntityAnimal {
	public pigmixin(World world) {
		super(world);
	}

	@Inject(method = "getDropItemId", at = @At("HEAD"), cancellable = true)
	protected int getDropItemId(CallbackInfoReturnable<Integer> cir) {
		cir.setReturnValue(this.remainingFireTicks > 0 ? MoFood.foodporkchop.id : MoFood.foodporkchopraw.id);
		return this.remainingFireTicks > 0 ? MoFood.foodporkchop.id : MoFood.foodporkchopraw.id;
	}
}
