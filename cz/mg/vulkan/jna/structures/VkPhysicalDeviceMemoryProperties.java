package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import static cz.mg.vulkan.jna.VulkanNative.*;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkPhysicalDeviceMemoryProperties {
 *      uint32_t        memoryTypeCount;
 *      VkMemoryType    memoryTypes[VK_MAX_MEMORY_TYPES];
 *      uint32_t        memoryHeapCount;
 *      VkMemoryHeap    memoryHeaps[VK_MAX_MEMORY_HEAPS];
 *  } VkPhysicalDeviceMemoryProperties;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceMemoryProperties.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceMemoryProperties extends Structure {
    public int memoryTypeCount;
    public VkMemoryType[] memoryTypes = new VkMemoryType[VK_MAX_MEMORY_TYPES];
    public int memoryHeapCount;
    public VkMemoryHeap[] memoryHeaps = new VkMemoryHeap[VK_MAX_MEMORY_HEAPS];

    public VkPhysicalDeviceMemoryProperties() {
    }

    public VkPhysicalDeviceMemoryProperties(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "memoryTypeCount",
                "memoryTypes",
                "memoryHeapCount",
                "memoryHeaps"
        });
    }

    public static class ByReference extends VkPhysicalDeviceMemoryProperties implements Structure.ByReference {}
    public static class ByValue extends VkPhysicalDeviceMemoryProperties implements Structure.ByValue {}
}
