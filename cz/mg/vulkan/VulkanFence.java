package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFence.html">khronos documentation</a>
 **/
public class VulkanFence extends VulkanHandle {
    public VulkanFence(){
        super(new VkFence());
    }

    public VulkanFence(VkFence vk){
        super(vk);
    }

    @Override
    public VkFence getVk(){
        return (VkFence) super.getVk();
    }

    public VulkanFence(int value){
        super(new VkFence(value));
    }
}
