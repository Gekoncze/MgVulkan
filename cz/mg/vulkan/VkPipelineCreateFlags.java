package cz.mg.vulkan;

public class VkPipelineCreateFlags extends VkFlags {
    public VkPipelineCreateFlags() {
    }

    public VkPipelineCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineCreateFlags(int value) {
        setValue(value);
    }
}
