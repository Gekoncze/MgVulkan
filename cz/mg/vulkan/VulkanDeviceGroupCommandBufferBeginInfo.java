package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceGroupCommandBufferBeginInfo extends VulkanObject {
    public VulkanDeviceGroupCommandBufferBeginInfo(){
        super(new VkDeviceGroupCommandBufferBeginInfo());
    }

    public VulkanDeviceGroupCommandBufferBeginInfo(VkDeviceGroupCommandBufferBeginInfo vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupCommandBufferBeginInfo getVk(){
        return (VkDeviceGroupCommandBufferBeginInfo) super.getVk();
    }
    public VulkanDeviceGroupCommandBufferBeginInfo(VulkanObject pNext, VulkanUInt32 deviceMask) {
        super(new VkDeviceGroupCommandBufferBeginInfo(pNext.getVk(), deviceMask.getVk()));
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

    public VulkanUInt32 getDeviceMask() {
        return new VulkanUInt32(getVk().getDeviceMask());
    }

    public void setDeviceMask(VulkanUInt32 deviceMask) {
        getVk().setDeviceMask(deviceMask.getVk());
    }


    public static class Array extends VulkanDeviceGroupCommandBufferBeginInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupCommandBufferBeginInfo> {
        public Array(VkDeviceGroupCommandBufferBeginInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGroupCommandBufferBeginInfo.Array(count));
        }

        public Array(int count, VulkanDeviceGroupCommandBufferBeginInfo o){
            this(new VkDeviceGroupCommandBufferBeginInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGroupCommandBufferBeginInfo.Array getVk(){
            return (VkDeviceGroupCommandBufferBeginInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGroupCommandBufferBeginInfo get(int i){
            return new VulkanDeviceGroupCommandBufferBeginInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGroupCommandBufferBeginInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGroupCommandBufferBeginInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGroupCommandBufferBeginInfo.Pointer(value));
        }

        @Override
        public VkDeviceGroupCommandBufferBeginInfo.Pointer getVk(){
            return (VkDeviceGroupCommandBufferBeginInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGroupCommandBufferBeginInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupCommandBufferBeginInfo.Pointer> {
            public Array(int count) {
                super(new VkDeviceGroupCommandBufferBeginInfo.Pointer.Array(count));
            }

            public Array(VulkanDeviceGroupCommandBufferBeginInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGroupCommandBufferBeginInfo.Pointer.Array getVk(){
                return (VkDeviceGroupCommandBufferBeginInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGroupCommandBufferBeginInfo.Pointer get(int i){
                return new VulkanDeviceGroupCommandBufferBeginInfo.Pointer(getVk().get(i));
            }
        }
    }
}
