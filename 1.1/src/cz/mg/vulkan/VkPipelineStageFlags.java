package cz.mg.vulkan;

public class VkPipelineStageFlags extends VkFlags {
    public VkPipelineStageFlags() {
    }

    public VkPipelineStageFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineStageFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPipelineStageFlags(int value) {
        setValue(value);
    }
}
