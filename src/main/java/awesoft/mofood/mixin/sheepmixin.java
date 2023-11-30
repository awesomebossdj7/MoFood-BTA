package awesoft.mofood.mixin;

import awesoft.mofood.MoFood;
import net.minecraft.core.entity.animal.EntityAnimal;
import net.minecraft.core.entity.animal.EntitySheep;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = EntitySheep.class, remap = false)
public class sheepmixin extends EntityAnimal {


	public sheepmixin(World world) {
		super(world);
	}

	@Inject(method = "dropFewItems", at = @At("HEAD"))
	protected void dropFewItems(CallbackInfo si) {
		int muttonid = this.remainingFireTicks > 0 ? MoFood.foodmutton.id : MoFood.foodmuttonraw.id;
		if (muttonid > 0) {
			this.spawnAtLocation(muttonid, 1);
		}
	}
}
