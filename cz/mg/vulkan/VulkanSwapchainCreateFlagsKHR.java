package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
