package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkShaderStageFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanShaderStageFlags {
    public static final int VERTEX = VkShaderStageFlags.VK_SHADER_STAGE_VERTEX_BIT;
    public static final int TESSELLATION_CONTROL = VkShaderStageFlags.VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT;
    public static final int TESSELLATION_EVALUATION = VkShaderStageFlags.VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT;
    public static final int GEOMETRY = VkShaderStageFlags.VK_SHADER_STAGE_GEOMETRY_BIT;
    public static final int FRAGMENT = VkShaderStageFlags.VK_SHADER_STAGE_FRAGMENT_BIT;
    public static final int COMPUTE = VkShaderStageFlags.VK_SHADER_STAGE_COMPUTE_BIT;
    public static final int ALL_GRAPHICS = VkShaderStageFlags.VK_SHADER_STAGE_ALL_GRAPHICS;
    public static final int ALL = VkShaderStageFlags.VK_SHADER_STAGE_ALL;

    public final VkShaderStageFlags flags;

    public VulkanShaderStageFlags(){
        this(0);
    }

    public VulkanShaderStageFlags(int flag){
        this(new VkShaderStageFlags(flag));
    }

    public VulkanShaderStageFlags(VkShaderStageFlags flags) {
        this.flags = flags;
    }

    public boolean isSet(int flag){
        return (flags.value & flag) != 0;
    }

    public void set(int flag){
        flags.value |= flag;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkShaderStageFlags.class);
    }
}
