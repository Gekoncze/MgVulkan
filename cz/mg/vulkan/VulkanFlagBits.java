package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFlagBits.html">khronos documentation</a>
 **/
public class VulkanFlagBits extends VulkanInt32 {
    public VulkanFlagBits(){
        super(new VkFlagBits());
    }

    public VulkanFlagBits(VkFlagBits vk){
        super(vk);
    }

    @Override
    public VkFlagBits getVk(){
        return (VkFlagBits) super.getVk();
    }

    public VulkanFlagBits(int value){
        super(new VkFlagBits(value));
    }
}
