package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryPool.html">khronos documentation</a>
 **/
public class VulkanQueryPool extends VulkanHandle {
    public VulkanQueryPool(){
        super(new VkQueryPool());
    }

    public VulkanQueryPool(VkQueryPool vk){
        super(vk);
    }

    @Override
    public VkQueryPool getVk(){
        return (VkQueryPool) super.getVk();
    }

    public VulkanQueryPool(int value){
        super(new VkQueryPool(value));
    }
}
