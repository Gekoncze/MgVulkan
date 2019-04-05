package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDependencyFlags extends VulkanFlags {
    public VulkanDependencyFlags(){
        super(new VkDependencyFlags());
    }

    public VulkanDependencyFlags(VkDependencyFlags vk){
        super(vk);
    }

    @Override
    public VkDependencyFlags getVk(){
        return (VkDependencyFlags) super.getVk();
    }

    public VulkanDependencyFlags(int value){
        super(new VkDependencyFlags(value));
    }
}
