package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanColorComponentFlags extends VulkanFlags {
    public VulkanColorComponentFlags(){
        super(new VkColorComponentFlags());
    }

    public VulkanColorComponentFlags(VkColorComponentFlags vk){
        super(vk);
    }

    @Override
    public VkColorComponentFlags getVk(){
        return (VkColorComponentFlags) super.getVk();
    }

    public VulkanColorComponentFlags(int value){
        super(new VkColorComponentFlags(value));
    }
}
