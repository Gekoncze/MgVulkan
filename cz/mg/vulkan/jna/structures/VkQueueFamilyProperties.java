package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.flags.VkQueueFlags;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkQueueFamilyProperties {
 *      VkQueueFlags    queueFlags;
 *      uint32_t        queueCount;
 *      uint32_t        timestampValidBits;
 *      VkExtent3D      minImageTransferGranularity;
 *  } VkQueueFamilyProperties;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueueFamilyProperties.html">khronos documentation</a>
 **/
public class VkQueueFamilyProperties extends Structure {
    public VkQueueFlags.ByValue queueFlags;
    public int queueCount;
    public int timestampValidBits;
    public VkExtent3D.ByValue minImageTransferGranularity;

    public VkQueueFamilyProperties() {
    }

    public VkQueueFamilyProperties(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "queueFlags",
                "queueCount",
                "timestampValidBits",
                "minImageTransferGranularity"
        });
    }

    public static class ByReference extends VkQueueFamilyProperties implements Structure.ByReference {}
    public static class ByValue extends VkQueueFamilyProperties implements Structure.ByValue {}
}
