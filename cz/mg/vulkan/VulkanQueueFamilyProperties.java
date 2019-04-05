package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanQueueFamilyProperties extends VulkanObject {
    public VulkanQueueFamilyProperties(){
        super(new VkQueueFamilyProperties());
    }

    public VulkanQueueFamilyProperties(VkQueueFamilyProperties vk){
        super(vk);
    }

    @Override
    public VkQueueFamilyProperties getVk(){
        return (VkQueueFamilyProperties) super.getVk();
    }

    public VulkanQueueFamilyProperties(VulkanQueueFlags queueFlags, VulkanUInt32 queueCount, VulkanUInt32 timestampValidBits, VulkanExtent3D minImageTransferGranularity) {
        super(new VkQueueFamilyProperties(queueFlags.getVk(), queueCount.getVk(), timestampValidBits.getVk(), minImageTransferGranularity.getVk()));
    }

    public VulkanQueueFlags getQueueFlags() {
        return new VulkanQueueFlags(getVk().getQueueFlags());
    }

    public void setQueueFlags(VulkanQueueFlags queueFlags) {
        getVk().setQueueFlags(queueFlags.getVk());
    }

    public VulkanUInt32 getQueueCount() {
        return new VulkanUInt32(getVk().getQueueCount());
    }

    public void setQueueCount(VulkanUInt32 queueCount) {
        getVk().setQueueCount(queueCount.getVk());
    }

    public VulkanUInt32 getTimestampValidBits() {
        return new VulkanUInt32(getVk().getTimestampValidBits());
    }

    public void setTimestampValidBits(VulkanUInt32 timestampValidBits) {
        getVk().setTimestampValidBits(timestampValidBits.getVk());
    }

    public VulkanExtent3D getMinImageTransferGranularity() {
        return new VulkanExtent3D(getVk().getMinImageTransferGranularity());
    }

    public void setMinImageTransferGranularity(VulkanExtent3D minImageTransferGranularity) {
        getVk().setMinImageTransferGranularity(minImageTransferGranularity.getVk());
    }


    public static class Array extends VulkanQueueFamilyProperties implements cz.mg.collections.array.ReadonlyArray<VulkanQueueFamilyProperties> {
        public Array(VkQueueFamilyProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueueFamilyProperties.Array(count));
        }

        public Array(int count, VulkanQueueFamilyProperties o){
            this(new VkQueueFamilyProperties.Array(count, o.getVk()));
        }

        @Override
        public VkQueueFamilyProperties.Array getVk(){
            return (VkQueueFamilyProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueueFamilyProperties get(int i){
            return new VulkanQueueFamilyProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueueFamilyProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueueFamilyProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueueFamilyProperties.Pointer(value));
        }

        @Override
        public VkQueueFamilyProperties.Pointer getVk(){
            return (VkQueueFamilyProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueueFamilyProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueueFamilyProperties.Pointer> {
            public Array(int count) {
                super(new VkQueueFamilyProperties.Pointer.Array(count));
            }

            public Array(VulkanQueueFamilyProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueueFamilyProperties.Pointer.Array getVk(){
                return (VkQueueFamilyProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueueFamilyProperties.Pointer get(int i){
                return new VulkanQueueFamilyProperties.Pointer(getVk().get(i));
            }
        }
    }
}
