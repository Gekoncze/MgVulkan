package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkInstance.html">khronos documentation</a>
 **/
public class VulkanInstance extends VulkanHandle {
    public VulkanInstance(){
        super(new VkInstance());
    }

    public VulkanInstance(VkInstance vk){
        super(vk);
    }

    @Override
    public VkInstance getVk(){
        return (VkInstance) super.getVk();
    }

    public VulkanInstance(int value){
        super(new VkInstance(value));
    }
}
