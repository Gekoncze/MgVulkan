package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSurfaceTransformFlagsKHR extends VulkanFlags {
    public VulkanSurfaceTransformFlagsKHR(){
        super(new VkSurfaceTransformFlagsKHR());
    }

    public VulkanSurfaceTransformFlagsKHR(VkSurfaceTransformFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceTransformFlagsKHR getVk(){
        return (VkSurfaceTransformFlagsKHR) super.getVk();
    }

    public VulkanSurfaceTransformFlagsKHR(int value){
        super(new VkSurfaceTransformFlagsKHR(value));
    }
}
