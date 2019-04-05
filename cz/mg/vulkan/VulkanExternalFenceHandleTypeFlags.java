package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalFenceHandleTypeFlags extends VulkanFlags {
    public VulkanExternalFenceHandleTypeFlags(){
        super(new VkExternalFenceHandleTypeFlags());
    }

    public VulkanExternalFenceHandleTypeFlags(VkExternalFenceHandleTypeFlags vk){
        super(vk);
    }

    @Override
    public VkExternalFenceHandleTypeFlags getVk(){
        return (VkExternalFenceHandleTypeFlags) super.getVk();
    }

    public VulkanExternalFenceHandleTypeFlags(int value){
        super(new VkExternalFenceHandleTypeFlags(value));
    }
}
