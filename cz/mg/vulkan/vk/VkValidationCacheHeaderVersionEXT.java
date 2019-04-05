package cz.mg.vulkan.vk;

public class VkValidationCacheHeaderVersionEXT extends VkEnum {
    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = 1;

    public VkValidationCacheHeaderVersionEXT() {
    }

    public VkValidationCacheHeaderVersionEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkValidationCacheHeaderVersionEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkValidationCacheHeaderVersionEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT) return "VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT";
        return "UNKNOWN";
    }
}
