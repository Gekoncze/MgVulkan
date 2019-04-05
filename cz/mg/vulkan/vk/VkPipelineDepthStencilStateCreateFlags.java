package cz.mg.vulkan.vk;

public class VkPipelineDepthStencilStateCreateFlags extends VkFlags {
    public VkPipelineDepthStencilStateCreateFlags() {
    }

    public VkPipelineDepthStencilStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineDepthStencilStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineDepthStencilStateCreateFlags(int value) {
        setValue(value);
    }
}
