package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceSize extends VulkanUInt64 {
    public VulkanDeviceSize(){
        super(new VkDeviceSize());
    }

    public VulkanDeviceSize(VkDeviceSize vk){
        super(vk);
    }

    @Override
    public VkDeviceSize getVk(){
        return (VkDeviceSize) super.getVk();
    }

    public VulkanDeviceSize(long value){
        super(new VkDeviceSize(value));
    }

    public static class Array extends VulkanDeviceSize implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceSize> {
        public Array(VkDeviceSize.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceSize.Array(count));
        }

        public Array(int count, VulkanDeviceSize o){
            this(new VkDeviceSize.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceSize.Array getVk(){
            return (VkDeviceSize.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceSize get(int i){
            return new VulkanDeviceSize(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceSize.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceSize.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceSize.Pointer(value));
        }

        @Override
        public VkDeviceSize.Pointer getVk(){
            return (VkDeviceSize.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceSize.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceSize.Pointer> {
            public Array(int count) {
                super(new VkDeviceSize.Pointer.Array(count));
            }

            public Array(VulkanDeviceSize[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceSize.Pointer.Array getVk(){
                return (VkDeviceSize.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceSize.Pointer get(int i){
                return new VulkanDeviceSize.Pointer(getVk().get(i));
            }
        }
    }
}
