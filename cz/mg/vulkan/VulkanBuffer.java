package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBuffer.html">khronos documentation</a>
 **/
public class VulkanBuffer extends VulkanHandle {
    public VulkanBuffer(){
        super(new VkBuffer());
    }

    public VulkanBuffer(VkBuffer vk){
        super(vk);
    }

    @Override
    public VkBuffer getVk(){
        return (VkBuffer) super.getVk();
    }

    public VulkanBuffer(int value){
        super(new VkBuffer(value));
    }
}
