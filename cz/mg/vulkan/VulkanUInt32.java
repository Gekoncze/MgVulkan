package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/uint32_t.html">khronos documentation</a>
 **/
public class VulkanUInt32 extends VulkanObject {
    public VulkanUInt32(){
        super(new VkUInt32());
    }

    public VulkanUInt32(VkUInt32 vk){
        super(vk);
    }

    @Override
    public VkUInt32 getVk(){
        return (VkUInt32) super.getVk();
    }

    public VulkanUInt32(int value){
        super(new VkUInt32(value));
    }

    public int getValue(){
        return getVk().getValue();
    }

    public void setValue(int value){
        getVk().setValue(value);
    }
}
