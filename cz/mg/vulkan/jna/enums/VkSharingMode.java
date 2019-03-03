package cz.mg.vulkan.jna.enums;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkSharingMode
 *  @see <a href = "https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSharingMode.html">khronos documentation</a>
 **/
public class VkSharingMode extends Structure {
    public static final int VK_SHARING_MODE_EXCLUSIVE = 0;
    public static final int VK_SHARING_MODE_CONCURRENT = 1;

    public int value;

    public VkSharingMode() {
    }

    public VkSharingMode(int value) {
        this.value = value;
    }

    public VkSharingMode(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkSharingMode implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkSharingMode implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}
