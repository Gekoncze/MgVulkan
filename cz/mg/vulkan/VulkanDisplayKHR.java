package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayKHR.html">khronos documentation</a>
 **/
public class VulkanDisplayKHR extends VulkanHandle {
    public VulkanDisplayKHR(){
        super(new VkDisplayKHR());
    }

    public VulkanDisplayKHR(VkDisplayKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayKHR getVk(){
        return (VkDisplayKHR) super.getVk();
    }

    public VulkanDisplayKHR(int value){
        super(new VkDisplayKHR(value));
    }
}
