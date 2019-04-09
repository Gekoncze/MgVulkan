package cz.mg.vulkan;

public class VkQueryPipelineStatisticFlags extends VkFlags {
    public VkQueryPipelineStatisticFlags() {
    }

    public VkQueryPipelineStatisticFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryPipelineStatisticFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueryPipelineStatisticFlags(int value) {
        setValue(value);
    }
}
