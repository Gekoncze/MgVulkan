package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryControlFlagBits.html">khronos documentation</a>
 **/
public class VulkanQueryControlFlagBits extends VulkanFlagBits {
    public static final int PRECISE = VkQueryControlFlagBits.VK_QUERY_CONTROL_PRECISE_BIT;

    public VulkanQueryControlFlagBits(){
        super(new VkQueryControlFlagBits());
    }

    public VulkanQueryControlFlagBits(VkQueryControlFlagBits vk){
        super(vk);
    }

    @Override
    public VkQueryControlFlagBits getVk(){
        return (VkQueryControlFlagBits) super.getVk();
    }

    public VulkanQueryControlFlagBits(int value){
        super(new VkQueryControlFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == PRECISE) s += "PRECISE";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
