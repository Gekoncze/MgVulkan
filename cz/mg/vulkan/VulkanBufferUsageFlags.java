package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferUsageFlags.html">khronos documentation</a>
 **/
public class VulkanBufferUsageFlags extends VulkanFlags {
    public VulkanBufferUsageFlags(){
        super(new VkBufferUsageFlags());
    }

    public VulkanBufferUsageFlags(VkBufferUsageFlags vk){
        super(vk);
    }

    @Override
    public VkBufferUsageFlags getVk(){
        return (VkBufferUsageFlags) super.getVk();
    }

    public VulkanBufferUsageFlags(int value){
        super(new VkBufferUsageFlags(value));
    }
}
