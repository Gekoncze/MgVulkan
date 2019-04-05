package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceGroupPresentInfoKHR extends VulkanObject {
    public VulkanDeviceGroupPresentInfoKHR(){
        super(new VkDeviceGroupPresentInfoKHR());
    }

    public VulkanDeviceGroupPresentInfoKHR(VkDeviceGroupPresentInfoKHR vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupPresentInfoKHR getVk(){
        return (VkDeviceGroupPresentInfoKHR) super.getVk();
    }
    public VulkanDeviceGroupPresentInfoKHR(VulkanObject pNext, VulkanUInt32 swapchainCount, VulkanUInt32 pDeviceMasks, VulkanDeviceGroupPresentModeFlagBitsKHR mode) {
        super(new VkDeviceGroupPresentInfoKHR(pNext.getVk(), swapchainCount.getVk(), pDeviceMasks.getVk(), mode.getVk()));
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

    public VulkanUInt32 getSwapchainCount() {
        return new VulkanUInt32(getVk().getSwapchainCount());
    }

    public void setSwapchainCount(VulkanUInt32 swapchainCount) {
        getVk().setSwapchainCount(swapchainCount.getVk());
    }

    public VulkanUInt32 getPDeviceMasks() {
        return new VulkanUInt32(getVk().getPDeviceMasks());
    }

    public void setPDeviceMasks(VulkanUInt32 pDeviceMasks) {
        getVk().setPDeviceMasks(pDeviceMasks.getVk());
    }

    public VulkanDeviceGroupPresentModeFlagBitsKHR getMode() {
        return new VulkanDeviceGroupPresentModeFlagBitsKHR(getVk().getMode());
    }

    public void setMode(VulkanDeviceGroupPresentModeFlagBitsKHR mode) {
        getVk().setMode(mode.getVk());
    }


    public static class Array extends VulkanDeviceGroupPresentInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupPresentInfoKHR> {
        public Array(VkDeviceGroupPresentInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGroupPresentInfoKHR.Array(count));
        }

        public Array(int count, VulkanDeviceGroupPresentInfoKHR o){
            this(new VkDeviceGroupPresentInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGroupPresentInfoKHR.Array getVk(){
            return (VkDeviceGroupPresentInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGroupPresentInfoKHR get(int i){
            return new VulkanDeviceGroupPresentInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGroupPresentInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGroupPresentInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGroupPresentInfoKHR.Pointer(value));
        }

        @Override
        public VkDeviceGroupPresentInfoKHR.Pointer getVk(){
            return (VkDeviceGroupPresentInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGroupPresentInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupPresentInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkDeviceGroupPresentInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanDeviceGroupPresentInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGroupPresentInfoKHR.Pointer.Array getVk(){
                return (VkDeviceGroupPresentInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGroupPresentInfoKHR.Pointer get(int i){
                return new VulkanDeviceGroupPresentInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
