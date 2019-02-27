package cz.mg.vulkan.jna.enums;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkSystemAllocationScope
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSystemAllocationScope.html">khronos documentation</a>
 **/
public class VkSystemAllocationScope extends Structure {
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;

    public int value;

    public VkSystemAllocationScope() {
    }

    public VkSystemAllocationScope(int value) {
        this.value = value;
    }

    public VkSystemAllocationScope(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkSystemAllocationScope implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkSystemAllocationScope implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}
