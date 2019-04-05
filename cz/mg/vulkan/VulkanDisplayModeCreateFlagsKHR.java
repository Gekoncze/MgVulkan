package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayModeCreateFlagsKHR extends VulkanFlags {
    public VulkanDisplayModeCreateFlagsKHR(){
        super(new VkDisplayModeCreateFlagsKHR());
    }

    public VulkanDisplayModeCreateFlagsKHR(VkDisplayModeCreateFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayModeCreateFlagsKHR getVk(){
        return (VkDisplayModeCreateFlagsKHR) super.getVk();
    }

    public VulkanDisplayModeCreateFlagsKHR(int value){
        super(new VkDisplayModeCreateFlagsKHR(value));
    }
}
