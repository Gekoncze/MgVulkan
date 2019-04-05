package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceMemoryProperties extends VulkanObject {
    public VulkanPhysicalDeviceMemoryProperties(){
        super(new VkPhysicalDeviceMemoryProperties());
    }

    public VulkanPhysicalDeviceMemoryProperties(VkPhysicalDeviceMemoryProperties vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceMemoryProperties getVk(){
        return (VkPhysicalDeviceMemoryProperties) super.getVk();
    }

    public VulkanPhysicalDeviceMemoryProperties(VulkanUInt32 memoryTypeCount, VulkanMemoryType memoryTypes, VulkanUInt32 memoryHeapCount, VulkanMemoryHeap memoryHeaps) {
        super(new VkPhysicalDeviceMemoryProperties(memoryTypeCount.getVk(), memoryTypes.getVk(), memoryHeapCount.getVk(), memoryHeaps.getVk()));
    }

    public VulkanUInt32 getMemoryTypeCount() {
        return new VulkanUInt32(getVk().getMemoryTypeCount());
    }

    public void setMemoryTypeCount(VulkanUInt32 memoryTypeCount) {
        getVk().setMemoryTypeCount(memoryTypeCount.getVk());
    }

    public VulkanMemoryType getMemoryTypes() {
        return new VulkanMemoryType(getVk().getMemoryTypes());
    }

    public void setMemoryTypes(VulkanMemoryType memoryTypes) {
        getVk().setMemoryTypes(memoryTypes.getVk());
    }

    public VulkanUInt32 getMemoryHeapCount() {
        return new VulkanUInt32(getVk().getMemoryHeapCount());
    }

    public void setMemoryHeapCount(VulkanUInt32 memoryHeapCount) {
        getVk().setMemoryHeapCount(memoryHeapCount.getVk());
    }

    public VulkanMemoryHeap getMemoryHeaps() {
        return new VulkanMemoryHeap(getVk().getMemoryHeaps());
    }

    public void setMemoryHeaps(VulkanMemoryHeap memoryHeaps) {
        getVk().setMemoryHeaps(memoryHeaps.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceMemoryProperties implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMemoryProperties> {
        public Array(VkPhysicalDeviceMemoryProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceMemoryProperties.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceMemoryProperties o){
            this(new VkPhysicalDeviceMemoryProperties.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceMemoryProperties.Array getVk(){
            return (VkPhysicalDeviceMemoryProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceMemoryProperties get(int i){
            return new VulkanPhysicalDeviceMemoryProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceMemoryProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceMemoryProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceMemoryProperties.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceMemoryProperties.Pointer getVk(){
            return (VkPhysicalDeviceMemoryProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceMemoryProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMemoryProperties.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceMemoryProperties.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceMemoryProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceMemoryProperties.Pointer.Array getVk(){
                return (VkPhysicalDeviceMemoryProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceMemoryProperties.Pointer get(int i){
                return new VulkanPhysicalDeviceMemoryProperties.Pointer(getVk().get(i));
            }
        }
    }
}
