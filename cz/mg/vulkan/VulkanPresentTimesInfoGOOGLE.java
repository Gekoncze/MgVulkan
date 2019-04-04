package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPresentTimesInfoGOOGLE.html">khronos documentation</a>
 **/
public class VulkanPresentTimesInfoGOOGLE extends VulkanObject {
    public VulkanPresentTimesInfoGOOGLE(){
        super(new VkPresentTimesInfoGOOGLE());
    }

    public VulkanPresentTimesInfoGOOGLE(VkPresentTimesInfoGOOGLE vk){
        super(vk);
    }

    @Override
    public VkPresentTimesInfoGOOGLE getVk(){
        return (VkPresentTimesInfoGOOGLE) super.getVk();
    }
    public VulkanPresentTimesInfoGOOGLE(VulkanObject pNext, VulkanUInt32 swapchainCount, VulkanPresentTimeGOOGLE pTimes) {
        super(new VkPresentTimesInfoGOOGLE(pNext.getVk(), swapchainCount.getVk(), pTimes.getVk()));
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

    public VulkanPresentTimeGOOGLE getPTimes() {
        return new VulkanPresentTimeGOOGLE(getVk().getPTimes());
    }

    public void setPTimes(VulkanPresentTimeGOOGLE pTimes) {
        getVk().setPTimes(pTimes.getVk());
    }


    public static class Array extends VulkanPresentTimesInfoGOOGLE implements cz.mg.collections.array.ReadonlyArray<VulkanPresentTimesInfoGOOGLE> {
        public Array(VkPresentTimesInfoGOOGLE.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPresentTimesInfoGOOGLE.Array(count));
        }

        public Array(int count, VulkanPresentTimesInfoGOOGLE o){
            this(new VkPresentTimesInfoGOOGLE.Array(count, o.getVk()));
        }

        @Override
        public VkPresentTimesInfoGOOGLE.Array getVk(){
            return (VkPresentTimesInfoGOOGLE.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPresentTimesInfoGOOGLE get(int i){
            return new VulkanPresentTimesInfoGOOGLE(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPresentTimesInfoGOOGLE.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPresentTimesInfoGOOGLE.Pointer());
        }

        public Pointer(long value) {
            this(new VkPresentTimesInfoGOOGLE.Pointer(value));
        }

        @Override
        public VkPresentTimesInfoGOOGLE.Pointer getVk(){
            return (VkPresentTimesInfoGOOGLE.Pointer) super.getVk();
        }

        public static class Array extends VulkanPresentTimesInfoGOOGLE.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPresentTimesInfoGOOGLE.Pointer> {
            public Array(int count) {
                super(new VkPresentTimesInfoGOOGLE.Pointer.Array(count));
            }

            public Array(VulkanPresentTimesInfoGOOGLE[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPresentTimesInfoGOOGLE.Pointer.Array getVk(){
                return (VkPresentTimesInfoGOOGLE.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPresentTimesInfoGOOGLE.Pointer get(int i){
                return new VulkanPresentTimesInfoGOOGLE.Pointer(getVk().get(i));
            }
        }
    }
}
