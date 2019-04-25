package cz.mg.vulkan;

public class VkPipelineDepthStencilStateCreateFlags extends VkFlags {
    public VkPipelineDepthStencilStateCreateFlags() {
    }

    protected VkPipelineDepthStencilStateCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineDepthStencilStateCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineDepthStencilStateCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkPipelineDepthStencilStateCreateFlags(int value) {
        setValue(value);
    }
}
