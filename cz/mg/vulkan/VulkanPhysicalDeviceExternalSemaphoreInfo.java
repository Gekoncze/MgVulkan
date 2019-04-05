package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceExternalSemaphoreInfo extends VulkanObject {
    public VulkanPhysicalDeviceExternalSemaphoreInfo(){
        super(new VkPhysicalDeviceExternalSemaphoreInfo());
    }

    public VulkanPhysicalDeviceExternalSemaphoreInfo(VkPhysicalDeviceExternalSemaphoreInfo vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceExternalSemaphoreInfo getVk(){
        return (VkPhysicalDeviceExternalSemaphoreInfo) super.getVk();
    }
    public VulkanPhysicalDeviceExternalSemaphoreInfo(VulkanObject pNext, VulkanExternalSemaphoreHandleTypeFlagBits handleType) {
        super(new VkPhysicalDeviceExternalSemaphoreInfo(pNext.getVk(), handleType.getVk()));
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

    public VulkanExternalSemaphoreHandleTypeFlagBits getHandleType() {
        return new VulkanExternalSemaphoreHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalSemaphoreHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceExternalSemaphoreInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceExternalSemaphoreInfo> {
        public Array(VkPhysicalDeviceExternalSemaphoreInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceExternalSemaphoreInfo.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceExternalSemaphoreInfo o){
            this(new VkPhysicalDeviceExternalSemaphoreInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceExternalSemaphoreInfo.Array getVk(){
            return (VkPhysicalDeviceExternalSemaphoreInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceExternalSemaphoreInfo get(int i){
            return new VulkanPhysicalDeviceExternalSemaphoreInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceExternalSemaphoreInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceExternalSemaphoreInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceExternalSemaphoreInfo.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceExternalSemaphoreInfo.Pointer getVk(){
            return (VkPhysicalDeviceExternalSemaphoreInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceExternalSemaphoreInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceExternalSemaphoreInfo.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceExternalSemaphoreInfo.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceExternalSemaphoreInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceExternalSemaphoreInfo.Pointer.Array getVk(){
                return (VkPhysicalDeviceExternalSemaphoreInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceExternalSemaphoreInfo.Pointer get(int i){
                return new VulkanPhysicalDeviceExternalSemaphoreInfo.Pointer(getVk().get(i));
            }
        }
    }
}
