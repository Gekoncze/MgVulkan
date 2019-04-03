package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutUsageFlagsNVX.html">khronos documentation</a>
 **/
public class VulkanIndirectCommandsLayoutUsageFlagsNVX extends VulkanFlags {
    public VulkanIndirectCommandsLayoutUsageFlagsNVX(){
        super(new VkIndirectCommandsLayoutUsageFlagsNVX());
    }

    public VulkanIndirectCommandsLayoutUsageFlagsNVX(VkIndirectCommandsLayoutUsageFlagsNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsLayoutUsageFlagsNVX getVk(){
        return (VkIndirectCommandsLayoutUsageFlagsNVX) super.getVk();
    }

    public VulkanIndirectCommandsLayoutUsageFlagsNVX(int value){
        super(new VkIndirectCommandsLayoutUsageFlagsNVX(value));
    }
}
