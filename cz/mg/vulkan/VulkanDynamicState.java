package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDynamicState extends VulkanEnum {
    public static final int VIEWPORT = VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT;
    public static final int SCISSOR = VkDynamicState.VK_DYNAMIC_STATE_SCISSOR;
    public static final int LINE_WIDTH = VkDynamicState.VK_DYNAMIC_STATE_LINE_WIDTH;
    public static final int DEPTH_BIAS = VkDynamicState.VK_DYNAMIC_STATE_DEPTH_BIAS;
    public static final int BLEND_CONSTANTS = VkDynamicState.VK_DYNAMIC_STATE_BLEND_CONSTANTS;
    public static final int DEPTH_BOUNDS = VkDynamicState.VK_DYNAMIC_STATE_DEPTH_BOUNDS;
    public static final int STENCIL_COMPARE_MASK = VkDynamicState.VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK;
    public static final int STENCIL_WRITE_MASK = VkDynamicState.VK_DYNAMIC_STATE_STENCIL_WRITE_MASK;
    public static final int STENCIL_REFERENCE = VkDynamicState.VK_DYNAMIC_STATE_STENCIL_REFERENCE;
    public static final int VIEWPORT_W_SCALING_NV = VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV;
    public static final int DISCARD_RECTANGLE_EXT = VkDynamicState.VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT;
    public static final int SAMPLE_LOCATIONS_EXT = VkDynamicState.VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT;

    public VulkanDynamicState(){
        super(new VkDynamicState());
    }

    public VulkanDynamicState(VkDynamicState vk){
        super(vk);
    }

    @Override
    public VkDynamicState getVk(){
        return (VkDynamicState) super.getVk();
    }

    public VulkanDynamicState(int value){
        super(new VkDynamicState(value));
    }

    @Override
    public String toString() {
        if(getValue() == VIEWPORT) return "VIEWPORT";
        if(getValue() == SCISSOR) return "SCISSOR";
        if(getValue() == LINE_WIDTH) return "LINE_WIDTH";
        if(getValue() == DEPTH_BIAS) return "DEPTH_BIAS";
        if(getValue() == BLEND_CONSTANTS) return "BLEND_CONSTANTS";
        if(getValue() == DEPTH_BOUNDS) return "DEPTH_BOUNDS";
        if(getValue() == STENCIL_COMPARE_MASK) return "STENCIL_COMPARE_MASK";
        if(getValue() == STENCIL_WRITE_MASK) return "STENCIL_WRITE_MASK";
        if(getValue() == STENCIL_REFERENCE) return "STENCIL_REFERENCE";
        if(getValue() == VIEWPORT_W_SCALING_NV) return "VIEWPORT_W_SCALING_NV";
        if(getValue() == DISCARD_RECTANGLE_EXT) return "DISCARD_RECTANGLE_EXT";
        if(getValue() == SAMPLE_LOCATIONS_EXT) return "SAMPLE_LOCATIONS_EXT";
        return "UNKNOWN";
    }
}
