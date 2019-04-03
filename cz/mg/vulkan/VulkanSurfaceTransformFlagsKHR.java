package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceTransformFlagsKHR.html">khronos documentation</a>
 **/
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
