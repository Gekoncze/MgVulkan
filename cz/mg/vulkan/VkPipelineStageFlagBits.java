package cz.mg.vulkan;

public class VkPipelineStageFlagBits extends VkFlagBits {
    public static final int VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = 0x00000001;
    public static final int VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = 0x00000002;
    public static final int VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = 0x00000004;
    public static final int VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = 0x00000008;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = 0x00000010;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 0x00000020;
    public static final int VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = 0x00000040;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = 0x00000080;
    public static final int VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = 0x00000100;
    public static final int VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = 0x00000200;
    public static final int VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = 0x00000400;
    public static final int VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = 0x00000800;
    public static final int VK_PIPELINE_STAGE_TRANSFER_BIT = 0x00001000;
    public static final int VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = 0x00002000;
    public static final int VK_PIPELINE_STAGE_HOST_BIT = 0x00004000;
    public static final int VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = 0x00008000;
    public static final int VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = 0x00010000;
    public static final int VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX = 0x00020000;

    public VkPipelineStageFlagBits() {
    }

    public VkPipelineStageFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineStageFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineStageFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT) s += "VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT";
        if(getValue() == VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT) s += "VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT";
        if(getValue() == VK_PIPELINE_STAGE_VERTEX_INPUT_BIT) s += "VK_PIPELINE_STAGE_VERTEX_INPUT_BIT";
        if(getValue() == VK_PIPELINE_STAGE_VERTEX_SHADER_BIT) s += "VK_PIPELINE_STAGE_VERTEX_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT) s += "VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT) s += "VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT) s += "VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT) s += "VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT) s += "VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT";
        if(getValue() == VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT) s += "VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT";
        if(getValue() == VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT) s += "VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT";
        if(getValue() == VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT) s += "VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_TRANSFER_BIT) s += "VK_PIPELINE_STAGE_TRANSFER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT) s += "VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT";
        if(getValue() == VK_PIPELINE_STAGE_HOST_BIT) s += "VK_PIPELINE_STAGE_HOST_BIT";
        if(getValue() == VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT) s += "VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT";
        if(getValue() == VK_PIPELINE_STAGE_ALL_COMMANDS_BIT) s += "VK_PIPELINE_STAGE_ALL_COMMANDS_BIT";
        if(getValue() == VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX) s += "VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
