package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSwapchainKHR.html">khronos documentation</a>
 **/
public class VulkanSwapchainKHR extends VulkanHandle {
    public VulkanSwapchainKHR(){
        super(new VkSwapchainKHR());
    }

    public VulkanSwapchainKHR(VkSwapchainKHR vk){
        super(vk);
    }

    @Override
    public VkSwapchainKHR getVk(){
        return (VkSwapchainKHR) super.getVk();
    }

    public VulkanSwapchainKHR(int value){
        super(new VkSwapchainKHR(value));
    }
}
