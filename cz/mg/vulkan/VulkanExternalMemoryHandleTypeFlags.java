package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalMemoryHandleTypeFlags extends VulkanFlags {
    public VulkanExternalMemoryHandleTypeFlags(){
        super(new VkExternalMemoryHandleTypeFlags());
    }

    public VulkanExternalMemoryHandleTypeFlags(VkExternalMemoryHandleTypeFlags vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryHandleTypeFlags getVk(){
        return (VkExternalMemoryHandleTypeFlags) super.getVk();
    }

    public VulkanExternalMemoryHandleTypeFlags(int value){
        super(new VkExternalMemoryHandleTypeFlags(value));
    }
}
