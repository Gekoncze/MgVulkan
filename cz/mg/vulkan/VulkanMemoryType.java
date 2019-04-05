package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryType extends VulkanObject {
    public VulkanMemoryType(){
        super(new VkMemoryType());
    }

    public VulkanMemoryType(VkMemoryType vk){
        super(vk);
    }

    @Override
    public VkMemoryType getVk(){
        return (VkMemoryType) super.getVk();
    }

    public VulkanMemoryType(VulkanMemoryPropertyFlags propertyFlags, VulkanUInt32 heapIndex) {
        super(new VkMemoryType(propertyFlags.getVk(), heapIndex.getVk()));
    }

    public VulkanMemoryPropertyFlags getPropertyFlags() {
        return new VulkanMemoryPropertyFlags(getVk().getPropertyFlags());
    }

    public void setPropertyFlags(VulkanMemoryPropertyFlags propertyFlags) {
        getVk().setPropertyFlags(propertyFlags.getVk());
    }

    public VulkanUInt32 getHeapIndex() {
        return new VulkanUInt32(getVk().getHeapIndex());
    }

    public void setHeapIndex(VulkanUInt32 heapIndex) {
        getVk().setHeapIndex(heapIndex.getVk());
    }


    public static class Array extends VulkanMemoryType implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryType> {
        public Array(VkMemoryType.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryType.Array(count));
        }

        public Array(int count, VulkanMemoryType o){
            this(new VkMemoryType.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryType.Array getVk(){
            return (VkMemoryType.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryType get(int i){
            return new VulkanMemoryType(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryType.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryType.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryType.Pointer(value));
        }

        @Override
        public VkMemoryType.Pointer getVk(){
            return (VkMemoryType.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryType.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryType.Pointer> {
            public Array(int count) {
                super(new VkMemoryType.Pointer.Array(count));
            }

            public Array(VulkanMemoryType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryType.Pointer.Array getVk(){
                return (VkMemoryType.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryType.Pointer get(int i){
                return new VulkanMemoryType.Pointer(getVk().get(i));
            }
        }
    }
}
