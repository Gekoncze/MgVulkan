package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanVertexInputRate extends VulkanEnum {
    public static final int VERTEX = VkVertexInputRate.VK_VERTEX_INPUT_RATE_VERTEX;
    public static final int INSTANCE = VkVertexInputRate.VK_VERTEX_INPUT_RATE_INSTANCE;

    public VulkanVertexInputRate(){
        super(new VkVertexInputRate());
    }

    public VulkanVertexInputRate(VkVertexInputRate vk){
        super(vk);
    }

    @Override
    public VkVertexInputRate getVk(){
        return (VkVertexInputRate) super.getVk();
    }

    public VulkanVertexInputRate(int value){
        super(new VkVertexInputRate(value));
    }

    @Override
    public String toString() {
        if(getValue() == VERTEX) return "VERTEX";
        if(getValue() == INSTANCE) return "INSTANCE";
        return "UNKNOWN";
    }
}
