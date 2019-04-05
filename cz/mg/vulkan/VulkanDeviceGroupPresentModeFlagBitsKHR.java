package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceGroupPresentModeFlagBitsKHR extends VulkanFlagBits {
    public static final int LOCAL_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR;
    public static final int REMOTE_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR;
    public static final int SUM_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR;
    public static final int LOCAL_MULTI_DEVICE_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR;

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
        if(getValue() == LOCAL_KHR) s += "LOCAL_KHR";
        if(getValue() == REMOTE_KHR) s += "REMOTE_KHR";
        if(getValue() == SUM_KHR) s += "SUM_KHR";
        if(getValue() == LOCAL_MULTI_DEVICE_KHR) s += "LOCAL_MULTI_DEVICE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
