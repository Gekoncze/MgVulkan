package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferViewCreateFlags.html">khronos documentation</a>
 **/
public class VulkanBufferViewCreateFlags extends VulkanFlags {
    public VulkanBufferViewCreateFlags(){
        super(new VkBufferViewCreateFlags());
    }

    public VulkanBufferViewCreateFlags(VkBufferViewCreateFlags vk){
        super(vk);
    }

    @Override
    public VkBufferViewCreateFlags getVk(){
        return (VkBufferViewCreateFlags) super.getVk();
    }

    public VulkanBufferViewCreateFlags(int value){
        super(new VkBufferViewCreateFlags(value));
    }
}
