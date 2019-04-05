package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSwapchainCreateFlagBitsKHR extends VulkanFlagBits {
    public static final int SPLIT_INSTANCE_BIND_REGIONS_KHR = VkSwapchainCreateFlagBitsKHR.VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR;
    public static final int PROTECTED_KHR = VkSwapchainCreateFlagBitsKHR.VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR;

    public VulkanSwapchainCreateFlagBitsKHR(){
        super(new VkSwapchainCreateFlagBitsKHR());
    }

    public VulkanSwapchainCreateFlagBitsKHR(VkSwapchainCreateFlagBitsKHR vk){
        super(vk);
    }

    @Override
    public VkSwapchainCreateFlagBitsKHR getVk(){
        return (VkSwapchainCreateFlagBitsKHR) super.getVk();
    }

    public VulkanSwapchainCreateFlagBitsKHR(int value){
        super(new VkSwapchainCreateFlagBitsKHR(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SPLIT_INSTANCE_BIND_REGIONS_KHR) s += "SPLIT_INSTANCE_BIND_REGIONS_KHR";
        if(getValue() == PROTECTED_KHR) s += "PROTECTED_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
