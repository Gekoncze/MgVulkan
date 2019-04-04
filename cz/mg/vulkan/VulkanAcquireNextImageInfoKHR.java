package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAcquireNextImageInfoKHR.html">khronos documentation</a>
 **/
public class VulkanAcquireNextImageInfoKHR extends VulkanObject {
    public VulkanAcquireNextImageInfoKHR(){
        super(new VkAcquireNextImageInfoKHR());
    }

    public VulkanAcquireNextImageInfoKHR(VkAcquireNextImageInfoKHR vk){
        super(vk);
    }

    @Override
    public VkAcquireNextImageInfoKHR getVk(){
        return (VkAcquireNextImageInfoKHR) super.getVk();
    }
    public VulkanAcquireNextImageInfoKHR(VulkanObject pNext, VulkanSwapchainKHR swapchain, VulkanUInt64 timeout, VulkanSemaphore semaphore, VulkanFence fence, VulkanUInt32 deviceMask) {
        super(new VkAcquireNextImageInfoKHR(pNext.getVk(), swapchain.getVk(), timeout.getVk(), semaphore.getVk(), fence.getVk(), deviceMask.getVk()));
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

    public VulkanSwapchainKHR getSwapchain() {
        return new VulkanSwapchainKHR(getVk().getSwapchain());
    }

    public void setSwapchain(VulkanSwapchainKHR swapchain) {
        getVk().setSwapchain(swapchain.getVk());
    }

    public VulkanUInt64 getTimeout() {
        return new VulkanUInt64(getVk().getTimeout());
    }

    public void setTimeout(VulkanUInt64 timeout) {
        getVk().setTimeout(timeout.getVk());
    }

    public VulkanSemaphore getSemaphore() {
        return new VulkanSemaphore(getVk().getSemaphore());
    }

    public void setSemaphore(VulkanSemaphore semaphore) {
        getVk().setSemaphore(semaphore.getVk());
    }

    public VulkanFence getFence() {
        return new VulkanFence(getVk().getFence());
    }

    public void setFence(VulkanFence fence) {
        getVk().setFence(fence.getVk());
    }

    public VulkanUInt32 getDeviceMask() {
        return new VulkanUInt32(getVk().getDeviceMask());
    }

    public void setDeviceMask(VulkanUInt32 deviceMask) {
        getVk().setDeviceMask(deviceMask.getVk());
    }


    public static class Array extends VulkanAcquireNextImageInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanAcquireNextImageInfoKHR> {
        public Array(VkAcquireNextImageInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAcquireNextImageInfoKHR.Array(count));
        }

        public Array(int count, VulkanAcquireNextImageInfoKHR o){
            this(new VkAcquireNextImageInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkAcquireNextImageInfoKHR.Array getVk(){
            return (VkAcquireNextImageInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAcquireNextImageInfoKHR get(int i){
            return new VulkanAcquireNextImageInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAcquireNextImageInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAcquireNextImageInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkAcquireNextImageInfoKHR.Pointer(value));
        }

        @Override
        public VkAcquireNextImageInfoKHR.Pointer getVk(){
            return (VkAcquireNextImageInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanAcquireNextImageInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAcquireNextImageInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkAcquireNextImageInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanAcquireNextImageInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAcquireNextImageInfoKHR.Pointer.Array getVk(){
                return (VkAcquireNextImageInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAcquireNextImageInfoKHR.Pointer get(int i){
                return new VulkanAcquireNextImageInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
