package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplaySurfaceCreateFlagsKHR extends VulkanFlags {
    public VulkanDisplaySurfaceCreateFlagsKHR(){
        super(new VkDisplaySurfaceCreateFlagsKHR());
    }

    public VulkanDisplaySurfaceCreateFlagsKHR(VkDisplaySurfaceCreateFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkDisplaySurfaceCreateFlagsKHR getVk(){
        return (VkDisplaySurfaceCreateFlagsKHR) super.getVk();
    }

    public VulkanDisplaySurfaceCreateFlagsKHR(int value){
        super(new VkDisplaySurfaceCreateFlagsKHR(value));
    }
}
