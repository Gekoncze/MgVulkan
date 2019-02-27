package cz.mg.vulkan.jna.flags;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;


/**
 *  typedef VkFlags VkSampleCountFlags
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSampleCountFlags.html">khronos documentation</a>
 **/
public class VkSampleCountFlags extends Structure {
    public static final int VK_SAMPLE_COUNT_1_BIT = 0x00000001;
    public static final int VK_SAMPLE_COUNT_2_BIT = 0x00000002;
    public static final int VK_SAMPLE_COUNT_4_BIT = 0x00000004;
    public static final int VK_SAMPLE_COUNT_8_BIT = 0x00000008;
    public static final int VK_SAMPLE_COUNT_16_BIT = 0x00000010;
    public static final int VK_SAMPLE_COUNT_32_BIT = 0x00000020;
    public static final int VK_SAMPLE_COUNT_64_BIT = 0x00000040;
    public static final int VK_SAMPLE_COUNT_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF;

    public int value;

    public VkSampleCountFlags() {
    }

    public VkSampleCountFlags(int value) {
        this.value = value;
    }

    public VkSampleCountFlags(Pointer p) {
        super(p);
    }

    public static class ByReference extends VkSampleCountFlags implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(int value) {
            super(value);
        }
    }

    public static class ByValue extends VkSampleCountFlags implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(int value) {
            super(value);
        }
    }
}
