package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanFlagBits extends VulkanInt32 {
    public VulkanFlagBits(){
        super(new VkFlagBits());
    }

    public VulkanFlagBits(VkFlagBits vk){
        super(vk);
    }

    @Override
    public VkFlagBits getVk(){
        return (VkFlagBits) super.getVk();
    }

    public VulkanFlagBits(int value){
        super(new VkFlagBits(value));
    }

    public static class Array extends VulkanFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanFlagBits> {
        public Array(VkFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFlagBits.Array(count));
        }

        public Array(int count, VulkanFlagBits o){
            this(new VkFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkFlagBits.Array getVk(){
            return (VkFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFlagBits get(int i){
            return new VulkanFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkFlagBits.Pointer(value));
        }

        @Override
        public VkFlagBits.Pointer getVk(){
            return (VkFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFlagBits.Pointer> {
            public Array(int count) {
                super(new VkFlagBits.Pointer.Array(count));
            }

            public Array(VulkanFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFlagBits.Pointer.Array getVk(){
                return (VkFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFlagBits.Pointer get(int i){
                return new VulkanFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
