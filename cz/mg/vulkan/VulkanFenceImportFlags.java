package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFenceImportFlags.html">khronos documentation</a>
 **/
public class VulkanFenceImportFlags extends VulkanFlags {
    public VulkanFenceImportFlags(){
        super(new VkFenceImportFlags());
    }

    public VulkanFenceImportFlags(VkFenceImportFlags vk){
        super(vk);
    }

    @Override
    public VkFenceImportFlags getVk(){
        return (VkFenceImportFlags) super.getVk();
    }

    public VulkanFenceImportFlags(int value){
        super(new VkFenceImportFlags(value));
    }
}
