package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutNVX.html">khronos documentation</a>
 **/
public class VulkanIndirectCommandsLayoutNVX extends VulkanHandle {
    public VulkanIndirectCommandsLayoutNVX(){
        super(new VkIndirectCommandsLayoutNVX());
    }

    public VulkanIndirectCommandsLayoutNVX(VkIndirectCommandsLayoutNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsLayoutNVX getVk(){
        return (VkIndirectCommandsLayoutNVX) super.getVk();
    }

    public VulkanIndirectCommandsLayoutNVX(int value){
        super(new VkIndirectCommandsLayoutNVX(value));
    }
}
