package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPresentRegionsKHR extends VulkanObject {
    public VulkanPresentRegionsKHR(){
        super(new VkPresentRegionsKHR());
    }

    public VulkanPresentRegionsKHR(VkPresentRegionsKHR vk){
        super(vk);
    }

    @Override
    public VkPresentRegionsKHR getVk(){
        return (VkPresentRegionsKHR) super.getVk();
    }

    public VulkanPresentRegionsKHR(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 swapchainCount, VulkanPresentRegionKHR pRegions) {
        super(new VkPresentRegionsKHR(sType.getVk(), pNext.getVk(), swapchainCount.getVk(), pRegions.getVk()));
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

    public VulkanPresentRegionKHR getPRegions() {
        return new VulkanPresentRegionKHR(getVk().getPRegions());
    }

    public void setPRegions(VulkanPresentRegionKHR pRegions) {
        getVk().setPRegions(pRegions.getVk());
    }


    public static class Array extends VulkanPresentRegionsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanPresentRegionsKHR> {
        public Array(VkPresentRegionsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPresentRegionsKHR.Array(count));
        }

        public Array(int count, VulkanPresentRegionsKHR o){
            this(new VkPresentRegionsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkPresentRegionsKHR.Array getVk(){
            return (VkPresentRegionsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPresentRegionsKHR get(int i){
            return new VulkanPresentRegionsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPresentRegionsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPresentRegionsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkPresentRegionsKHR.Pointer(value));
        }

        @Override
        public VkPresentRegionsKHR.Pointer getVk(){
            return (VkPresentRegionsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanPresentRegionsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPresentRegionsKHR.Pointer> {
            public Array(int count) {
                super(new VkPresentRegionsKHR.Pointer.Array(count));
            }

            public Array(VulkanPresentRegionsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPresentRegionsKHR.Pointer.Array getVk(){
                return (VkPresentRegionsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPresentRegionsKHR.Pointer get(int i){
                return new VulkanPresentRegionsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
