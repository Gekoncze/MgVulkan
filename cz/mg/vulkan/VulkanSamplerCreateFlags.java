package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerCreateFlags.html">khronos documentation</a>
 **/
public class VulkanSamplerCreateFlags extends VulkanFlags {
    public VulkanSamplerCreateFlags(){
        super(new VkSamplerCreateFlags());
    }

    public VulkanSamplerCreateFlags(VkSamplerCreateFlags vk){
        super(vk);
    }

    @Override
    public VkSamplerCreateFlags getVk(){
        return (VkSamplerCreateFlags) super.getVk();
    }

    public VulkanSamplerCreateFlags(int value){
        super(new VkSamplerCreateFlags(value));
    }

    public static class Array extends VulkanSamplerCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerCreateFlags> {
        public Array(VkSamplerCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerCreateFlags.Array(count));
        }

        public Array(int count, VulkanSamplerCreateFlags o){
            this(new VkSamplerCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerCreateFlags.Array getVk(){
            return (VkSamplerCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerCreateFlags get(int i){
            return new VulkanSamplerCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerCreateFlags.Pointer(value));
        }

        @Override
        public VkSamplerCreateFlags.Pointer getVk(){
            return (VkSamplerCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkSamplerCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanSamplerCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerCreateFlags.Pointer.Array getVk(){
                return (VkSamplerCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerCreateFlags.Pointer get(int i){
                return new VulkanSamplerCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
