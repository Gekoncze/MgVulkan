package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsTokenTypeNVX.html">khronos documentation</a>
 **/
public class VulkanIndirectCommandsTokenTypeNVX extends VulkanEnum {
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX;
    public static final int INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX = VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX;

    public VulkanIndirectCommandsTokenTypeNVX(){
        super(new VkIndirectCommandsTokenTypeNVX());
    }

    public VulkanIndirectCommandsTokenTypeNVX(VkIndirectCommandsTokenTypeNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsTokenTypeNVX getVk(){
        return (VkIndirectCommandsTokenTypeNVX) super.getVk();
    }

    public VulkanIndirectCommandsTokenTypeNVX(int value){
        super(new VkIndirectCommandsTokenTypeNVX(value));
    }

    @Override
    public String toString() {
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX";
        if(getValue() == INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX) return "INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX";
        return "UNKNOWN";
    }
}
