package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageViewCreateFlags.html">khronos documentation</a>
 **/
public class VulkanImageViewCreateFlags extends VulkanFlags {
    public VulkanImageViewCreateFlags(){
        super(new VkImageViewCreateFlags());
    }

    public VulkanImageViewCreateFlags(VkImageViewCreateFlags vk){
        super(vk);
    }

    @Override
    public VkImageViewCreateFlags getVk(){
        return (VkImageViewCreateFlags) super.getVk();
    }

    public VulkanImageViewCreateFlags(int value){
        super(new VkImageViewCreateFlags(value));
    }
}
