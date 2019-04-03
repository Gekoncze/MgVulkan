package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPresentModeKHR.html">khronos documentation</a>
 **/
public class VulkanPresentModeKHR extends VulkanEnum {
    public static final int PRESENT_MODE_IMMEDIATE_KHR = VkPresentModeKHR.VK_PRESENT_MODE_IMMEDIATE_KHR;
    public static final int PRESENT_MODE_MAILBOX_KHR = VkPresentModeKHR.VK_PRESENT_MODE_MAILBOX_KHR;
    public static final int PRESENT_MODE_FIFO_KHR = VkPresentModeKHR.VK_PRESENT_MODE_FIFO_KHR;
    public static final int PRESENT_MODE_FIFO_RELAXED_KHR = VkPresentModeKHR.VK_PRESENT_MODE_FIFO_RELAXED_KHR;
    public static final int PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR = VkPresentModeKHR.VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR;
    public static final int PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = VkPresentModeKHR.VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR;

    public VulkanPresentModeKHR(){
        super(new VkPresentModeKHR());
    }

    public VulkanPresentModeKHR(VkPresentModeKHR vk){
        super(vk);
    }

    @Override
    public VkPresentModeKHR getVk(){
        return (VkPresentModeKHR) super.getVk();
    }

    public VulkanPresentModeKHR(int value){
        super(new VkPresentModeKHR(value));
    }

    @Override
    public String toString() {
        if(getValue() == PRESENT_MODE_IMMEDIATE_KHR) return "PRESENT_MODE_IMMEDIATE_KHR";
        if(getValue() == PRESENT_MODE_MAILBOX_KHR) return "PRESENT_MODE_MAILBOX_KHR";
        if(getValue() == PRESENT_MODE_FIFO_KHR) return "PRESENT_MODE_FIFO_KHR";
        if(getValue() == PRESENT_MODE_FIFO_RELAXED_KHR) return "PRESENT_MODE_FIFO_RELAXED_KHR";
        if(getValue() == PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR) return "PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR";
        if(getValue() == PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR) return "PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR";
        return "UNKNOWN";
    }
}
