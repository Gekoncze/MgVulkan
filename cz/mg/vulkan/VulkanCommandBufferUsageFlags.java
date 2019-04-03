package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBufferUsageFlags.html">khronos documentation</a>
 **/
public class VulkanCommandBufferUsageFlags extends VulkanFlags {
    public VulkanCommandBufferUsageFlags(){
        super(new VkCommandBufferUsageFlags());
    }

    public VulkanCommandBufferUsageFlags(VkCommandBufferUsageFlags vk){
        super(vk);
    }

    @Override
    public VkCommandBufferUsageFlags getVk(){
        return (VkCommandBufferUsageFlags) super.getVk();
    }

    public VulkanCommandBufferUsageFlags(int value){
        super(new VkCommandBufferUsageFlags(value));
    }
}
