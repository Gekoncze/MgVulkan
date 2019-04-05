package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
