package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFenceCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanFenceCreateFlagBits extends VulkanFlagBits {
    public static final int SIGNALED = VkFenceCreateFlagBits.VK_FENCE_CREATE_SIGNALED_BIT;

    public VulkanFenceCreateFlagBits(){
        super(new VkFenceCreateFlagBits());
    }

    public VulkanFenceCreateFlagBits(VkFenceCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkFenceCreateFlagBits getVk(){
        return (VkFenceCreateFlagBits) super.getVk();
    }

    public VulkanFenceCreateFlagBits(int value){
        super(new VkFenceCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SIGNALED) s += "SIGNALED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
