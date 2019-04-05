package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceExternalFenceInfo extends VulkanObject {
    public VulkanPhysicalDeviceExternalFenceInfo(){
        super(new VkPhysicalDeviceExternalFenceInfo());
    }

    public VulkanPhysicalDeviceExternalFenceInfo(VkPhysicalDeviceExternalFenceInfo vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceExternalFenceInfo getVk(){
        return (VkPhysicalDeviceExternalFenceInfo) super.getVk();
    }
    public VulkanPhysicalDeviceExternalFenceInfo(VulkanObject pNext, VulkanExternalFenceHandleTypeFlagBits handleType) {
        super(new VkPhysicalDeviceExternalFenceInfo(pNext.getVk(), handleType.getVk()));
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

    public VulkanExternalFenceHandleTypeFlagBits getHandleType() {
        return new VulkanExternalFenceHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalFenceHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceExternalFenceInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceExternalFenceInfo> {
        public Array(VkPhysicalDeviceExternalFenceInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceExternalFenceInfo.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceExternalFenceInfo o){
            this(new VkPhysicalDeviceExternalFenceInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceExternalFenceInfo.Array getVk(){
            return (VkPhysicalDeviceExternalFenceInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceExternalFenceInfo get(int i){
            return new VulkanPhysicalDeviceExternalFenceInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceExternalFenceInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceExternalFenceInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceExternalFenceInfo.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceExternalFenceInfo.Pointer getVk(){
            return (VkPhysicalDeviceExternalFenceInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceExternalFenceInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceExternalFenceInfo.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceExternalFenceInfo.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceExternalFenceInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceExternalFenceInfo.Pointer.Array getVk(){
                return (VkPhysicalDeviceExternalFenceInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceExternalFenceInfo.Pointer get(int i){
                return new VulkanPhysicalDeviceExternalFenceInfo.Pointer(getVk().get(i));
            }
        }
    }
}
