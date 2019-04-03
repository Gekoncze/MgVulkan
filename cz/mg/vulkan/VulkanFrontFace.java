package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFrontFace.html">khronos documentation</a>
 **/
public class VulkanFrontFace extends VulkanEnum {
    public static final int COUNTER_CLOCKWISE = VkFrontFace.VK_FRONT_FACE_COUNTER_CLOCKWISE;
    public static final int CLOCKWISE = VkFrontFace.VK_FRONT_FACE_CLOCKWISE;

    public VulkanFrontFace(){
        super(new VkFrontFace());
    }

    public VulkanFrontFace(VkFrontFace vk){
        super(vk);
    }

    @Override
    public VkFrontFace getVk(){
        return (VkFrontFace) super.getVk();
    }

    public VulkanFrontFace(int value){
        super(new VkFrontFace(value));
    }

    @Override
    public String toString() {
        if(getValue() == COUNTER_CLOCKWISE) return "COUNTER_CLOCKWISE";
        if(getValue() == CLOCKWISE) return "CLOCKWISE";
        return "UNKNOWN";
    }
}
