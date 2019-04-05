package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceExternalImageFormatInfo extends VulkanObject {
    public VulkanPhysicalDeviceExternalImageFormatInfo(){
        super(new VkPhysicalDeviceExternalImageFormatInfo());
    }

    public VulkanPhysicalDeviceExternalImageFormatInfo(VkPhysicalDeviceExternalImageFormatInfo vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceExternalImageFormatInfo getVk(){
        return (VkPhysicalDeviceExternalImageFormatInfo) super.getVk();
    }
    public VulkanPhysicalDeviceExternalImageFormatInfo(VulkanObject pNext, VulkanExternalMemoryHandleTypeFlagBits handleType) {
        super(new VkPhysicalDeviceExternalImageFormatInfo(pNext.getVk(), handleType.getVk()));
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

    public VulkanExternalMemoryHandleTypeFlagBits getHandleType() {
        return new VulkanExternalMemoryHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalMemoryHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceExternalImageFormatInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceExternalImageFormatInfo> {
        public Array(VkPhysicalDeviceExternalImageFormatInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceExternalImageFormatInfo.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceExternalImageFormatInfo o){
            this(new VkPhysicalDeviceExternalImageFormatInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceExternalImageFormatInfo.Array getVk(){
            return (VkPhysicalDeviceExternalImageFormatInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceExternalImageFormatInfo get(int i){
            return new VulkanPhysicalDeviceExternalImageFormatInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceExternalImageFormatInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceExternalImageFormatInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceExternalImageFormatInfo.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceExternalImageFormatInfo.Pointer getVk(){
            return (VkPhysicalDeviceExternalImageFormatInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceExternalImageFormatInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceExternalImageFormatInfo.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceExternalImageFormatInfo.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceExternalImageFormatInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceExternalImageFormatInfo.Pointer.Array getVk(){
                return (VkPhysicalDeviceExternalImageFormatInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceExternalImageFormatInfo.Pointer get(int i){
                return new VulkanPhysicalDeviceExternalImageFormatInfo.Pointer(getVk().get(i));
            }
        }
    }
}
