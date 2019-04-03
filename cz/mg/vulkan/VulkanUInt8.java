package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/uint8_t.html">khronos documentation</a>
 **/
public class VulkanUInt8 extends VulkanObject {
    public VulkanUInt8(){
        super(new VkUInt8());
    }

    public VulkanUInt8(VkUInt8 vk){
        super(vk);
    }

    @Override
    public VkUInt8 getVk(){
        return (VkUInt8) super.getVk();
    }

    public VulkanUInt8(byte value){
        super(new VkUInt8(value));
    }

    public byte getValue(){
        return getVk().getValue();
    }

    public void setValue(byte value){
        getVk().setValue(value);
    }
}
