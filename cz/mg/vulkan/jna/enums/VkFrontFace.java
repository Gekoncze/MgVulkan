package cz.mg.vulkan.jna.enums;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef enum VkFrontFace
 *  @see <a href = "https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFrontFace.html">khronos documentation</a>
 **/
public class VkFrontFace extends Structure {
    public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;
    public static final int VK_FRONT_FACE_CLOCKWISE = 1;

    public int value;

    public VkFrontFace() {
    }

    public VkFrontFace(int value) {
        this.value = value;
    }

    public VkFrontFace(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkFrontFace implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkFrontFace implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}
