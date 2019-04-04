package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupSubmitInfo.html">khronos documentation</a>
 **/
public class VulkanDeviceGroupSubmitInfo extends VulkanObject {
    public VulkanDeviceGroupSubmitInfo(){
        super(new VkDeviceGroupSubmitInfo());
    }

    public VulkanDeviceGroupSubmitInfo(VkDeviceGroupSubmitInfo vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupSubmitInfo getVk(){
        return (VkDeviceGroupSubmitInfo) super.getVk();
    }
    public VulkanDeviceGroupSubmitInfo(VulkanObject pNext, VulkanUInt32 waitSemaphoreCount, VulkanUInt32 pWaitSemaphoreDeviceIndices, VulkanUInt32 commandBufferCount, VulkanUInt32 pCommandBufferDeviceMasks, VulkanUInt32 signalSemaphoreCount, VulkanUInt32 pSignalSemaphoreDeviceIndices) {
        super(new VkDeviceGroupSubmitInfo(pNext.getVk(), waitSemaphoreCount.getVk(), pWaitSemaphoreDeviceIndices.getVk(), commandBufferCount.getVk(), pCommandBufferDeviceMasks.getVk(), signalSemaphoreCount.getVk(), pSignalSemaphoreDeviceIndices.getVk()));
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

    public VulkanUInt32 getWaitSemaphoreCount() {
        return new VulkanUInt32(getVk().getWaitSemaphoreCount());
    }

    public void setWaitSemaphoreCount(VulkanUInt32 waitSemaphoreCount) {
        getVk().setWaitSemaphoreCount(waitSemaphoreCount.getVk());
    }

    public VulkanUInt32 getPWaitSemaphoreDeviceIndices() {
        return new VulkanUInt32(getVk().getPWaitSemaphoreDeviceIndices());
    }

    public void setPWaitSemaphoreDeviceIndices(VulkanUInt32 pWaitSemaphoreDeviceIndices) {
        getVk().setPWaitSemaphoreDeviceIndices(pWaitSemaphoreDeviceIndices.getVk());
    }

    public VulkanUInt32 getCommandBufferCount() {
        return new VulkanUInt32(getVk().getCommandBufferCount());
    }

    public void setCommandBufferCount(VulkanUInt32 commandBufferCount) {
        getVk().setCommandBufferCount(commandBufferCount.getVk());
    }

    public VulkanUInt32 getPCommandBufferDeviceMasks() {
        return new VulkanUInt32(getVk().getPCommandBufferDeviceMasks());
    }

    public void setPCommandBufferDeviceMasks(VulkanUInt32 pCommandBufferDeviceMasks) {
        getVk().setPCommandBufferDeviceMasks(pCommandBufferDeviceMasks.getVk());
    }

    public VulkanUInt32 getSignalSemaphoreCount() {
        return new VulkanUInt32(getVk().getSignalSemaphoreCount());
    }

    public void setSignalSemaphoreCount(VulkanUInt32 signalSemaphoreCount) {
        getVk().setSignalSemaphoreCount(signalSemaphoreCount.getVk());
    }

    public VulkanUInt32 getPSignalSemaphoreDeviceIndices() {
        return new VulkanUInt32(getVk().getPSignalSemaphoreDeviceIndices());
    }

    public void setPSignalSemaphoreDeviceIndices(VulkanUInt32 pSignalSemaphoreDeviceIndices) {
        getVk().setPSignalSemaphoreDeviceIndices(pSignalSemaphoreDeviceIndices.getVk());
    }


    public static class Array extends VulkanDeviceGroupSubmitInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupSubmitInfo> {
        public Array(VkDeviceGroupSubmitInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGroupSubmitInfo.Array(count));
        }

        public Array(int count, VulkanDeviceGroupSubmitInfo o){
            this(new VkDeviceGroupSubmitInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGroupSubmitInfo.Array getVk(){
            return (VkDeviceGroupSubmitInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGroupSubmitInfo get(int i){
            return new VulkanDeviceGroupSubmitInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGroupSubmitInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGroupSubmitInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGroupSubmitInfo.Pointer(value));
        }

        @Override
        public VkDeviceGroupSubmitInfo.Pointer getVk(){
            return (VkDeviceGroupSubmitInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGroupSubmitInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupSubmitInfo.Pointer> {
            public Array(int count) {
                super(new VkDeviceGroupSubmitInfo.Pointer.Array(count));
            }

            public Array(VulkanDeviceGroupSubmitInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGroupSubmitInfo.Pointer.Array getVk(){
                return (VkDeviceGroupSubmitInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGroupSubmitInfo.Pointer get(int i){
                return new VulkanDeviceGroupSubmitInfo.Pointer(getVk().get(i));
            }
        }
    }
}
