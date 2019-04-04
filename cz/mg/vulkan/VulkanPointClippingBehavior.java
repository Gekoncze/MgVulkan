package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPointClippingBehavior.html">khronos documentation</a>
 **/
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

    public static class Array extends VulkanPointClippingBehavior implements cz.mg.collections.array.ReadonlyArray<VulkanPointClippingBehavior> {
        public Array(VkPointClippingBehavior.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPointClippingBehavior.Array(count));
        }

        public Array(int count, VulkanPointClippingBehavior o){
            this(new VkPointClippingBehavior.Array(count, o.getVk()));
        }

        @Override
        public VkPointClippingBehavior.Array getVk(){
            return (VkPointClippingBehavior.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPointClippingBehavior get(int i){
            return new VulkanPointClippingBehavior(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPointClippingBehavior.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPointClippingBehavior.Pointer());
        }

        public Pointer(long value) {
            this(new VkPointClippingBehavior.Pointer(value));
        }

        @Override
        public VkPointClippingBehavior.Pointer getVk(){
            return (VkPointClippingBehavior.Pointer) super.getVk();
        }

        public static class Array extends VulkanPointClippingBehavior.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPointClippingBehavior.Pointer> {
            public Array(int count) {
                super(new VkPointClippingBehavior.Pointer.Array(count));
            }

            public Array(VulkanPointClippingBehavior[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPointClippingBehavior.Pointer.Array getVk(){
                return (VkPointClippingBehavior.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPointClippingBehavior.Pointer get(int i){
                return new VulkanPointClippingBehavior.Pointer(getVk().get(i));
            }
        }
    }
}
