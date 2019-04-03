package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/char.html">khronos documentation</a>
 **/
public class VulkanChar extends VulkanObject {
    public VulkanChar(){
        super(new VkChar());
    }

    public VulkanChar(VkChar vk){
        super(vk);
    }

    @Override
    public VkChar getVk(){
        return (VkChar) super.getVk();
    }

    public VulkanChar(byte value){
        super(new VkChar(value));
    }

    public byte getValue(){
        return getVk().getValue();
    }

    public void setValue(byte value){
        getVk().setValue(value);
    }
}
