package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalMemoryHandleTypeFlagsNV extends VulkanFlags {
    public VulkanExternalMemoryHandleTypeFlagsNV(){
        super(new VkExternalMemoryHandleTypeFlagsNV());
    }

    public VulkanExternalMemoryHandleTypeFlagsNV(VkExternalMemoryHandleTypeFlagsNV vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryHandleTypeFlagsNV getVk(){
        return (VkExternalMemoryHandleTypeFlagsNV) super.getVk();
    }

    public VulkanExternalMemoryHandleTypeFlagsNV(int value){
        super(new VkExternalMemoryHandleTypeFlagsNV(value));
    }
}
