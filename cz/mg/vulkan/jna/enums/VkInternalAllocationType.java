package cz.mg.vulkan.jna.enums;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkInternalAllocationType
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkInternalAllocationType.html">khronos documentation</a>
 **/
public class VkInternalAllocationType extends Structure {
    public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;

    public int value;

    public VkInternalAllocationType() {
    }

    public VkInternalAllocationType(int value) {
        this.value = value;
    }

    public VkInternalAllocationType(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkInternalAllocationType implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkInternalAllocationType implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}
