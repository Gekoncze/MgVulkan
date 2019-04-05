package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceGroupProperties extends VulkanObject {
    public VulkanPhysicalDeviceGroupProperties(){
        super(new VkPhysicalDeviceGroupProperties());
    }

    public VulkanPhysicalDeviceGroupProperties(VkPhysicalDeviceGroupProperties vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceGroupProperties getVk(){
        return (VkPhysicalDeviceGroupProperties) super.getVk();
    }

    public VulkanPhysicalDeviceGroupProperties(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 physicalDeviceCount, VulkanPhysicalDevice physicalDevices, VulkanBool32 subsetAllocation) {
        super(new VkPhysicalDeviceGroupProperties(sType.getVk(), pNext.getVk(), physicalDeviceCount.getVk(), physicalDevices.getVk(), subsetAllocation.getVk()));
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

    public VulkanUInt32 getPhysicalDeviceCount() {
        return new VulkanUInt32(getVk().getPhysicalDeviceCount());
    }

    public void setPhysicalDeviceCount(VulkanUInt32 physicalDeviceCount) {
        getVk().setPhysicalDeviceCount(physicalDeviceCount.getVk());
    }

    public VulkanPhysicalDevice getPhysicalDevices() {
        return new VulkanPhysicalDevice(getVk().getPhysicalDevices());
    }

    public void setPhysicalDevices(VulkanPhysicalDevice physicalDevices) {
        getVk().setPhysicalDevices(physicalDevices.getVk());
    }

    public VulkanBool32 getSubsetAllocation() {
        return new VulkanBool32(getVk().getSubsetAllocation());
    }

    public void setSubsetAllocation(VulkanBool32 subsetAllocation) {
        getVk().setSubsetAllocation(subsetAllocation.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceGroupProperties implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceGroupProperties> {
        public Array(VkPhysicalDeviceGroupProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceGroupProperties.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceGroupProperties o){
            this(new VkPhysicalDeviceGroupProperties.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceGroupProperties.Array getVk(){
            return (VkPhysicalDeviceGroupProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceGroupProperties get(int i){
            return new VulkanPhysicalDeviceGroupProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceGroupProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceGroupProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceGroupProperties.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceGroupProperties.Pointer getVk(){
            return (VkPhysicalDeviceGroupProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceGroupProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceGroupProperties.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceGroupProperties.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceGroupProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceGroupProperties.Pointer.Array getVk(){
                return (VkPhysicalDeviceGroupProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceGroupProperties.Pointer get(int i){
                return new VulkanPhysicalDeviceGroupProperties.Pointer(getVk().get(i));
            }
        }
    }
}
