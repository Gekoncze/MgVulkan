package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryHandleTypeFlagsNV.html">khronos documentation</a>
 **/
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
