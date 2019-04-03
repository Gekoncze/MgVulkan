package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSampleMask.html">khronos documentation</a>
 **/
public class VulkanSampleMask extends VulkanUInt32 {
    public VulkanSampleMask(){
        super(new VkSampleMask());
    }

    public VulkanSampleMask(VkSampleMask vk){
        super(vk);
    }

    @Override
    public VkSampleMask getVk(){
        return (VkSampleMask) super.getVk();
    }

    public VulkanSampleMask(int value){
        super(new VkSampleMask(value));
    }
}
