package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceKHR.html">khronos documentation</a>
 **/
public class VulkanSurfaceKHR extends VulkanHandle {
    public VulkanSurfaceKHR(){
        super(new VkSurfaceKHR());
    }

    public VulkanSurfaceKHR(VkSurfaceKHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceKHR getVk(){
        return (VkSurfaceKHR) super.getVk();
    }

    public VulkanSurfaceKHR(int value){
        super(new VkSurfaceKHR(value));
    }
}
