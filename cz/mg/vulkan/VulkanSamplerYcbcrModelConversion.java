package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerYcbcrModelConversion.html">khronos documentation</a>
 **/
public class VulkanSamplerYcbcrModelConversion extends VulkanEnum {
    public static final int RGB_IDENTITY = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY;
    public static final int YCBCR_IDENTITY = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY;
    public static final int YCBCR_709 = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709;
    public static final int YCBCR_601 = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601;
    public static final int YCBCR_2020 = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020;
    public static final int RGB_IDENTITY_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR;
    public static final int YCBCR_IDENTITY_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR;
    public static final int YCBCR_709_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR;
    public static final int YCBCR_601_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR;
    public static final int YCBCR_2020_KHR = VkSamplerYcbcrModelConversion.VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR;

    public VulkanSamplerYcbcrModelConversion(){
        super(new VkSamplerYcbcrModelConversion());
    }

    public VulkanSamplerYcbcrModelConversion(VkSamplerYcbcrModelConversion vk){
        super(vk);
    }

    @Override
    public VkSamplerYcbcrModelConversion getVk(){
        return (VkSamplerYcbcrModelConversion) super.getVk();
    }

    public VulkanSamplerYcbcrModelConversion(int value){
        super(new VkSamplerYcbcrModelConversion(value));
    }

    @Override
    public String toString() {
        if(getValue() == RGB_IDENTITY) return "RGB_IDENTITY";
        if(getValue() == YCBCR_IDENTITY) return "YCBCR_IDENTITY";
        if(getValue() == YCBCR_709) return "YCBCR_709";
        if(getValue() == YCBCR_601) return "YCBCR_601";
        if(getValue() == YCBCR_2020) return "YCBCR_2020";
        if(getValue() == RGB_IDENTITY_KHR) return "RGB_IDENTITY_KHR";
        if(getValue() == YCBCR_IDENTITY_KHR) return "YCBCR_IDENTITY_KHR";
        if(getValue() == YCBCR_709_KHR) return "YCBCR_709_KHR";
        if(getValue() == YCBCR_601_KHR) return "YCBCR_601_KHR";
        if(getValue() == YCBCR_2020_KHR) return "YCBCR_2020_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanSamplerYcbcrModelConversion implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrModelConversion> {
        public Array(VkSamplerYcbcrModelConversion.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerYcbcrModelConversion.Array(count));
        }

        public Array(int count, VulkanSamplerYcbcrModelConversion o){
            this(new VkSamplerYcbcrModelConversion.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerYcbcrModelConversion.Array getVk(){
            return (VkSamplerYcbcrModelConversion.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerYcbcrModelConversion get(int i){
            return new VulkanSamplerYcbcrModelConversion(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerYcbcrModelConversion.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerYcbcrModelConversion.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerYcbcrModelConversion.Pointer(value));
        }

        @Override
        public VkSamplerYcbcrModelConversion.Pointer getVk(){
            return (VkSamplerYcbcrModelConversion.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerYcbcrModelConversion.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrModelConversion.Pointer> {
            public Array(int count) {
                super(new VkSamplerYcbcrModelConversion.Pointer.Array(count));
            }

            public Array(VulkanSamplerYcbcrModelConversion[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerYcbcrModelConversion.Pointer.Array getVk(){
                return (VkSamplerYcbcrModelConversion.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerYcbcrModelConversion.Pointer get(int i){
                return new VulkanSamplerYcbcrModelConversion.Pointer(getVk().get(i));
            }
        }
    }
}
