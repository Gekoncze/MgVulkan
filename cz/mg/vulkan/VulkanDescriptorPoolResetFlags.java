package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorPoolResetFlags.html">khronos documentation</a>
 **/
public class VulkanDescriptorPoolResetFlags extends VulkanFlags {
    public VulkanDescriptorPoolResetFlags(){
        super(new VkDescriptorPoolResetFlags());
    }

    public VulkanDescriptorPoolResetFlags(VkDescriptorPoolResetFlags vk){
        super(vk);
    }

    @Override
    public VkDescriptorPoolResetFlags getVk(){
        return (VkDescriptorPoolResetFlags) super.getVk();
    }

    public VulkanDescriptorPoolResetFlags(int value){
        super(new VkDescriptorPoolResetFlags(value));
    }
}
