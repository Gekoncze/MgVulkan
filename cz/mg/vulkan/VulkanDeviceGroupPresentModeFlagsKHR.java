package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupPresentModeFlagsKHR.html">khronos documentation</a>
 **/
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
