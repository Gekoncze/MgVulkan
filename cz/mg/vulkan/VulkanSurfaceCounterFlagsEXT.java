package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSurfaceCounterFlagsEXT extends VulkanFlags {
    public VulkanSurfaceCounterFlagsEXT(){
        super(new VkSurfaceCounterFlagsEXT());
    }

    public VulkanSurfaceCounterFlagsEXT(VkSurfaceCounterFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkSurfaceCounterFlagsEXT getVk(){
        return (VkSurfaceCounterFlagsEXT) super.getVk();
    }

    public VulkanSurfaceCounterFlagsEXT(int value){
        super(new VkSurfaceCounterFlagsEXT(value));
    }
}
