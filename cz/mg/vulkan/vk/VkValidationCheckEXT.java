package cz.mg.vulkan.vk;

public class VkValidationCheckEXT extends VkEnum {
    public static final int VK_VALIDATION_CHECK_ALL_EXT = 0;
    public static final int VK_VALIDATION_CHECK_SHADERS_EXT = 1;

    public VkValidationCheckEXT() {
    }

    public VkValidationCheckEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkValidationCheckEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkValidationCheckEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_VALIDATION_CHECK_ALL_EXT) return "VK_VALIDATION_CHECK_ALL_EXT";
        if(getValue() == VK_VALIDATION_CHECK_SHADERS_EXT) return "VK_VALIDATION_CHECK_SHADERS_EXT";
        return "UNKNOWN";
    }
}
