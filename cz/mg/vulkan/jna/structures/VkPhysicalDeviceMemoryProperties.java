package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.types.*;
import static cz.mg.vulkan.jna.Vk.*;
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
    public uint32_t memoryTypeCount;
    public VkMemoryType[] memoryTypes = new VkMemoryType[VK_MAX_MEMORY_TYPES];
    public uint32_t memoryHeapCount;
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

    public ByReference byReference(boolean write, boolean read){
        if(write) write();
        ByReference reference = new ByReference(getPointer());
        if(read) reference.read();
        return reference;
    }

    public ByValue byValue(boolean write, boolean read){
        if(write) write();
        ByValue value = new ByValue(getPointer());
        if(read) value.read();
        return value;
    }

    public static class ByReference extends VkPhysicalDeviceMemoryProperties implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public static class ByValue extends VkPhysicalDeviceMemoryProperties implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(Pointer p) {
            super(p);
        }
    }
}
