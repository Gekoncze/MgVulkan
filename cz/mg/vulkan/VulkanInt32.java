package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanInt32 extends VulkanObject {
    public VulkanInt32(){
        super(new VkInt32());
    }

    public VulkanInt32(VkInt32 vk){
        super(vk);
    }

    @Override
    public VkInt32 getVk(){
        return (VkInt32) super.getVk();
    }

    public VulkanInt32(int value){
        super(new VkInt32(value));
    }

    public int getValue(){
        return getVk().getValue();
    }

    public void setValue(int value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanInt32 implements cz.mg.collections.array.ReadonlyArray<VulkanInt32> {
        public Array(VkInt32.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkInt32.Array(count));
        }

        public Array(int count, VulkanInt32 o){
            this(new VkInt32.Array(count, o.getVk()));
        }

        @Override
        public VkInt32.Array getVk(){
            return (VkInt32.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInt32 get(int i){
            return new VulkanInt32(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkInt32.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkInt32.Pointer());
        }

        public Pointer(long value) {
            this(new VkInt32.Pointer(value));
        }

        @Override
        public VkInt32.Pointer getVk(){
            return (VkInt32.Pointer) super.getVk();
        }

        public static class Array extends VulkanInt32.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanInt32.Pointer> {
            public Array(int count) {
                super(new VkInt32.Pointer.Array(count));
            }

            public Array(VulkanInt32[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkInt32.Pointer.Array getVk(){
                return (VkInt32.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanInt32.Pointer get(int i){
                return new VulkanInt32.Pointer(getVk().get(i));
            }
        }
    }
}
