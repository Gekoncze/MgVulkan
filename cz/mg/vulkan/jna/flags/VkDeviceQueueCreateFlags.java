package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkDeviceQueueCreateFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceQueueCreateFlags.html">khronos documentation</a>
 **/
public class VkDeviceQueueCreateFlags extends Structure {
    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 0x00000001;

    public int value;

    public VkDeviceQueueCreateFlags() {
    }

    public VkDeviceQueueCreateFlags(int value) {
        this.value = value;
    }

    public VkDeviceQueueCreateFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkDeviceQueueCreateFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkDeviceQueueCreateFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}
