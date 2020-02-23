package systems.conduit.core.events.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.block.SpawnerBlock;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import systems.conduit.api.LivingEntity;
import systems.conduit.core.events.Cancellable;

import java.util.List;

/*
 * @author Innectic
 * @since 10/21/2019
 */
public class EntityEvents {

    /**
     * This event is fired when an adult sheep consumes grass.
     * Implementation: {@link systems.conduit.core.mixins.event.entity.SheepMixin}
     */
    @AllArgsConstructor
    @Getter
    public static class SheepGrowWoolEvent extends Cancellable {
        private Sheep sheep;
    }

    /**
     * This event is fired when a baby sheep eats something and progresses growth.
     * Implementation: {@link systems.conduit.core.mixins.event.entity.SheepMixin#ate()}
     */
    @AllArgsConstructor
    @Getter
    @Setter
    public static class BabySheepEatEvent extends Cancellable {
        private Sheep sheep;
        private int ageUpAmount;
    }

    /**
     * This event is fired when a slime takes enough damage to split into more, smaller slimes.
     * Implementation: {@link systems.conduit.core.mixins.event.entity.SlimeMixin}
     */
    @AllArgsConstructor
    @Getter
    public static class SlimeSplitEvent extends EventType {
        private Slime parent;
        private List<Slime> children;
    }

    @AllArgsConstructor
    @Getter
    public static class EntityBreedEvent extends Cancellable {
        private Animal bred;
        private Animal with;
        private Animal child;
    }

    @AllArgsConstructor
    @Getter
    public static class SpawnerSpawnEvent extends Cancellable {
        private SpawnerBlock spawner;
        private List<Entity> spawned;
    }

    /**
     * This event is fired when any entity in the server has an effect added to it. 
     * Implementation: {@link systems.conduit.core.mixins.api.LivingEntityMixin#onEffectAdded(MobEffectInstance, CallbackInfo)}
     */
    @AllArgsConstructor
    @Getter
    public static class EffectAddedToEntityEvent extends Cancellable {
        private LivingEntity entity;
        private MobEffectInstance effect;
    }

    /**
     * This event is fired when any entity in the server has an effect removed from it.
     * Implementation: {@link systems.conduit.core.mixins.api.LivingEntityMixin#onEffectRemoved(MobEffectInstance, CallbackInfo)}
     */
    @AllArgsConstructor
    @Getter
    public static class EffectRemovedFromEntityEvent extends Cancellable {
        private LivingEntity entity;
        private MobEffectInstance effect;
    }
}