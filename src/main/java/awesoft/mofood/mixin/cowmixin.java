package awesoft.mofood.mixin;

import awesoft.mofood.MoFood;
import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.entity.animal.EntityCow;
import net.minecraft.core.item.Item;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import net.minecraft.core.entity.Entity;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = EntityCow.class, remap = false)
public class cowmixin extends EntityAnimal {
	public cowmixin(World world) {
		super(world);
	}

	@Inject(method = "dropFewItems", at = @At("HEAD"))
	protected void dropFewItems(CallbackInfo ci) {
		int steakid = this.remainingFireTicks > 0 ? MoFood.foodsteak.id : MoFood.foodsteakraw.id;
		if (steakid > 0) {
			this.spawnAtLocation(steakid, 1);
		}
	}
}
