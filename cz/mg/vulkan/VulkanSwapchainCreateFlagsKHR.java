package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSwapchainCreateFlagsKHR.html">khronos documentation</a>
 **/
public class VulkanSwapchainCreateFlagsKHR extends VulkanFlags {
    public VulkanSwapchainCreateFlagsKHR(){
        super(new VkSwapchainCreateFlagsKHR());
    }

    public VulkanSwapchainCreateFlagsKHR(VkSwapchainCreateFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkSwapchainCreateFlagsKHR getVk(){
        return (VkSwapchainCreateFlagsKHR) super.getVk();
    }

    public VulkanSwapchainCreateFlagsKHR(int value){
        super(new VkSwapchainCreateFlagsKHR(value));
    }
}
