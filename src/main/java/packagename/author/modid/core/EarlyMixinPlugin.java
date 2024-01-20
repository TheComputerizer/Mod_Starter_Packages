package packagename.author.modid.core;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.apache.logging.log4j.LogManager;
import zone.rong.mixinbooter.IEarlyMixinLoader;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class EarlyMixinPlugin implements IFMLLoadingPlugin, IEarlyMixinLoader {

    static {
        LogManager.getLogger(EarlyMixinPlugin.class.getName()).info("Initializing early mixin plugin");
    }

    @Override
    public List<String> getMixinConfigs() {
        return Collections.singletonList("modid.mixin.json");
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public @Nullable String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {}

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
