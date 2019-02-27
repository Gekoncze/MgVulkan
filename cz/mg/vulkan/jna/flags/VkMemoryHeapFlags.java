package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkMemoryHeapFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryHeapFlags.html">khronos documentation</a>
 **/
public class VkMemoryHeapFlags extends Structure {
    public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x00000001;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX = 0x00000002;

    public int value;

    public VkMemoryHeapFlags() {
    }

    public VkMemoryHeapFlags(int value) {
        this.value = value;
    }

    public VkMemoryHeapFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkMemoryHeapFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkMemoryHeapFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}
