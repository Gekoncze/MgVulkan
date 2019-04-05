package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayPlaneAlphaFlagsKHR extends VulkanFlags {
    public VulkanDisplayPlaneAlphaFlagsKHR(){
        super(new VkDisplayPlaneAlphaFlagsKHR());
    }

    public VulkanDisplayPlaneAlphaFlagsKHR(VkDisplayPlaneAlphaFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayPlaneAlphaFlagsKHR getVk(){
        return (VkDisplayPlaneAlphaFlagsKHR) super.getVk();
    }

    public VulkanDisplayPlaneAlphaFlagsKHR(int value){
        super(new VkDisplayPlaneAlphaFlagsKHR(value));
    }
}
