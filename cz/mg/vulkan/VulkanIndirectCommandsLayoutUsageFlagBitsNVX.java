package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutUsageFlagBitsNVX.html">khronos documentation</a>
 **/
public class VulkanIndirectCommandsLayoutUsageFlagBitsNVX extends VulkanFlagBits {
    public static final int INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX;
    public static final int INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX;
    public static final int INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX;
    public static final int INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_NVX = VkIndirectCommandsLayoutUsageFlagBitsNVX.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX;

    public VulkanIndirectCommandsLayoutUsageFlagBitsNVX(){
        super(new VkIndirectCommandsLayoutUsageFlagBitsNVX());
    }

    public VulkanIndirectCommandsLayoutUsageFlagBitsNVX(VkIndirectCommandsLayoutUsageFlagBitsNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsLayoutUsageFlagBitsNVX getVk(){
        return (VkIndirectCommandsLayoutUsageFlagBitsNVX) super.getVk();
    }

    public VulkanIndirectCommandsLayoutUsageFlagBitsNVX(int value){
        super(new VkIndirectCommandsLayoutUsageFlagBitsNVX(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_NVX) s += "INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_NVX";
        if(getValue() == INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_NVX) s += "INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_NVX";
        if(getValue() == INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_NVX) s += "INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_NVX";
        if(getValue() == INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_NVX) s += "INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
