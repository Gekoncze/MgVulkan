package cz.mg.vulkan.vk;

public class VkVertexInputRate extends VkEnum {
    public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;
    public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;

    public VkVertexInputRate() {
    }

    public VkVertexInputRate(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkVertexInputRate(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkVertexInputRate(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_VERTEX_INPUT_RATE_VERTEX) return "VK_VERTEX_INPUT_RATE_VERTEX";
        if(getValue() == VK_VERTEX_INPUT_RATE_INSTANCE) return "VK_VERTEX_INPUT_RATE_INSTANCE";
        return "UNKNOWN";
    }
}
