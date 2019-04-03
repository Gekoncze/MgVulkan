package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferCreateFlags.html">khronos documentation</a>
 **/
public class VulkanBufferCreateFlags extends VulkanFlags {
    public VulkanBufferCreateFlags(){
        super(new VkBufferCreateFlags());
    }

    public VulkanBufferCreateFlags(VkBufferCreateFlags vk){
        super(vk);
    }

    @Override
    public VkBufferCreateFlags getVk(){
        return (VkBufferCreateFlags) super.getVk();
    }

    public VulkanBufferCreateFlags(int value){
        super(new VkBufferCreateFlags(value));
    }
}
