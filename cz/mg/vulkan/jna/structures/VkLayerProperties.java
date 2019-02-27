package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
import static cz.mg.vulkan.jna.VulkanNative.*;


/**
 *  typedef struct VkLayerProperties {
 *      char        layerName[VK_MAX_EXTENSION_NAME_SIZE];
 *      uint32_t    specVersion;
 *      uint32_t    implementationVersion;
 *      char        description[VK_MAX_DESCRIPTION_SIZE];
 *  } VkLayerProperties;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkLayerProperties.html">khronos documentation</a>
 **/
public class VkLayerProperties extends Structure {
    public byte[] layerName = new byte[VK_MAX_EXTENSION_NAME_SIZE];
    public int specVersion;
    public int implementationVersion;
    public byte[] description = new byte[VK_MAX_DESCRIPTION_SIZE];

    public VkLayerProperties() {
    }

    public VkLayerProperties(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
            "layerName",
            "specVersion",
            "implementationVersion",
            "description"
        });
    }

    public static class ByReference extends VkLayerProperties implements Structure.ByReference {}
    public static class ByValue extends VkLayerProperties implements Structure.ByValue {}
}
