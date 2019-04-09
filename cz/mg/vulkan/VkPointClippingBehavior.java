package cz.mg.vulkan;

public class VkPointClippingBehavior extends VkEnum {
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES = 0;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = 1;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR = VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR = VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY;

    public VkPointClippingBehavior() {
    }

    public VkPointClippingBehavior(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPointClippingBehavior(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPointClippingBehavior(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES) return "VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY) return "VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR) return "VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR) return "VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR";
        return "UNKNOWN";
    }
}
