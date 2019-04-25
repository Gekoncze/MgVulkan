package cz.mg.vulkan;

public class VkQueryPipelineStatisticFlags extends VkFlags {
    public VkQueryPipelineStatisticFlags() {
    }

    protected VkQueryPipelineStatisticFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkQueryPipelineStatisticFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkQueryPipelineStatisticFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkQueryPipelineStatisticFlags(int value) {
        setValue(value);
    }
}
