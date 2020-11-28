package systems.conduit.main.mixins.event;

import org.spongepowered.asm.mixin.Mixin;
import systems.conduit.main.api.BaseSpawner;

/**
 * @author Innectic
 * @since 1/4/2020
 */
@Mixin(value = net.minecraft.world.level.BaseSpawner.class, remap = false)
public abstract class BaseSpawnerMixin implements BaseSpawner {
    // TODO
}
