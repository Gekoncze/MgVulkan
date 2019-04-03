package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndexType.html">khronos documentation</a>
 **/
public class VulkanIndexType extends VulkanEnum {
    public static final int UINT16 = VkIndexType.VK_INDEX_TYPE_UINT16;
    public static final int UINT32 = VkIndexType.VK_INDEX_TYPE_UINT32;

    public VulkanIndexType(){
        super(new VkIndexType());
    }

    public VulkanIndexType(VkIndexType vk){
        super(vk);
    }

    @Override
    public VkIndexType getVk(){
        return (VkIndexType) super.getVk();
    }

    public VulkanIndexType(int value){
        super(new VkIndexType(value));
    }

    @Override
    public String toString() {
        if(getValue() == UINT16) return "UINT16";
        if(getValue() == UINT32) return "UINT32";
        return "UNKNOWN";
    }
}
