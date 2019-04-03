package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCullModeFlagBits.html">khronos documentation</a>
 **/
public class VulkanCullModeFlagBits extends VulkanFlagBits {
    public static final int NONE = VkCullModeFlagBits.VK_CULL_MODE_NONE;
    public static final int FRONT = VkCullModeFlagBits.VK_CULL_MODE_FRONT_BIT;
    public static final int BACK = VkCullModeFlagBits.VK_CULL_MODE_BACK_BIT;
    public static final int FRONT_AND_BACK = VkCullModeFlagBits.VK_CULL_MODE_FRONT_AND_BACK;

    public VulkanCullModeFlagBits(){
        super(new VkCullModeFlagBits());
    }

    public VulkanCullModeFlagBits(VkCullModeFlagBits vk){
        super(vk);
    }

    @Override
    public VkCullModeFlagBits getVk(){
        return (VkCullModeFlagBits) super.getVk();
    }

    public VulkanCullModeFlagBits(int value){
        super(new VkCullModeFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == NONE) s += "NONE";
        if(getValue() == FRONT) s += "FRONT";
        if(getValue() == BACK) s += "BACK";
        if(getValue() == FRONT_AND_BACK) s += "FRONT_AND_BACK";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
