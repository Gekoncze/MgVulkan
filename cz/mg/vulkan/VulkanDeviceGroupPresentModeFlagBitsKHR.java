package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupPresentModeFlagBitsKHR.html">khronos documentation</a>
 **/
public class VulkanDeviceGroupPresentModeFlagBitsKHR extends VulkanFlagBits {
    public static final int DEVICE_GROUP_PRESENT_MODE_LOCAL_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR;
    public static final int DEVICE_GROUP_PRESENT_MODE_REMOTE_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR;
    public static final int DEVICE_GROUP_PRESENT_MODE_SUM_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR;
    public static final int DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR;

    public VulkanDeviceGroupPresentModeFlagBitsKHR(){
        super(new VkDeviceGroupPresentModeFlagBitsKHR());
    }

    public VulkanDeviceGroupPresentModeFlagBitsKHR(VkDeviceGroupPresentModeFlagBitsKHR vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupPresentModeFlagBitsKHR getVk(){
        return (VkDeviceGroupPresentModeFlagBitsKHR) super.getVk();
    }

    public VulkanDeviceGroupPresentModeFlagBitsKHR(int value){
        super(new VkDeviceGroupPresentModeFlagBitsKHR(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEVICE_GROUP_PRESENT_MODE_LOCAL_KHR) s += "DEVICE_GROUP_PRESENT_MODE_LOCAL_KHR";
        if(getValue() == DEVICE_GROUP_PRESENT_MODE_REMOTE_KHR) s += "DEVICE_GROUP_PRESENT_MODE_REMOTE_KHR";
        if(getValue() == DEVICE_GROUP_PRESENT_MODE_SUM_KHR) s += "DEVICE_GROUP_PRESENT_MODE_SUM_KHR";
        if(getValue() == DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_KHR) s += "DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
