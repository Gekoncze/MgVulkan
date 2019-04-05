package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanShaderStageFlagBits extends VulkanFlagBits {
    public static final int VERTEX = VkShaderStageFlagBits.VK_SHADER_STAGE_VERTEX_BIT;
    public static final int TESSELLATION_CONTROL = VkShaderStageFlagBits.VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT;
    public static final int TESSELLATION_EVALUATION = VkShaderStageFlagBits.VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT;
    public static final int GEOMETRY = VkShaderStageFlagBits.VK_SHADER_STAGE_GEOMETRY_BIT;
    public static final int FRAGMENT = VkShaderStageFlagBits.VK_SHADER_STAGE_FRAGMENT_BIT;
    public static final int COMPUTE = VkShaderStageFlagBits.VK_SHADER_STAGE_COMPUTE_BIT;
    public static final int ALL_GRAPHICS = VkShaderStageFlagBits.VK_SHADER_STAGE_ALL_GRAPHICS;
    public static final int ALL = VkShaderStageFlagBits.VK_SHADER_STAGE_ALL;

    public VulkanShaderStageFlagBits(){
        super(new VkShaderStageFlagBits());
    }

    public VulkanShaderStageFlagBits(VkShaderStageFlagBits vk){
        super(vk);
    }

    @Override
    public VkShaderStageFlagBits getVk(){
        return (VkShaderStageFlagBits) super.getVk();
    }

    public VulkanShaderStageFlagBits(int value){
        super(new VkShaderStageFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VERTEX) s += "VERTEX";
        if(getValue() == TESSELLATION_CONTROL) s += "TESSELLATION_CONTROL";
        if(getValue() == TESSELLATION_EVALUATION) s += "TESSELLATION_EVALUATION";
        if(getValue() == GEOMETRY) s += "GEOMETRY";
        if(getValue() == FRAGMENT) s += "FRAGMENT";
        if(getValue() == COMPUTE) s += "COMPUTE";
        if(getValue() == ALL_GRAPHICS) s += "ALL_GRAPHICS";
        if(getValue() == ALL) s += "ALL";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
