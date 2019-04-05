package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
