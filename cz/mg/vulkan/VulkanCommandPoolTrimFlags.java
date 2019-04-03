package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolTrimFlags.html">khronos documentation</a>
 **/
public class VulkanCommandPoolTrimFlags extends VulkanFlags {
    public VulkanCommandPoolTrimFlags(){
        super(new VkCommandPoolTrimFlags());
    }

    public VulkanCommandPoolTrimFlags(VkCommandPoolTrimFlags vk){
        super(vk);
    }

    @Override
    public VkCommandPoolTrimFlags getVk(){
        return (VkCommandPoolTrimFlags) super.getVk();
    }

    public VulkanCommandPoolTrimFlags(int value){
        super(new VkCommandPoolTrimFlags(value));
    }
}
