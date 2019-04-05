package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanEnum extends VulkanInt32 {
    public VulkanEnum(){
        super(new VkEnum());
    }

    public VulkanEnum(VkEnum vk){
        super(vk);
    }

    @Override
    public VkEnum getVk(){
        return (VkEnum) super.getVk();
    }

    public VulkanEnum(int value){
        super(new VkEnum(value));
    }

    public static class Array extends VulkanEnum implements cz.mg.collections.array.ReadonlyArray<VulkanEnum> {
        public Array(VkEnum.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkEnum.Array(count));
        }

        public Array(int count, VulkanEnum o){
            this(new VkEnum.Array(count, o.getVk()));
        }

        @Override
        public VkEnum.Array getVk(){
            return (VkEnum.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanEnum get(int i){
            return new VulkanEnum(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkEnum.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkEnum.Pointer());
        }

        public Pointer(long value) {
            this(new VkEnum.Pointer(value));
        }

        @Override
        public VkEnum.Pointer getVk(){
            return (VkEnum.Pointer) super.getVk();
        }

        public static class Array extends VulkanEnum.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanEnum.Pointer> {
            public Array(int count) {
                super(new VkEnum.Pointer.Array(count));
            }

            public Array(VulkanEnum[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkEnum.Pointer.Array getVk(){
                return (VkEnum.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanEnum.Pointer get(int i){
                return new VulkanEnum.Pointer(getVk().get(i));
            }
        }
    }
}
