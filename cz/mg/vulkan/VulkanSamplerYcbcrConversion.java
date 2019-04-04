package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerYcbcrConversion.html">khronos documentation</a>
 **/
public class VulkanSamplerYcbcrConversion extends VulkanHandle {
    public VulkanSamplerYcbcrConversion(){
        super(new VkSamplerYcbcrConversion());
    }

    public VulkanSamplerYcbcrConversion(VkSamplerYcbcrConversion vk){
        super(vk);
    }

    @Override
    public VkSamplerYcbcrConversion getVk(){
        return (VkSamplerYcbcrConversion) super.getVk();
    }

    public VulkanSamplerYcbcrConversion(int value){
        super(new VkSamplerYcbcrConversion(value));
    }

    public static class Array extends VulkanSamplerYcbcrConversion implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrConversion> {
        public Array(VkSamplerYcbcrConversion.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerYcbcrConversion.Array(count));
        }

        public Array(int count, VulkanSamplerYcbcrConversion o){
            this(new VkSamplerYcbcrConversion.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerYcbcrConversion.Array getVk(){
            return (VkSamplerYcbcrConversion.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerYcbcrConversion get(int i){
            return new VulkanSamplerYcbcrConversion(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerYcbcrConversion.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerYcbcrConversion.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerYcbcrConversion.Pointer(value));
        }

        @Override
        public VkSamplerYcbcrConversion.Pointer getVk(){
            return (VkSamplerYcbcrConversion.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerYcbcrConversion.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrConversion.Pointer> {
            public Array(int count) {
                super(new VkSamplerYcbcrConversion.Pointer.Array(count));
            }

            public Array(VulkanSamplerYcbcrConversion[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerYcbcrConversion.Pointer.Array getVk(){
                return (VkSamplerYcbcrConversion.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerYcbcrConversion.Pointer get(int i){
                return new VulkanSamplerYcbcrConversion.Pointer(getVk().get(i));
            }
        }
    }
}
