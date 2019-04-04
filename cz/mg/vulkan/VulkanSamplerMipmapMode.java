package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerMipmapMode.html">khronos documentation</a>
 **/
public class VulkanSamplerMipmapMode extends VulkanEnum {
    public static final int NEAREST = VkSamplerMipmapMode.VK_SAMPLER_MIPMAP_MODE_NEAREST;
    public static final int LINEAR = VkSamplerMipmapMode.VK_SAMPLER_MIPMAP_MODE_LINEAR;

    public VulkanSamplerMipmapMode(){
        super(new VkSamplerMipmapMode());
    }

    public VulkanSamplerMipmapMode(VkSamplerMipmapMode vk){
        super(vk);
    }

    @Override
    public VkSamplerMipmapMode getVk(){
        return (VkSamplerMipmapMode) super.getVk();
    }

    public VulkanSamplerMipmapMode(int value){
        super(new VkSamplerMipmapMode(value));
    }

    @Override
    public String toString() {
        if(getValue() == NEAREST) return "NEAREST";
        if(getValue() == LINEAR) return "LINEAR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanSamplerMipmapMode implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerMipmapMode> {
        public Array(VkSamplerMipmapMode.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerMipmapMode.Array(count));
        }

        public Array(int count, VulkanSamplerMipmapMode o){
            this(new VkSamplerMipmapMode.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerMipmapMode.Array getVk(){
            return (VkSamplerMipmapMode.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerMipmapMode get(int i){
            return new VulkanSamplerMipmapMode(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerMipmapMode.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerMipmapMode.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerMipmapMode.Pointer(value));
        }

        @Override
        public VkSamplerMipmapMode.Pointer getVk(){
            return (VkSamplerMipmapMode.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerMipmapMode.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerMipmapMode.Pointer> {
            public Array(int count) {
                super(new VkSamplerMipmapMode.Pointer.Array(count));
            }

            public Array(VulkanSamplerMipmapMode[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerMipmapMode.Pointer.Array getVk(){
                return (VkSamplerMipmapMode.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerMipmapMode.Pointer get(int i){
                return new VulkanSamplerMipmapMode.Pointer(getVk().get(i));
            }
        }
    }
}
