package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBindImageMemoryDeviceGroupInfo.html">khronos documentation</a>
 **/
public class VulkanBindImageMemoryDeviceGroupInfo extends VulkanObject {
    public VulkanBindImageMemoryDeviceGroupInfo(){
        super(new VkBindImageMemoryDeviceGroupInfo());
    }

    public VulkanBindImageMemoryDeviceGroupInfo(VkBindImageMemoryDeviceGroupInfo vk){
        super(vk);
    }

    @Override
    public VkBindImageMemoryDeviceGroupInfo getVk(){
        return (VkBindImageMemoryDeviceGroupInfo) super.getVk();
    }
    public VulkanBindImageMemoryDeviceGroupInfo(VulkanObject pNext, VulkanUInt32 deviceIndexCount, VulkanUInt32 pDeviceIndices, VulkanUInt32 splitInstanceBindRegionCount, VulkanRect2D pSplitInstanceBindRegions) {
        super(new VkBindImageMemoryDeviceGroupInfo(pNext.getVk(), deviceIndexCount.getVk(), pDeviceIndices.getVk(), splitInstanceBindRegionCount.getVk(), pSplitInstanceBindRegions.getVk()));
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

    public VulkanUInt32 getDeviceIndexCount() {
        return new VulkanUInt32(getVk().getDeviceIndexCount());
    }

    public void setDeviceIndexCount(VulkanUInt32 deviceIndexCount) {
        getVk().setDeviceIndexCount(deviceIndexCount.getVk());
    }

    public VulkanUInt32 getPDeviceIndices() {
        return new VulkanUInt32(getVk().getPDeviceIndices());
    }

    public void setPDeviceIndices(VulkanUInt32 pDeviceIndices) {
        getVk().setPDeviceIndices(pDeviceIndices.getVk());
    }

    public VulkanUInt32 getSplitInstanceBindRegionCount() {
        return new VulkanUInt32(getVk().getSplitInstanceBindRegionCount());
    }

    public void setSplitInstanceBindRegionCount(VulkanUInt32 splitInstanceBindRegionCount) {
        getVk().setSplitInstanceBindRegionCount(splitInstanceBindRegionCount.getVk());
    }

    public VulkanRect2D getPSplitInstanceBindRegions() {
        return new VulkanRect2D(getVk().getPSplitInstanceBindRegions());
    }

    public void setPSplitInstanceBindRegions(VulkanRect2D pSplitInstanceBindRegions) {
        getVk().setPSplitInstanceBindRegions(pSplitInstanceBindRegions.getVk());
    }


    public static class Array extends VulkanBindImageMemoryDeviceGroupInfo implements cz.mg.collections.array.ReadonlyArray<VulkanBindImageMemoryDeviceGroupInfo> {
        public Array(VkBindImageMemoryDeviceGroupInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBindImageMemoryDeviceGroupInfo.Array(count));
        }

        public Array(int count, VulkanBindImageMemoryDeviceGroupInfo o){
            this(new VkBindImageMemoryDeviceGroupInfo.Array(count, o.getVk()));
        }

        @Override
        public VkBindImageMemoryDeviceGroupInfo.Array getVk(){
            return (VkBindImageMemoryDeviceGroupInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBindImageMemoryDeviceGroupInfo get(int i){
            return new VulkanBindImageMemoryDeviceGroupInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBindImageMemoryDeviceGroupInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBindImageMemoryDeviceGroupInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkBindImageMemoryDeviceGroupInfo.Pointer(value));
        }

        @Override
        public VkBindImageMemoryDeviceGroupInfo.Pointer getVk(){
            return (VkBindImageMemoryDeviceGroupInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanBindImageMemoryDeviceGroupInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBindImageMemoryDeviceGroupInfo.Pointer> {
            public Array(int count) {
                super(new VkBindImageMemoryDeviceGroupInfo.Pointer.Array(count));
            }

            public Array(VulkanBindImageMemoryDeviceGroupInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBindImageMemoryDeviceGroupInfo.Pointer.Array getVk(){
                return (VkBindImageMemoryDeviceGroupInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBindImageMemoryDeviceGroupInfo.Pointer get(int i){
                return new VulkanBindImageMemoryDeviceGroupInfo.Pointer(getVk().get(i));
            }
        }
    }
}
