package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkVertexInputRate;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanVertexInputRate {
    public static final int VERTEX = VkVertexInputRate.VK_VERTEX_INPUT_RATE_VERTEX;
    public static final int INSTANCE = VkVertexInputRate.VK_VERTEX_INPUT_RATE_INSTANCE;

    public final VkVertexInputRate enums;

    public VulkanVertexInputRate() {
        this(0);
    }

    public VulkanVertexInputRate(int value) {
        this(new VkVertexInputRate(value));
    }

    public VulkanVertexInputRate(VkVertexInputRate enums) {
        this.enums = enums;
    }

    public boolean is(int value){
        return this.enums.value == value;
    }

    public void set(int value){
        this.enums.value = value;
    }

    @Override
    public String toString() {
        return ToString.constantToString(enums.value, VkVertexInputRate.class);
    }
}
