package cz.mg.vulkan;

public class VkPipelineDynamicStateCreateFlags extends VkFlags {
    public VkPipelineDynamicStateCreateFlags() {
    }

    public VkPipelineDynamicStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineDynamicStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPipelineDynamicStateCreateFlags(int value) {
        setValue(value);
    }
}
