package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceSize.html">khronos documentation</a>
 **/
public class VulkanDeviceSize extends VulkanUInt64 {
    public VulkanDeviceSize(){
        super(new VkDeviceSize());
    }

    public VulkanDeviceSize(VkDeviceSize vk){
        super(vk);
    }

    @Override
    public VkDeviceSize getVk(){
        return (VkDeviceSize) super.getVk();
    }

    public VulkanDeviceSize(long value){
        super(new VkDeviceSize(value));
    }
}
