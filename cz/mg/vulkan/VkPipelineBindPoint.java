package cz.mg.vulkan;

public class VkPipelineBindPoint extends VkEnum {
    public static final int VK_PIPELINE_BIND_POINT_GRAPHICS = 0;
    public static final int VK_PIPELINE_BIND_POINT_COMPUTE = 1;

    public VkPipelineBindPoint() {
    }

    public VkPipelineBindPoint(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineBindPoint(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineBindPoint(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_PIPELINE_BIND_POINT_GRAPHICS) return "VK_PIPELINE_BIND_POINT_GRAPHICS";
        if(getValue() == VK_PIPELINE_BIND_POINT_COMPUTE) return "VK_PIPELINE_BIND_POINT_COMPUTE";
        return "UNKNOWN";
    }
}
