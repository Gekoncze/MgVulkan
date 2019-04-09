package cz.mg.vulkan;

public class VkPipelineViewportStateCreateFlags extends VkFlags {
    public VkPipelineViewportStateCreateFlags() {
    }

    public VkPipelineViewportStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineViewportStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineViewportStateCreateFlags(int value) {
        setValue(value);
    }
}
