package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceIDProperties.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceIDProperties extends VulkanObject {
    public VulkanPhysicalDeviceIDProperties(){
        super(new VkPhysicalDeviceIDProperties());
    }

    public VulkanPhysicalDeviceIDProperties(VkPhysicalDeviceIDProperties vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceIDProperties getVk(){
        return (VkPhysicalDeviceIDProperties) super.getVk();
    }

    public VulkanPhysicalDeviceIDProperties(VulkanStructureType sType, VulkanObject pNext, VulkanUInt8 deviceUUID, VulkanUInt8 driverUUID, VulkanUInt8 deviceLUID, VulkanUInt32 deviceNodeMask, VulkanBool32 deviceLUIDValid) {
        super(new VkPhysicalDeviceIDProperties(sType.getVk(), pNext.getVk(), deviceUUID.getVk(), driverUUID.getVk(), deviceLUID.getVk(), deviceNodeMask.getVk(), deviceLUIDValid.getVk()));
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

    public VulkanUInt8 getDeviceUUID() {
        return new VulkanUInt8(getVk().getDeviceUUID());
    }

    public void setDeviceUUID(VulkanUInt8 deviceUUID) {
        getVk().setDeviceUUID(deviceUUID.getVk());
    }

    public VulkanUInt8 getDriverUUID() {
        return new VulkanUInt8(getVk().getDriverUUID());
    }

    public void setDriverUUID(VulkanUInt8 driverUUID) {
        getVk().setDriverUUID(driverUUID.getVk());
    }

    public VulkanUInt8 getDeviceLUID() {
        return new VulkanUInt8(getVk().getDeviceLUID());
    }

    public void setDeviceLUID(VulkanUInt8 deviceLUID) {
        getVk().setDeviceLUID(deviceLUID.getVk());
    }

    public VulkanUInt32 getDeviceNodeMask() {
        return new VulkanUInt32(getVk().getDeviceNodeMask());
    }

    public void setDeviceNodeMask(VulkanUInt32 deviceNodeMask) {
        getVk().setDeviceNodeMask(deviceNodeMask.getVk());
    }

    public VulkanBool32 getDeviceLUIDValid() {
        return new VulkanBool32(getVk().getDeviceLUIDValid());
    }

    public void setDeviceLUIDValid(VulkanBool32 deviceLUIDValid) {
        getVk().setDeviceLUIDValid(deviceLUIDValid.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceIDProperties implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceIDProperties> {
        public Array(VkPhysicalDeviceIDProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceIDProperties.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceIDProperties o){
            this(new VkPhysicalDeviceIDProperties.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceIDProperties.Array getVk(){
            return (VkPhysicalDeviceIDProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceIDProperties get(int i){
            return new VulkanPhysicalDeviceIDProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceIDProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceIDProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceIDProperties.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceIDProperties.Pointer getVk(){
            return (VkPhysicalDeviceIDProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceIDProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceIDProperties.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceIDProperties.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceIDProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceIDProperties.Pointer.Array getVk(){
                return (VkPhysicalDeviceIDProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceIDProperties.Pointer get(int i){
                return new VulkanPhysicalDeviceIDProperties.Pointer(getVk().get(i));
            }
        }
    }
}
