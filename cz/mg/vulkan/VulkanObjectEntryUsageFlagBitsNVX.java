package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectEntryUsageFlagBitsNVX.html">khronos documentation</a>
 **/
public class VulkanObjectEntryUsageFlagBitsNVX extends VulkanFlagBits {
    public static final int OBJECT_ENTRY_USAGE_GRAPHICS_NVX = VkObjectEntryUsageFlagBitsNVX.VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX;
    public static final int OBJECT_ENTRY_USAGE_COMPUTE_NVX = VkObjectEntryUsageFlagBitsNVX.VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX;

    public VulkanObjectEntryUsageFlagBitsNVX(){
        super(new VkObjectEntryUsageFlagBitsNVX());
    }

    public VulkanObjectEntryUsageFlagBitsNVX(VkObjectEntryUsageFlagBitsNVX vk){
        super(vk);
    }

    @Override
    public VkObjectEntryUsageFlagBitsNVX getVk(){
        return (VkObjectEntryUsageFlagBitsNVX) super.getVk();
    }

    public VulkanObjectEntryUsageFlagBitsNVX(int value){
        super(new VkObjectEntryUsageFlagBitsNVX(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == OBJECT_ENTRY_USAGE_GRAPHICS_NVX) s += "OBJECT_ENTRY_USAGE_GRAPHICS_NVX";
        if(getValue() == OBJECT_ENTRY_USAGE_COMPUTE_NVX) s += "OBJECT_ENTRY_USAGE_COMPUTE_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
