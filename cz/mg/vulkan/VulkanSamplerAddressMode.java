package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerAddressMode.html">khronos documentation</a>
 **/
public class VulkanSamplerAddressMode extends VulkanEnum {
    public static final int REPEAT = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_REPEAT;
    public static final int MIRRORED_REPEAT = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT;
    public static final int CLAMP_TO_EDGE = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE;
    public static final int CLAMP_TO_BORDER = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER;
    public static final int MIRROR_CLAMP_TO_EDGE = VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE;

    public VulkanSamplerAddressMode(){
        super(new VkSamplerAddressMode());
    }

    public VulkanSamplerAddressMode(VkSamplerAddressMode vk){
        super(vk);
    }

    @Override
    public VkSamplerAddressMode getVk(){
        return (VkSamplerAddressMode) super.getVk();
    }

    public VulkanSamplerAddressMode(int value){
        super(new VkSamplerAddressMode(value));
    }

    @Override
    public String toString() {
        if(getValue() == REPEAT) return "REPEAT";
        if(getValue() == MIRRORED_REPEAT) return "MIRRORED_REPEAT";
        if(getValue() == CLAMP_TO_EDGE) return "CLAMP_TO_EDGE";
        if(getValue() == CLAMP_TO_BORDER) return "CLAMP_TO_BORDER";
        if(getValue() == MIRROR_CLAMP_TO_EDGE) return "MIRROR_CLAMP_TO_EDGE";
        return "UNKNOWN";
    }

    public static class Array extends VulkanSamplerAddressMode implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerAddressMode> {
        public Array(VkSamplerAddressMode.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerAddressMode.Array(count));
        }

        public Array(int count, VulkanSamplerAddressMode o){
            this(new VkSamplerAddressMode.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerAddressMode.Array getVk(){
            return (VkSamplerAddressMode.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerAddressMode get(int i){
            return new VulkanSamplerAddressMode(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerAddressMode.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerAddressMode.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerAddressMode.Pointer(value));
        }

        @Override
        public VkSamplerAddressMode.Pointer getVk(){
            return (VkSamplerAddressMode.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerAddressMode.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerAddressMode.Pointer> {
            public Array(int count) {
                super(new VkSamplerAddressMode.Pointer.Array(count));
            }

            public Array(VulkanSamplerAddressMode[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerAddressMode.Pointer.Array getVk(){
                return (VkSamplerAddressMode.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerAddressMode.Pointer get(int i){
                return new VulkanSamplerAddressMode.Pointer(getVk().get(i));
            }
        }
    }
}
