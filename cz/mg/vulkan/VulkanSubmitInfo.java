package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubmitInfo.html">khronos documentation</a>
 **/
public class VulkanSubmitInfo extends VulkanObject {
    public VulkanSubmitInfo(){
        super(new VkSubmitInfo());
    }

    public VulkanSubmitInfo(VkSubmitInfo vk){
        super(vk);
    }

    @Override
    public VkSubmitInfo getVk(){
        return (VkSubmitInfo) super.getVk();
    }
    public VulkanSubmitInfo(VulkanObject pNext, VulkanUInt32 waitSemaphoreCount, VulkanSemaphore pWaitSemaphores, VulkanPipelineStageFlags pWaitDstStageMask, VulkanUInt32 commandBufferCount, VulkanCommandBuffer pCommandBuffers, VulkanUInt32 signalSemaphoreCount, VulkanSemaphore pSignalSemaphores) {
        super(new VkSubmitInfo(pNext.getVk(), waitSemaphoreCount.getVk(), pWaitSemaphores.getVk(), pWaitDstStageMask.getVk(), commandBufferCount.getVk(), pCommandBuffers.getVk(), signalSemaphoreCount.getVk(), pSignalSemaphores.getVk()));
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

    public VulkanSemaphore getPWaitSemaphores() {
        return new VulkanSemaphore(getVk().getPWaitSemaphores());
    }

    public void setPWaitSemaphores(VulkanSemaphore pWaitSemaphores) {
        getVk().setPWaitSemaphores(pWaitSemaphores.getVk());
    }

    public VulkanPipelineStageFlags getPWaitDstStageMask() {
        return new VulkanPipelineStageFlags(getVk().getPWaitDstStageMask());
    }

    public void setPWaitDstStageMask(VulkanPipelineStageFlags pWaitDstStageMask) {
        getVk().setPWaitDstStageMask(pWaitDstStageMask.getVk());
    }

    public VulkanUInt32 getCommandBufferCount() {
        return new VulkanUInt32(getVk().getCommandBufferCount());
    }

    public void setCommandBufferCount(VulkanUInt32 commandBufferCount) {
        getVk().setCommandBufferCount(commandBufferCount.getVk());
    }

    public VulkanCommandBuffer getPCommandBuffers() {
        return new VulkanCommandBuffer(getVk().getPCommandBuffers());
    }

    public void setPCommandBuffers(VulkanCommandBuffer pCommandBuffers) {
        getVk().setPCommandBuffers(pCommandBuffers.getVk());
    }

    public VulkanUInt32 getSignalSemaphoreCount() {
        return new VulkanUInt32(getVk().getSignalSemaphoreCount());
    }

    public void setSignalSemaphoreCount(VulkanUInt32 signalSemaphoreCount) {
        getVk().setSignalSemaphoreCount(signalSemaphoreCount.getVk());
    }

    public VulkanSemaphore getPSignalSemaphores() {
        return new VulkanSemaphore(getVk().getPSignalSemaphores());
    }

    public void setPSignalSemaphores(VulkanSemaphore pSignalSemaphores) {
        getVk().setPSignalSemaphores(pSignalSemaphores.getVk());
    }


    public static class Array extends VulkanSubmitInfo implements cz.mg.collections.array.ReadonlyArray<VulkanSubmitInfo> {
        public Array(VkSubmitInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSubmitInfo.Array(count));
        }

        public Array(int count, VulkanSubmitInfo o){
            this(new VkSubmitInfo.Array(count, o.getVk()));
        }

        @Override
        public VkSubmitInfo.Array getVk(){
            return (VkSubmitInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSubmitInfo get(int i){
            return new VulkanSubmitInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSubmitInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSubmitInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkSubmitInfo.Pointer(value));
        }

        @Override
        public VkSubmitInfo.Pointer getVk(){
            return (VkSubmitInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanSubmitInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSubmitInfo.Pointer> {
            public Array(int count) {
                super(new VkSubmitInfo.Pointer.Array(count));
            }

            public Array(VulkanSubmitInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSubmitInfo.Pointer.Array getVk(){
                return (VkSubmitInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSubmitInfo.Pointer get(int i){
                return new VulkanSubmitInfo.Pointer(getVk().get(i));
            }
        }
    }
}
