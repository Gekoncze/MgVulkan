package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanInt8 extends VulkanObject {
    public VulkanInt8(){
        super(new VkInt8());
    }

    public VulkanInt8(VkInt8 vk){
        super(vk);
    }

    @Override
    public VkInt8 getVk(){
        return (VkInt8) super.getVk();
    }

    public VulkanInt8(byte value){
        super(new VkInt8(value));
    }

    public byte getValue(){
        return getVk().getValue();
    }

    public void setValue(byte value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanInt8 implements cz.mg.collections.array.ReadonlyArray<VulkanInt8> {
        public Array(VkInt8.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkInt8.Array(count));
        }

        public Array(int count, VulkanInt8 o){
            this(new VkInt8.Array(count, o.getVk()));
        }

        @Override
        public VkInt8.Array getVk(){
            return (VkInt8.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInt8 get(int i){
            return new VulkanInt8(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkInt8.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkInt8.Pointer());
        }

        public Pointer(long value) {
            this(new VkInt8.Pointer(value));
        }

        @Override
        public VkInt8.Pointer getVk(){
            return (VkInt8.Pointer) super.getVk();
        }

        public static class Array extends VulkanInt8.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanInt8.Pointer> {
            public Array(int count) {
                super(new VkInt8.Pointer.Array(count));
            }

            public Array(VulkanInt8[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkInt8.Pointer.Array getVk(){
                return (VkInt8.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanInt8.Pointer get(int i){
                return new VulkanInt8.Pointer(getVk().get(i));
            }
        }
    }
}
