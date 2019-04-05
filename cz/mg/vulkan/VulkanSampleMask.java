package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSampleMask extends VulkanUInt32 {
    public VulkanSampleMask(){
        super(new VkSampleMask());
    }

    public VulkanSampleMask(VkSampleMask vk){
        super(vk);
    }

    @Override
    public VkSampleMask getVk(){
        return (VkSampleMask) super.getVk();
    }

    public VulkanSampleMask(int value){
        super(new VkSampleMask(value));
    }

    public static class Array extends VulkanSampleMask implements cz.mg.collections.array.ReadonlyArray<VulkanSampleMask> {
        public Array(VkSampleMask.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSampleMask.Array(count));
        }

        public Array(int count, VulkanSampleMask o){
            this(new VkSampleMask.Array(count, o.getVk()));
        }

        @Override
        public VkSampleMask.Array getVk(){
            return (VkSampleMask.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSampleMask get(int i){
            return new VulkanSampleMask(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSampleMask.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSampleMask.Pointer());
        }

        public Pointer(long value) {
            this(new VkSampleMask.Pointer(value));
        }

        @Override
        public VkSampleMask.Pointer getVk(){
            return (VkSampleMask.Pointer) super.getVk();
        }

        public static class Array extends VulkanSampleMask.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSampleMask.Pointer> {
            public Array(int count) {
                super(new VkSampleMask.Pointer.Array(count));
            }

            public Array(VulkanSampleMask[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSampleMask.Pointer.Array getVk(){
                return (VkSampleMask.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSampleMask.Pointer get(int i){
                return new VulkanSampleMask.Pointer(getVk().get(i));
            }
        }
    }
}
