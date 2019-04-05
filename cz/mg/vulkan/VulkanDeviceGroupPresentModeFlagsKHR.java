package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceGroupPresentModeFlagsKHR extends VulkanFlags {
    public VulkanDeviceGroupPresentModeFlagsKHR(){
        super(new VkDeviceGroupPresentModeFlagsKHR());
    }

    public VulkanDeviceGroupPresentModeFlagsKHR(VkDeviceGroupPresentModeFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupPresentModeFlagsKHR getVk(){
        return (VkDeviceGroupPresentModeFlagsKHR) super.getVk();
    }

    public VulkanDeviceGroupPresentModeFlagsKHR(int value){
        super(new VkDeviceGroupPresentModeFlagsKHR(value));
    }
}
