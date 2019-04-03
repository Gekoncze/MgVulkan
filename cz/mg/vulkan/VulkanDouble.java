package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/double.html">khronos documentation</a>
 **/
public class VulkanDouble extends VulkanObject {
    public VulkanDouble(){
        super(new VkDouble());
    }

    public VulkanDouble(VkDouble vk){
        super(vk);
    }

    @Override
    public VkDouble getVk(){
        return (VkDouble) super.getVk();
    }

    public VulkanDouble(double value){
        super(new VkDouble(value));
    }

    public double getValue(){
        return getVk().getValue();
    }

    public void setValue(double value){
        getVk().setValue(value);
    }
}
