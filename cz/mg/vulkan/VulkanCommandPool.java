package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPool.html">khronos documentation</a>
 **/
public class VulkanCommandPool extends VulkanHandle {
    public VulkanCommandPool(){
        super(new VkCommandPool());
    }

    public VulkanCommandPool(VkCommandPool vk){
        super(vk);
    }

    @Override
    public VkCommandPool getVk(){
        return (VkCommandPool) super.getVk();
    }

    public VulkanCommandPool(int value){
        super(new VkCommandPool(value));
    }
}
