package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSurfaceCounterFlagBitsEXT extends VulkanFlagBits {
    public static final int VBLANK_EXT = VkSurfaceCounterFlagBitsEXT.VK_SURFACE_COUNTER_VBLANK_EXT;

    public VulkanSurfaceCounterFlagBitsEXT(){
        super(new VkSurfaceCounterFlagBitsEXT());
    }

    public VulkanSurfaceCounterFlagBitsEXT(VkSurfaceCounterFlagBitsEXT vk){
        super(vk);
    }

    @Override
    public VkSurfaceCounterFlagBitsEXT getVk(){
        return (VkSurfaceCounterFlagBitsEXT) super.getVk();
    }

    public VulkanSurfaceCounterFlagBitsEXT(int value){
        super(new VkSurfaceCounterFlagBitsEXT(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VBLANK_EXT) s += "VBLANK_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
