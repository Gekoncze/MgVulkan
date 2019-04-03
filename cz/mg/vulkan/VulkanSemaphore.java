package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSemaphore.html">khronos documentation</a>
 **/
public class VulkanSemaphore extends VulkanHandle {
    public VulkanSemaphore(){
        super(new VkSemaphore());
    }

    public VulkanSemaphore(VkSemaphore vk){
        super(vk);
    }

    @Override
    public VkSemaphore getVk(){
        return (VkSemaphore) super.getVk();
    }

    public VulkanSemaphore(int value){
        super(new VkSemaphore(value));
    }
}
