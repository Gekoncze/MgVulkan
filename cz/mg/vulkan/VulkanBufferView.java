package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferView.html">khronos documentation</a>
 **/
public class VulkanBufferView extends VulkanHandle {
    public VulkanBufferView(){
        super(new VkBufferView());
    }

    public VulkanBufferView(VkBufferView vk){
        super(vk);
    }

    @Override
    public VkBufferView getVk(){
        return (VkBufferView) super.getVk();
    }

    public VulkanBufferView(int value){
        super(new VkBufferView(value));
    }
}
