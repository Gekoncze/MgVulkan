package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBuffer.html">khronos documentation</a>
 **/
public class VulkanCommandBuffer extends VulkanHandle {
    public VulkanCommandBuffer(){
        super(new VkCommandBuffer());
    }

    public VulkanCommandBuffer(VkCommandBuffer vk){
        super(vk);
    }

    @Override
    public VkCommandBuffer getVk(){
        return (VkCommandBuffer) super.getVk();
    }

    public VulkanCommandBuffer(int value){
        super(new VkCommandBuffer(value));
    }
}
