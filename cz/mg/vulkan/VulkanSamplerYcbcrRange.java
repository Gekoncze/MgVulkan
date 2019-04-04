package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerYcbcrRange.html">khronos documentation</a>
 **/
public class VulkanSamplerYcbcrRange extends VulkanEnum {
    public static final int ITU_FULL = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL;
    public static final int ITU_NARROW = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW;
    public static final int ITU_FULL_KHR = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR;
    public static final int ITU_NARROW_KHR = VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR;

    public VulkanSamplerYcbcrRange(){
        super(new VkSamplerYcbcrRange());
    }

    public VulkanSamplerYcbcrRange(VkSamplerYcbcrRange vk){
        super(vk);
    }

    @Override
    public VkSamplerYcbcrRange getVk(){
        return (VkSamplerYcbcrRange) super.getVk();
    }

    public VulkanSamplerYcbcrRange(int value){
        super(new VkSamplerYcbcrRange(value));
    }

    @Override
    public String toString() {
        if(getValue() == ITU_FULL) return "ITU_FULL";
        if(getValue() == ITU_NARROW) return "ITU_NARROW";
        if(getValue() == ITU_FULL_KHR) return "ITU_FULL_KHR";
        if(getValue() == ITU_NARROW_KHR) return "ITU_NARROW_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanSamplerYcbcrRange implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrRange> {
        public Array(VkSamplerYcbcrRange.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerYcbcrRange.Array(count));
        }

        public Array(int count, VulkanSamplerYcbcrRange o){
            this(new VkSamplerYcbcrRange.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerYcbcrRange.Array getVk(){
            return (VkSamplerYcbcrRange.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerYcbcrRange get(int i){
            return new VulkanSamplerYcbcrRange(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerYcbcrRange.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerYcbcrRange.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerYcbcrRange.Pointer(value));
        }

        @Override
        public VkSamplerYcbcrRange.Pointer getVk(){
            return (VkSamplerYcbcrRange.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerYcbcrRange.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrRange.Pointer> {
            public Array(int count) {
                super(new VkSamplerYcbcrRange.Pointer.Array(count));
            }

            public Array(VulkanSamplerYcbcrRange[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerYcbcrRange.Pointer.Array getVk(){
                return (VkSamplerYcbcrRange.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerYcbcrRange.Pointer get(int i){
                return new VulkanSamplerYcbcrRange.Pointer(getVk().get(i));
            }
        }
    }
}
