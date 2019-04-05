package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceGroupRenderPassBeginInfo extends VulkanObject {
    public VulkanDeviceGroupRenderPassBeginInfo(){
        super(new VkDeviceGroupRenderPassBeginInfo());
    }

    public VulkanDeviceGroupRenderPassBeginInfo(VkDeviceGroupRenderPassBeginInfo vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupRenderPassBeginInfo getVk(){
        return (VkDeviceGroupRenderPassBeginInfo) super.getVk();
    }
    public VulkanDeviceGroupRenderPassBeginInfo(VulkanObject pNext, VulkanUInt32 deviceMask, VulkanUInt32 deviceRenderAreaCount, VulkanRect2D pDeviceRenderAreas) {
        super(new VkDeviceGroupRenderPassBeginInfo(pNext.getVk(), deviceMask.getVk(), deviceRenderAreaCount.getVk(), pDeviceRenderAreas.getVk()));
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

    public VulkanUInt32 getDeviceRenderAreaCount() {
        return new VulkanUInt32(getVk().getDeviceRenderAreaCount());
    }

    public void setDeviceRenderAreaCount(VulkanUInt32 deviceRenderAreaCount) {
        getVk().setDeviceRenderAreaCount(deviceRenderAreaCount.getVk());
    }

    public VulkanRect2D getPDeviceRenderAreas() {
        return new VulkanRect2D(getVk().getPDeviceRenderAreas());
    }

    public void setPDeviceRenderAreas(VulkanRect2D pDeviceRenderAreas) {
        getVk().setPDeviceRenderAreas(pDeviceRenderAreas.getVk());
    }


    public static class Array extends VulkanDeviceGroupRenderPassBeginInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupRenderPassBeginInfo> {
        public Array(VkDeviceGroupRenderPassBeginInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGroupRenderPassBeginInfo.Array(count));
        }

        public Array(int count, VulkanDeviceGroupRenderPassBeginInfo o){
            this(new VkDeviceGroupRenderPassBeginInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGroupRenderPassBeginInfo.Array getVk(){
            return (VkDeviceGroupRenderPassBeginInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGroupRenderPassBeginInfo get(int i){
            return new VulkanDeviceGroupRenderPassBeginInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGroupRenderPassBeginInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGroupRenderPassBeginInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGroupRenderPassBeginInfo.Pointer(value));
        }

        @Override
        public VkDeviceGroupRenderPassBeginInfo.Pointer getVk(){
            return (VkDeviceGroupRenderPassBeginInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGroupRenderPassBeginInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupRenderPassBeginInfo.Pointer> {
            public Array(int count) {
                super(new VkDeviceGroupRenderPassBeginInfo.Pointer.Array(count));
            }

            public Array(VulkanDeviceGroupRenderPassBeginInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGroupRenderPassBeginInfo.Pointer.Array getVk(){
                return (VkDeviceGroupRenderPassBeginInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGroupRenderPassBeginInfo.Pointer get(int i){
                return new VulkanDeviceGroupRenderPassBeginInfo.Pointer(getVk().get(i));
            }
        }
    }
}
