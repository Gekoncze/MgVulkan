package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorBindingFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanDescriptorBindingFlagsEXT extends VulkanFlags {
    public VulkanDescriptorBindingFlagsEXT(){
        super(new VkDescriptorBindingFlagsEXT());
    }

    public VulkanDescriptorBindingFlagsEXT(VkDescriptorBindingFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDescriptorBindingFlagsEXT getVk(){
        return (VkDescriptorBindingFlagsEXT) super.getVk();
    }

    public VulkanDescriptorBindingFlagsEXT(int value){
        super(new VkDescriptorBindingFlagsEXT(value));
    }
}
