package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayModeKHR.html">khronos documentation</a>
 **/
public class VulkanDisplayModeKHR extends VulkanHandle {
    public VulkanDisplayModeKHR(){
        super(new VkDisplayModeKHR());
    }

    public VulkanDisplayModeKHR(VkDisplayModeKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayModeKHR getVk(){
        return (VkDisplayModeKHR) super.getVk();
    }

    public VulkanDisplayModeKHR(int value){
        super(new VkDisplayModeKHR(value));
    }
}
