package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerReductionModeEXT.html">khronos documentation</a>
 **/
public class VulkanSamplerReductionModeEXT extends VulkanEnum {
    public static final int SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT = VkSamplerReductionModeEXT.VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT;
    public static final int SAMPLER_REDUCTION_MODE_MIN_EXT = VkSamplerReductionModeEXT.VK_SAMPLER_REDUCTION_MODE_MIN_EXT;
    public static final int SAMPLER_REDUCTION_MODE_MAX_EXT = VkSamplerReductionModeEXT.VK_SAMPLER_REDUCTION_MODE_MAX_EXT;

    public VulkanSamplerReductionModeEXT(){
        super(new VkSamplerReductionModeEXT());
    }

    public VulkanSamplerReductionModeEXT(VkSamplerReductionModeEXT vk){
        super(vk);
    }

    @Override
    public VkSamplerReductionModeEXT getVk(){
        return (VkSamplerReductionModeEXT) super.getVk();
    }

    public VulkanSamplerReductionModeEXT(int value){
        super(new VkSamplerReductionModeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT) return "SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT";
        if(getValue() == SAMPLER_REDUCTION_MODE_MIN_EXT) return "SAMPLER_REDUCTION_MODE_MIN_EXT";
        if(getValue() == SAMPLER_REDUCTION_MODE_MAX_EXT) return "SAMPLER_REDUCTION_MODE_MAX_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanSamplerReductionModeEXT implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerReductionModeEXT> {
        public Array(VkSamplerReductionModeEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerReductionModeEXT.Array(count));
        }

        public Array(int count, VulkanSamplerReductionModeEXT o){
            this(new VkSamplerReductionModeEXT.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerReductionModeEXT.Array getVk(){
            return (VkSamplerReductionModeEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerReductionModeEXT get(int i){
            return new VulkanSamplerReductionModeEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerReductionModeEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerReductionModeEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerReductionModeEXT.Pointer(value));
        }

        @Override
        public VkSamplerReductionModeEXT.Pointer getVk(){
            return (VkSamplerReductionModeEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerReductionModeEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerReductionModeEXT.Pointer> {
            public Array(int count) {
                super(new VkSamplerReductionModeEXT.Pointer.Array(count));
            }

            public Array(VulkanSamplerReductionModeEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerReductionModeEXT.Pointer.Array getVk(){
                return (VkSamplerReductionModeEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerReductionModeEXT.Pointer get(int i){
                return new VulkanSamplerReductionModeEXT.Pointer(getVk().get(i));
            }
        }
    }
}
