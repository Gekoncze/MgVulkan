package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkEnum.html">khronos documentation</a>
 **/
public class VulkanEnum extends VulkanInt32 {
    public VulkanEnum(){
        super(new VkEnum());
    }

    public VulkanEnum(VkEnum vk){
        super(vk);
    }

    @Override
    public VkEnum getVk(){
        return (VkEnum) super.getVk();
    }

    public VulkanEnum(int value){
        super(new VkEnum(value));
    }
}
