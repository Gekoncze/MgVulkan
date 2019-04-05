package cz.mg.vulkan.vk;

public class VkShaderStageFlagBits extends VkFlagBits {
    public static final int VK_SHADER_STAGE_VERTEX_BIT = 0x00000001;
    public static final int VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = 0x00000002;
    public static final int VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 0x00000004;
    public static final int VK_SHADER_STAGE_GEOMETRY_BIT = 0x00000008;
    public static final int VK_SHADER_STAGE_FRAGMENT_BIT = 0x00000010;
    public static final int VK_SHADER_STAGE_COMPUTE_BIT = 0x00000020;
    public static final int VK_SHADER_STAGE_ALL_GRAPHICS = 0x0000001F;
    public static final int VK_SHADER_STAGE_ALL = 0x7FFFFFFF;

    public VkShaderStageFlagBits() {
    }

    public VkShaderStageFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderStageFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkShaderStageFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SHADER_STAGE_VERTEX_BIT) s += "VK_SHADER_STAGE_VERTEX_BIT";
        if(getValue() == VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT) s += "VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT";
        if(getValue() == VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT) s += "VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT";
        if(getValue() == VK_SHADER_STAGE_GEOMETRY_BIT) s += "VK_SHADER_STAGE_GEOMETRY_BIT";
        if(getValue() == VK_SHADER_STAGE_FRAGMENT_BIT) s += "VK_SHADER_STAGE_FRAGMENT_BIT";
        if(getValue() == VK_SHADER_STAGE_COMPUTE_BIT) s += "VK_SHADER_STAGE_COMPUTE_BIT";
        if(getValue() == VK_SHADER_STAGE_ALL_GRAPHICS) s += "VK_SHADER_STAGE_ALL_GRAPHICS";
        if(getValue() == VK_SHADER_STAGE_ALL) s += "VK_SHADER_STAGE_ALL";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
