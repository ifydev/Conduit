package systems.conduit.core.mixins.event.entityimport

import net.minecraft.world.level.Level

net.minecraft.world.item.enchantment.Enchantmentimport net.minecraft.nbt.CompoundTagimport net.minecraft.world.item.ItemStackimport java.lang.UnsupportedOperationExceptionimport net.minecraft.world.entity.EntityTypeimport net.minecraft.world.entity.MobSpawnTypeimport net.minecraft.core.BlockPosimport net.minecraft.world.SimpleContainerimport net.minecraft.world.inventory.MenuTypeimport net.minecraft.world.inventory.ChestMenuimport systems.conduit.api.inventory.ChestContainerimport net.minecraft.world.entity.MobCategoryimport net.minecraft.world.level.biome.Biome.SpawnerDataimport net.minecraft.world.level.biome.Biome.Precipitationimport net.minecraft.world.level.LevelReaderimport net.minecraft.world.level.biome.Biome.BiomeCategoryimport net.minecraft.world.level.block.state.BlockStateimport net.minecraft.world.level.chunk.LevelChunkimport net.minecraft.world.level.LightLayerimport net.minecraft.world.level.material.FluidStateimport net.minecraft.sounds.SoundEventimport net.minecraft.sounds.SoundSourceimport net.minecraft.world.level.block.entity.BlockEntityimport net.minecraft.world.level.LevelTypeimport net.minecraft.world.level.chunk.ChunkSourceimport net.minecraft.world.level.storage.LevelDataimport net.minecraft.world.level.GameRulesimport net.minecraft.world.DifficultyInstanceimport net.minecraft.world.level.border.WorldBorderimport java.util.UUIDimport net.minecraft.world.entity.Poseimport net.minecraft.world.phys.Vec3import net.minecraft.world.scores.Teamimport net.minecraft.world.scores.Scoreboardimport net.minecraft.world.entity.EquipmentSlotimport net.minecraft.world.food.FoodDataimport net.minecraft.world.effect.MobEffectInstanceimport net.minecraft.world.effect.MobEffectimport net.minecraft.world.entity.MobTypeimport net.minecraft.world.InteractionHandimport net.minecraft.world.level.material.Materialimport net.minecraft.world.level.dimension.DimensionTypeimport net.minecraft.server.level.ServerLevelimport net.minecraft.world.level.storage.LevelStorageSourceimport net.minecraft.util.profiling.GameProfilerimport net.minecraft.commands.CommandSourceStackimport net.minecraft.server.bossevents.CustomBossEventsimport net.minecraft.world.level.ChunkPosimport net.minecraft.world.entity.animal.Sheepimport net.minecraft.world.entity.monster.Slimeimport net.minecraft.world.entity.animal.Animalimport net.minecraft.world.level.block.SpawnerBlockimport systems.conduit.core.events.types.PlayerEvents.LeaveTypeimport systems.conduit.core.events.types.PlayerEvents.DamageMetaimport net.minecraft.world.entity.projectile.AbstractArrowimport net.minecraft.world.level.GameTypeimport java.lang.NoSuchMethodExceptionimport java.lang.IllegalAccessExceptionimport java.lang.InstantiationExceptionimport java.lang.reflect.InvocationTargetExceptionimport systems.conduit.core.events.EventManagerimport systems.conduit.core.events.EventTypeRegistryimport java.util.HashMapimport systems.conduit.core.events.types.WorldEvents.BlockInteractEventimport systems.conduit.core.events.types.WorldEvents.BlockBreakEventimport systems.conduit.core.events.types.WorldEvents.BlockPlaceEventimport systems.conduit.core.events.types.WorldEvents.WorldSaveEventimport systems.conduit.core.events.types.PlayerEvents.PlayerJoinEventimport systems.conduit.core.events.types.PlayerEvents.PlayerLeaveEventimport systems.conduit.core.events.types.PlayerEvents.PlayerDamageByEntityEventimport systems.conduit.core.events.types.PlayerEvents.PlayerDamageByPlayerEventimport systems.conduit.core.events.types.PlayerEvents.PlayerDamageByArrowEventimport systems.conduit.core.events.types.PlayerEvents.PlayerGameModeChangeEventimport systems.conduit.core.events.types.PlayerEvents.PlayerChatEventimport systems.conduit.core.events.types.PlayerEvents.PlayerCommandEventimport systems.conduit.core.events.types.PlayerEvents.ConsumeEventimport systems.conduit.core.events.types.EntityEvents.SheepGrowWoolEventimport systems.conduit.core.events.types.EntityEvents.BabySheepEatEventimport systems.conduit.core.events.types.EntityEvents.SlimeSplitEventimport systems.conduit.core.events.types.EntityEvents.EffectAddedToEntityEventimport systems.conduit.core.events.types.EntityEvents.EffectRemovedFromEntityEventimport systems.conduit.core.events.types.ServerEvents.ServerInitializedEventimport systems.conduit.core.events.types.ServerEvents.ServerStartingEventimport systems.conduit.core.events.types.ServerEvents.ServerShuttingDownEventimport systems.conduit.core.events.types.ServerEvents.PluginReloadEventimport org.spongepowered.asm.mixin.Mixinimport org.spongepowered.asm.mixin.Shadowimport java.util.stream.Collectorsimport net.minecraft.world.inventory.AbstractContainerMenuimport net.minecraft.world.inventory.InventoryMenuimport com.mojang.authlib.GameProfileimport net.minecraft.network.chat.TranslatableComponentimport net.minecraft.world.entity.ai.attributes.AttributeInstanceimport net.minecraft.world.entity.monster.SharedMonsterAttributesimport org.spongepowered.asm.mixin.injection.Injectimport org.spongepowered.asm.mixin.injection.Atimport org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnableimport org.spongepowered.asm.mixin.injection.callback.CallbackInfoimport net.minecraft.server.network.ServerGamePacketListenerImplimport net.minecraft.network.protocol.game.ClientboundOpenScreenPacketimport net.minecraft.network.protocol.game.ClientboundContainerSetContentPacketimport org.spongepowered.asm.mixin.injection.ModifyVariableimport net.minecraft.world.entity.ai.goal.BreedGoalimport systems.conduit.core.events.types.EntityEvents.EntityBreedEventimport systems.conduit.core.Conduitimport org.spongepowered.asm.mixin.Overwriteimport net.minecraft.world.entity.Mobimport net.minecraft.server.players.PlayerListimport net.minecraft.world.damagesource.DamageSourceimport net.minecraft.world.damagesource.EntityDamageSourceimport net.minecraft.server.level.ServerPlayerGameModeimport net.minecraft.world.item.UseOnContextimport net.minecraft.world.InteractionResultimport net.minecraft.server.dedicated.DedicatedServerimport com.mojang.datafixers.DataFixerimport com.mojang.authlib.yggdrasil.YggdrasilAuthenticationServiceimport com.mojang.authlib.minecraft.MinecraftSessionServiceimport com.mojang.authlib.GameProfileRepositoryimport net.minecraft.server.players.GameProfileCacheimport net.minecraft.server.level.progress.ChunkProgressListenerFactoryimport java.lang.Runnableimport net.minecraft.DetectedVersionimport net.minecraft.commands.CommandSourceimport net.minecraft.ChatFormattingimport org.spongepowered.asm.mixin.injection.ModifyArgimport systems.conduit.core.plugin.config.ConfigurationLoaderimport systems.conduit.core.plugin.config.loader.JsonLoaderimport java.io.FileReaderimport java.io.IOExceptionimport com.google.gson.Gsonimport com.google.gson.annotations.SerializedNameimport java.lang.NullPointerExceptionimport systems.conduit.core.plugin.config.defaults.DefaultConfigurationHandlerimport java.nio.file.Pathsimport com.google.gson.JsonIOExceptionimport systems.conduit.core.plugin.config.ConfigurationTypesimport systems.conduit.core.plugin.annotation .DependencyTypeimport kotlin.reflect.KClassimport systems.conduit.core.plugin.config.NoConfigimport systems.conduit.core.plugin.annotation .PluginMetaimport systems.conduit.core.plugin.PluginStateimport java.util.concurrent.ConcurrentHashMapimport systems.conduit.core.datastore.DatastoreControllerimport java.lang.SafeVarargsimport java.lang.ClassCastExceptionimport systems.conduit.core.commands.BaseCommandimport java.util.concurrent.ConcurrentLinkedQueueimport java.util.concurrent.atomic.AtomicReferenceimport java.net.URLClassLoaderimport java.util.jar.JarFileimport org.reflections.Reflectionsimport kotlin.jvm.Throwsimport java.lang.ClassNotFoundExceptionimport java.security.CodeSignerimport java.security.CodeSourceimport org.jline.terminal.TerminalBuilderimport org.jline.reader.LineReaderBuilderimport org.jline.reader.EndOfFileExceptionimport net.minecraft.DefaultUncaughtExceptionHandlerimport org.apache.logging.log4j.message.StringFormattedMessageimport systems.conduit.core.console.ConsoleColorUtilimport com.mojang.brigadier.builder.LiteralArgumentBuilderimport systems.conduit.core.commands.PluginsCommandimport systems.conduit.core.commands.VersionCommandimport com.mojang.brigadier.context.CommandContextimport java.util.function.BinaryOperatorimport com.mojang.brigadier.arguments.StringArgumentTypeimport net.minecraft.SharedConstantsimport net.minecraft.resources.ResourceLocationimport net.minecraft.world.level.LevelSettingsimport net.minecraft.server.level.progress.ChunkProgressListenerimport net.minecraft.world.level.chunk.ChunkStatusimport net.minecraft.server.bossevents.CustomBossEventimport systems.conduit.core.datastore.DatastoreHandlerimport com.zaxxer.hikari.HikariConfigimport com.zaxxer.hikari.HikariDataSourceimport java.sql.PreparedStatementimport java.sql.SQLExceptionimport systems.conduit.core.datastore.Storableimport java.lang.NumberFormatExceptionimport java.sql.ResultSetimport systems.conduit.core.datastore.ExpirableBackendimport redis.clients.jedis.Jedisimport systems.conduit.core.datastore.backend.MySQLBackendimport systems.conduit.core.datastore.backend.MemoryBackendimport java.util.function.IntPredicateimport systems.conduit.core.datastore.DatastoreBackendimport systems.conduit.core.commands.CommandManagerimport systems.conduit.core.managers.PlayerManagerimport systems.conduit.core.managers.LevelManagerimport systems.conduit.core.managers.BossBarManagerimport systems.conduit.core.ConduitConfigurationimport java.io.PrintStreamimport java.nio.file.StandardCopyOptionimport systems.conduit.core.ConduitConfiguration.MySQLConfigurationimport systems.conduit.core.ConduitConfiguration.RedisConfigurationimport systems.conduit.core.ConduitConfiguration.DatastoreConfiguration
/*
 * @author Innectic
 * @since 10/21/2019
 */
@Mixin(value = [Sheep::class], remap = false)
abstract class SheepMixin protected constructor(entityType: EntityType<out Animal?>?, level: Level?): Animal(entityType, level) {
    /**
     * Sheep eat and sheared event registering.
     *
     * @author ConduitMC
     */
    @Overwrite
    override fun ate() {
        val sheep: Sheep = this as Sheep
        if (this.isBaby()) {
            // Submit the baby event
            val event = BabySheepEatEvent(sheep, 60)
            Conduit.getEventManager().dispatchEvent(event)
            // If this was cancelled, then we'll just set the age up to 0.
            val ageUp = if (event.isCanceled()) 0 else event.getAgeUpAmount()
            // Now that the event has been dispatched, we can apply the age up amount.
            sheep.ageUp(ageUp)
            return
        }
        // Since this is not a baby, then this is a regular sheep eat grass event.
        val event = SheepGrowWoolEvent(sheep)
        Conduit.getEventManager().dispatchEvent(event)

        // If this event was cancelled, then we will leave the sheep sheared.
        sheep.setSheared(event.isCanceled())
    }
}