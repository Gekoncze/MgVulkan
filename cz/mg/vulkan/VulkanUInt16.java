package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/uint16_t.html">khronos documentation</a>
 **/
public class VulkanUInt16 extends VulkanObject {
    public VulkanUInt16(){
        super(new VkUInt16());
    }

    public VulkanUInt16(VkUInt16 vk){
        super(vk);
    }

    @Override
    public VkUInt16 getVk(){
        return (VkUInt16) super.getVk();
    }

    public VulkanUInt16(short value){
        super(new VkUInt16(value));
    }

    public short getValue(){
        return getVk().getValue();
    }

    public void setValue(short value){
        getVk().setValue(value);
    }
}
