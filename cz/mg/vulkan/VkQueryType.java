package cz.mg.vulkan;

public class VkQueryType extends VkEnum {
    public static final int VK_QUERY_TYPE_OCCLUSION = 0;
    public static final int VK_QUERY_TYPE_PIPELINE_STATISTICS = 1;
    public static final int VK_QUERY_TYPE_TIMESTAMP = 2;

    public VkQueryType() {
    }

    public VkQueryType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueryType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_QUERY_TYPE_OCCLUSION) return "VK_QUERY_TYPE_OCCLUSION";
        if(getValue() == VK_QUERY_TYPE_PIPELINE_STATISTICS) return "VK_QUERY_TYPE_PIPELINE_STATISTICS";
        if(getValue() == VK_QUERY_TYPE_TIMESTAMP) return "VK_QUERY_TYPE_TIMESTAMP";
        return "UNKNOWN";
    }
}
