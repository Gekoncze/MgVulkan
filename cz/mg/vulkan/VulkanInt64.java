package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanInt64 extends VulkanObject {
    public VulkanInt64(){
        super(new VkInt64());
    }

    public VulkanInt64(VkInt64 vk){
        super(vk);
    }

    @Override
    public VkInt64 getVk(){
        return (VkInt64) super.getVk();
    }

    public VulkanInt64(long value){
        super(new VkInt64(value));
    }

    public long getValue(){
        return getVk().getValue();
    }

    public void setValue(long value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanInt64 implements cz.mg.collections.array.ReadonlyArray<VulkanInt64> {
        public Array(VkInt64.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkInt64.Array(count));
        }

        public Array(int count, VulkanInt64 o){
            this(new VkInt64.Array(count, o.getVk()));
        }

        @Override
        public VkInt64.Array getVk(){
            return (VkInt64.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInt64 get(int i){
            return new VulkanInt64(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkInt64.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkInt64.Pointer());
        }

        public Pointer(long value) {
            this(new VkInt64.Pointer(value));
        }

        @Override
        public VkInt64.Pointer getVk(){
            return (VkInt64.Pointer) super.getVk();
        }

        public static class Array extends VulkanInt64.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanInt64.Pointer> {
            public Array(int count) {
                super(new VkInt64.Pointer.Array(count));
            }

            public Array(VulkanInt64[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkInt64.Pointer.Array getVk(){
                return (VkInt64.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanInt64.Pointer get(int i){
                return new VulkanInt64.Pointer(getVk().get(i));
            }
        }
    }
}
