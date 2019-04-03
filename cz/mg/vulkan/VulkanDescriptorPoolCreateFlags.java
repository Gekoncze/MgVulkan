package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorPoolCreateFlags.html">khronos documentation</a>
 **/
public class VulkanDescriptorPoolCreateFlags extends VulkanFlags {
    public VulkanDescriptorPoolCreateFlags(){
        super(new VkDescriptorPoolCreateFlags());
    }

    public VulkanDescriptorPoolCreateFlags(VkDescriptorPoolCreateFlags vk){
        super(vk);
    }

    @Override
    public VkDescriptorPoolCreateFlags getVk(){
        return (VkDescriptorPoolCreateFlags) super.getVk();
    }

    public VulkanDescriptorPoolCreateFlags(int value){
        super(new VkDescriptorPoolCreateFlags(value));
    }
}
