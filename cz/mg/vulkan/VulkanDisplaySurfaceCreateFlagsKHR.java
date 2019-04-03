package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplaySurfaceCreateFlagsKHR.html">khronos documentation</a>
 **/
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
