package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferUsageFlagBits.html">khronos documentation</a>
 **/
public class VulkanBufferUsageFlagBits extends VulkanFlagBits {
    public static final int TRANSFER_SRC = VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFER_SRC_BIT;
    public static final int TRANSFER_DST = VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFER_DST_BIT;
    public static final int UNIFORM_TEXEL_BUFFER = VkBufferUsageFlagBits.VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT;
    public static final int STORAGE_TEXEL_BUFFER = VkBufferUsageFlagBits.VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT;
    public static final int UNIFORM_BUFFER = VkBufferUsageFlagBits.VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT;
    public static final int STORAGE_BUFFER = VkBufferUsageFlagBits.VK_BUFFER_USAGE_STORAGE_BUFFER_BIT;
    public static final int INDEX_BUFFER = VkBufferUsageFlagBits.VK_BUFFER_USAGE_INDEX_BUFFER_BIT;
    public static final int VERTEX_BUFFER = VkBufferUsageFlagBits.VK_BUFFER_USAGE_VERTEX_BUFFER_BIT;
    public static final int INDIRECT_BUFFER = VkBufferUsageFlagBits.VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT;

    public VulkanBufferUsageFlagBits(){
        super(new VkBufferUsageFlagBits());
    }

    public VulkanBufferUsageFlagBits(VkBufferUsageFlagBits vk){
        super(vk);
    }

    @Override
    public VkBufferUsageFlagBits getVk(){
        return (VkBufferUsageFlagBits) super.getVk();
    }

    public VulkanBufferUsageFlagBits(int value){
        super(new VkBufferUsageFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == TRANSFER_SRC) s += "TRANSFER_SRC";
        if(getValue() == TRANSFER_DST) s += "TRANSFER_DST";
        if(getValue() == UNIFORM_TEXEL_BUFFER) s += "UNIFORM_TEXEL_BUFFER";
        if(getValue() == STORAGE_TEXEL_BUFFER) s += "STORAGE_TEXEL_BUFFER";
        if(getValue() == UNIFORM_BUFFER) s += "UNIFORM_BUFFER";
        if(getValue() == STORAGE_BUFFER) s += "STORAGE_BUFFER";
        if(getValue() == INDEX_BUFFER) s += "INDEX_BUFFER";
        if(getValue() == VERTEX_BUFFER) s += "VERTEX_BUFFER";
        if(getValue() == INDIRECT_BUFFER) s += "INDIRECT_BUFFER";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
