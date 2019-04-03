package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/float.html">khronos documentation</a>
 **/
public class VulkanFloat extends VulkanObject {
    public VulkanFloat(){
        super(new VkFloat());
    }

    public VulkanFloat(VkFloat vk){
        super(vk);
    }

    @Override
    public VkFloat getVk(){
        return (VkFloat) super.getVk();
    }

    public VulkanFloat(float value){
        super(new VkFloat(value));
    }

    public float getValue(){
        return getVk().getValue();
    }

    public void setValue(float value){
        getVk().setValue(value);
    }
}
