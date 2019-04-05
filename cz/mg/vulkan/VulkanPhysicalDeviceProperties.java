package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceProperties extends VulkanObject {
    public VulkanPhysicalDeviceProperties(){
        super(new VkPhysicalDeviceProperties());
    }

    public VulkanPhysicalDeviceProperties(VkPhysicalDeviceProperties vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceProperties getVk(){
        return (VkPhysicalDeviceProperties) super.getVk();
    }

    public VulkanPhysicalDeviceProperties(VulkanUInt32 apiVersion, VulkanUInt32 driverVersion, VulkanUInt32 vendorID, VulkanUInt32 deviceID, VulkanPhysicalDeviceType deviceType, VulkanChar deviceName, VulkanUInt8 pipelineCacheUUID, VulkanPhysicalDeviceLimits limits, VulkanPhysicalDeviceSparseProperties sparseProperties) {
        super(new VkPhysicalDeviceProperties(apiVersion.getVk(), driverVersion.getVk(), vendorID.getVk(), deviceID.getVk(), deviceType.getVk(), deviceName.getVk(), pipelineCacheUUID.getVk(), limits.getVk(), sparseProperties.getVk()));
    }

    public VulkanUInt32 getApiVersion() {
        return new VulkanUInt32(getVk().getApiVersion());
    }

    public void setApiVersion(VulkanUInt32 apiVersion) {
        getVk().setApiVersion(apiVersion.getVk());
    }

    public VulkanUInt32 getDriverVersion() {
        return new VulkanUInt32(getVk().getDriverVersion());
    }

    public void setDriverVersion(VulkanUInt32 driverVersion) {
        getVk().setDriverVersion(driverVersion.getVk());
    }

    public VulkanUInt32 getVendorID() {
        return new VulkanUInt32(getVk().getVendorID());
    }

    public void setVendorID(VulkanUInt32 vendorID) {
        getVk().setVendorID(vendorID.getVk());
    }

    public VulkanUInt32 getDeviceID() {
        return new VulkanUInt32(getVk().getDeviceID());
    }

    public void setDeviceID(VulkanUInt32 deviceID) {
        getVk().setDeviceID(deviceID.getVk());
    }

    public VulkanPhysicalDeviceType getDeviceType() {
        return new VulkanPhysicalDeviceType(getVk().getDeviceType());
    }

    public void setDeviceType(VulkanPhysicalDeviceType deviceType) {
        getVk().setDeviceType(deviceType.getVk());
    }

    public VulkanChar getDeviceName() {
        return new VulkanChar(getVk().getDeviceName());
    }

    public void setDeviceName(VulkanChar deviceName) {
        getVk().setDeviceName(deviceName.getVk());
    }

    public VulkanUInt8 getPipelineCacheUUID() {
        return new VulkanUInt8(getVk().getPipelineCacheUUID());
    }

    public void setPipelineCacheUUID(VulkanUInt8 pipelineCacheUUID) {
        getVk().setPipelineCacheUUID(pipelineCacheUUID.getVk());
    }

    public VulkanPhysicalDeviceLimits getLimits() {
        return new VulkanPhysicalDeviceLimits(getVk().getLimits());
    }

    public void setLimits(VulkanPhysicalDeviceLimits limits) {
        getVk().setLimits(limits.getVk());
    }

    public VulkanPhysicalDeviceSparseProperties getSparseProperties() {
        return new VulkanPhysicalDeviceSparseProperties(getVk().getSparseProperties());
    }

    public void setSparseProperties(VulkanPhysicalDeviceSparseProperties sparseProperties) {
        getVk().setSparseProperties(sparseProperties.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceProperties implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceProperties> {
        public Array(VkPhysicalDeviceProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceProperties.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceProperties o){
            this(new VkPhysicalDeviceProperties.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceProperties.Array getVk(){
            return (VkPhysicalDeviceProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceProperties get(int i){
            return new VulkanPhysicalDeviceProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceProperties.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceProperties.Pointer getVk(){
            return (VkPhysicalDeviceProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceProperties.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceProperties.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceProperties.Pointer.Array getVk(){
                return (VkPhysicalDeviceProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceProperties.Pointer get(int i){
                return new VulkanPhysicalDeviceProperties.Pointer(getVk().get(i));
            }
        }
    }
}
