package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageCreateFlags.html">khronos documentation</a>
 **/
public class VulkanImageCreateFlags extends VulkanFlags {
    public VulkanImageCreateFlags(){
        super(new VkImageCreateFlags());
    }

    public VulkanImageCreateFlags(VkImageCreateFlags vk){
        super(vk);
    }

    @Override
    public VkImageCreateFlags getVk(){
        return (VkImageCreateFlags) super.getVk();
    }

    public VulkanImageCreateFlags(int value){
        super(new VkImageCreateFlags(value));
    }
}
