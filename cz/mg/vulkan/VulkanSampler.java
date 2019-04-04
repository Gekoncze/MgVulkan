package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSampler.html">khronos documentation</a>
 **/
public class VulkanSampler extends VulkanHandle {
    public VulkanSampler(){
        super(new VkSampler());
    }

    public VulkanSampler(VkSampler vk){
        super(vk);
    }

    @Override
    public VkSampler getVk(){
        return (VkSampler) super.getVk();
    }

    public VulkanSampler(int value){
        super(new VkSampler(value));
    }

    public static class Array extends VulkanSampler implements cz.mg.collections.array.ReadonlyArray<VulkanSampler> {
        public Array(VkSampler.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSampler.Array(count));
        }

        public Array(int count, VulkanSampler o){
            this(new VkSampler.Array(count, o.getVk()));
        }

        @Override
        public VkSampler.Array getVk(){
            return (VkSampler.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSampler get(int i){
            return new VulkanSampler(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSampler.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSampler.Pointer());
        }

        public Pointer(long value) {
            this(new VkSampler.Pointer(value));
        }

        @Override
        public VkSampler.Pointer getVk(){
            return (VkSampler.Pointer) super.getVk();
        }

        public static class Array extends VulkanSampler.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSampler.Pointer> {
            public Array(int count) {
                super(new VkSampler.Pointer.Array(count));
            }

            public Array(VulkanSampler[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSampler.Pointer.Array getVk(){
                return (VkSampler.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSampler.Pointer get(int i){
                return new VulkanSampler.Pointer(getVk().get(i));
            }
        }
    }
}
