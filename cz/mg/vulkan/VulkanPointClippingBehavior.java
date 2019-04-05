package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPointClippingBehavior extends VulkanEnum {
    public static final int ALL_CLIP_PLANES = VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES;
    public static final int USER_CLIP_PLANES_ONLY = VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY;
    public static final int ALL_CLIP_PLANES_KHR = VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR;
    public static final int USER_CLIP_PLANES_ONLY_KHR = VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR;

    public VulkanPointClippingBehavior(){
        super(new VkPointClippingBehavior());
    }

    public VulkanPointClippingBehavior(VkPointClippingBehavior vk){
        super(vk);
    }

    @Override
    public VkPointClippingBehavior getVk(){
        return (VkPointClippingBehavior) super.getVk();
    }

    public VulkanPointClippingBehavior(int value){
        super(new VkPointClippingBehavior(value));
    }

    @Override
    public String toString() {
        if(getValue() == ALL_CLIP_PLANES) return "ALL_CLIP_PLANES";
        if(getValue() == USER_CLIP_PLANES_ONLY) return "USER_CLIP_PLANES_ONLY";
        if(getValue() == ALL_CLIP_PLANES_KHR) return "ALL_CLIP_PLANES_KHR";
        if(getValue() == USER_CLIP_PLANES_ONLY_KHR) return "USER_CLIP_PLANES_ONLY_KHR";
        return "UNKNOWN";
    }
}
