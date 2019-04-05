package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceProperties2 extends VulkanObject {
    public VulkanPhysicalDeviceProperties2(){
        super(new VkPhysicalDeviceProperties2());
    }

    public VulkanPhysicalDeviceProperties2(VkPhysicalDeviceProperties2 vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceProperties2 getVk(){
        return (VkPhysicalDeviceProperties2) super.getVk();
    }

    public VulkanPhysicalDeviceProperties2(VulkanStructureType sType, VulkanObject pNext, VulkanPhysicalDeviceProperties properties) {
        super(new VkPhysicalDeviceProperties2(sType.getVk(), pNext.getVk(), properties.getVk()));
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

    public VulkanPhysicalDeviceProperties getProperties() {
        return new VulkanPhysicalDeviceProperties(getVk().getProperties());
    }

    public void setProperties(VulkanPhysicalDeviceProperties properties) {
        getVk().setProperties(properties.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceProperties2 implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceProperties2> {
        public Array(VkPhysicalDeviceProperties2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceProperties2.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceProperties2 o){
            this(new VkPhysicalDeviceProperties2.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceProperties2.Array getVk(){
            return (VkPhysicalDeviceProperties2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceProperties2 get(int i){
            return new VulkanPhysicalDeviceProperties2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceProperties2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceProperties2.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceProperties2.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceProperties2.Pointer getVk(){
            return (VkPhysicalDeviceProperties2.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceProperties2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceProperties2.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceProperties2.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceProperties2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceProperties2.Pointer.Array getVk(){
                return (VkPhysicalDeviceProperties2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceProperties2.Pointer get(int i){
                return new VulkanPhysicalDeviceProperties2.Pointer(getVk().get(i));
            }
        }
    }
}
