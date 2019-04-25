package cz.mg.vulkan;

public class VkPipelineCacheCreateFlags extends VkFlags {
    public VkPipelineCacheCreateFlags() {
    }

    protected VkPipelineCacheCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineCacheCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineCacheCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineCacheCreateFlags(int value) {
        setValue(value);
    }
}
