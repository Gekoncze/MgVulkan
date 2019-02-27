package cz.mg.vulkan.jna.enums;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkPhysicalDeviceType
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceType.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceType extends Structure {
    public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;
    public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1;
    public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2;
    public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3;
    public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 4;

    public int value;

    public VkPhysicalDeviceType() {
    }

    public VkPhysicalDeviceType(int value) {
        this.value = value;
    }

    public VkPhysicalDeviceType(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkPhysicalDeviceType implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkPhysicalDeviceType implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}
