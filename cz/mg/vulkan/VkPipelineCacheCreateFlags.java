package cz.mg.vulkan;

public class VkPipelineCacheCreateFlags extends VkFlags {
    public VkPipelineCacheCreateFlags() {
    }

    public VkPipelineCacheCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCacheCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineCacheCreateFlags(int value) {
        setValue(value);
    }
}
