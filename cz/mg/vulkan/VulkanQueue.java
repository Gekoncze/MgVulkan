package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueue.html">khronos documentation</a>
 **/
public class VulkanQueue extends VulkanHandle {
    public VulkanQueue(){
        super(new VkQueue());
    }

    public VulkanQueue(VkQueue vk){
        super(vk);
    }

    @Override
    public VkQueue getVk(){
        return (VkQueue) super.getVk();
    }

    public VulkanQueue(int value){
        super(new VkQueue(value));
    }
}
