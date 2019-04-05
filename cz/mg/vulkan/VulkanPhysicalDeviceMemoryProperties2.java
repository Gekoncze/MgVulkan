package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceMemoryProperties2 extends VulkanObject {
    public VulkanPhysicalDeviceMemoryProperties2(){
        super(new VkPhysicalDeviceMemoryProperties2());
    }

    public VulkanPhysicalDeviceMemoryProperties2(VkPhysicalDeviceMemoryProperties2 vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceMemoryProperties2 getVk(){
        return (VkPhysicalDeviceMemoryProperties2) super.getVk();
    }

    public VulkanPhysicalDeviceMemoryProperties2(VulkanStructureType sType, VulkanObject pNext, VulkanPhysicalDeviceMemoryProperties memoryProperties) {
        super(new VkPhysicalDeviceMemoryProperties2(sType.getVk(), pNext.getVk(), memoryProperties.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanPhysicalDeviceMemoryProperties getMemoryProperties() {
        return new VulkanPhysicalDeviceMemoryProperties(getVk().getMemoryProperties());
    }

    public void setMemoryProperties(VulkanPhysicalDeviceMemoryProperties memoryProperties) {
        getVk().setMemoryProperties(memoryProperties.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceMemoryProperties2 implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMemoryProperties2> {
        public Array(VkPhysicalDeviceMemoryProperties2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceMemoryProperties2.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceMemoryProperties2 o){
            this(new VkPhysicalDeviceMemoryProperties2.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceMemoryProperties2.Array getVk(){
            return (VkPhysicalDeviceMemoryProperties2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceMemoryProperties2 get(int i){
            return new VulkanPhysicalDeviceMemoryProperties2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceMemoryProperties2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceMemoryProperties2.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceMemoryProperties2.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceMemoryProperties2.Pointer getVk(){
            return (VkPhysicalDeviceMemoryProperties2.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceMemoryProperties2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMemoryProperties2.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceMemoryProperties2.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceMemoryProperties2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceMemoryProperties2.Pointer.Array getVk(){
                return (VkPhysicalDeviceMemoryProperties2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceMemoryProperties2.Pointer get(int i){
                return new VulkanPhysicalDeviceMemoryProperties2.Pointer(getVk().get(i));
            }
        }
    }
}
