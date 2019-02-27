package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.types.uint32_t;
import java.util.Arrays;
import java.util.List;
import static cz.mg.vulkan.jna.VulkanNative.*;


/**
 *  typedef struct VkExtensionProperties {
 *      char        extensionName[VK_MAX_EXTENSION_NAME_SIZE];
 *      uint32_t    specVersion;
 *  } VkExtensionProperties;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExtensionProperties.html">khronos documentation</a>
 **/
public class VkExtensionProperties extends Structure {
    public byte[] extensionName = new byte[VK_MAX_EXTENSION_NAME_SIZE];
    public uint32_t specVersion;

    public VkExtensionProperties() {
    }

    public VkExtensionProperties(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "extensionName",
                "specVersion"
        });
    }

    public static class ByReference extends VkExtensionProperties implements Structure.ByReference {}
    public static class ByValue extends VkExtensionProperties implements Structure.ByValue {}
}
