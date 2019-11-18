package systems.conduit.main.mixins;

import net.minecraft.DetectedVersion;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = DetectedVersion.class, remap = false)
public abstract class VersionMixin {

    @Shadow @Final private String name;

    /**
     * @author ConduitMC
     * @return Minecraft version and Conduit name
     */
    @Overwrite
    public String getName() {
        return name + "/Conduit";
    }
}
