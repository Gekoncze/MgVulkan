package cz.mg.vulkan;

public class VkPipelineCacheHeaderVersion extends VkEnum {
    public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1;

    public VkPipelineCacheHeaderVersion() {
    }

    public VkPipelineCacheHeaderVersion(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCacheHeaderVersion(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineCacheHeaderVersion(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_PIPELINE_CACHE_HEADER_VERSION_ONE) return "VK_PIPELINE_CACHE_HEADER_VERSION_ONE";
        return "UNKNOWN";
    }
}
