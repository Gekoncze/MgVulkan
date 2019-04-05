package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPresentInfoKHR extends VulkanObject {
    public VulkanPresentInfoKHR(){
        super(new VkPresentInfoKHR());
    }

    public VulkanPresentInfoKHR(VkPresentInfoKHR vk){
        super(vk);
    }

    @Override
    public VkPresentInfoKHR getVk(){
        return (VkPresentInfoKHR) super.getVk();
    }
    public VulkanPresentInfoKHR(VulkanObject pNext, VulkanUInt32 waitSemaphoreCount, VulkanSemaphore pWaitSemaphores, VulkanUInt32 swapchainCount, VulkanSwapchainKHR pSwapchains, VulkanUInt32 pImageIndices, VulkanResult pResults) {
        super(new VkPresentInfoKHR(pNext.getVk(), waitSemaphoreCount.getVk(), pWaitSemaphores.getVk(), swapchainCount.getVk(), pSwapchains.getVk(), pImageIndices.getVk(), pResults.getVk()));
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

    public VulkanUInt32 getSwapchainCount() {
        return new VulkanUInt32(getVk().getSwapchainCount());
    }

    public void setSwapchainCount(VulkanUInt32 swapchainCount) {
        getVk().setSwapchainCount(swapchainCount.getVk());
    }

    public VulkanSwapchainKHR getPSwapchains() {
        return new VulkanSwapchainKHR(getVk().getPSwapchains());
    }

    public void setPSwapchains(VulkanSwapchainKHR pSwapchains) {
        getVk().setPSwapchains(pSwapchains.getVk());
    }

    public VulkanUInt32 getPImageIndices() {
        return new VulkanUInt32(getVk().getPImageIndices());
    }

    public void setPImageIndices(VulkanUInt32 pImageIndices) {
        getVk().setPImageIndices(pImageIndices.getVk());
    }

    public VulkanResult getPResults() {
        return new VulkanResult(getVk().getPResults());
    }

    public void setPResults(VulkanResult pResults) {
        getVk().setPResults(pResults.getVk());
    }


    public static class Array extends VulkanPresentInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanPresentInfoKHR> {
        public Array(VkPresentInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPresentInfoKHR.Array(count));
        }

        public Array(int count, VulkanPresentInfoKHR o){
            this(new VkPresentInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkPresentInfoKHR.Array getVk(){
            return (VkPresentInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPresentInfoKHR get(int i){
            return new VulkanPresentInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPresentInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPresentInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkPresentInfoKHR.Pointer(value));
        }

        @Override
        public VkPresentInfoKHR.Pointer getVk(){
            return (VkPresentInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanPresentInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPresentInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkPresentInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanPresentInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPresentInfoKHR.Pointer.Array getVk(){
                return (VkPresentInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPresentInfoKHR.Pointer get(int i){
                return new VulkanPresentInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
