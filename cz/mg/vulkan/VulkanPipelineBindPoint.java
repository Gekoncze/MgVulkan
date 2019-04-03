package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineBindPoint.html">khronos documentation</a>
 **/
public class VulkanPipelineBindPoint extends VulkanEnum {
    public static final int GRAPHICS = VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS;
    public static final int COMPUTE = VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_COMPUTE;

    public VulkanPipelineBindPoint(){
        super(new VkPipelineBindPoint());
    }

    public VulkanPipelineBindPoint(VkPipelineBindPoint vk){
        super(vk);
    }

    @Override
    public VkPipelineBindPoint getVk(){
        return (VkPipelineBindPoint) super.getVk();
    }

    public VulkanPipelineBindPoint(int value){
        super(new VkPipelineBindPoint(value));
    }

    @Override
    public String toString() {
        if(getValue() == GRAPHICS) return "GRAPHICS";
        if(getValue() == COMPUTE) return "COMPUTE";
        return "UNKNOWN";
    }
}
