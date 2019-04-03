package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkStencilFaceFlags.html">khronos documentation</a>
 **/
public class VulkanStencilFaceFlags extends VulkanFlags {
    public VulkanStencilFaceFlags(){
        super(new VkStencilFaceFlags());
    }

    public VulkanStencilFaceFlags(VkStencilFaceFlags vk){
        super(vk);
    }

    @Override
    public VkStencilFaceFlags getVk(){
        return (VkStencilFaceFlags) super.getVk();
    }

    public VulkanStencilFaceFlags(int value){
        super(new VkStencilFaceFlags(value));
    }
}
