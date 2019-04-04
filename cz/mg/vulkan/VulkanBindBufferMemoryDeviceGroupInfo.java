package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBindBufferMemoryDeviceGroupInfo.html">khronos documentation</a>
 **/
public class VulkanBindBufferMemoryDeviceGroupInfo extends VulkanObject {
    public VulkanBindBufferMemoryDeviceGroupInfo(){
        super(new VkBindBufferMemoryDeviceGroupInfo());
    }

    public VulkanBindBufferMemoryDeviceGroupInfo(VkBindBufferMemoryDeviceGroupInfo vk){
        super(vk);
    }

    @Override
    public VkBindBufferMemoryDeviceGroupInfo getVk(){
        return (VkBindBufferMemoryDeviceGroupInfo) super.getVk();
    }
    public VulkanBindBufferMemoryDeviceGroupInfo(VulkanObject pNext, VulkanUInt32 deviceIndexCount, VulkanUInt32 pDeviceIndices) {
        super(new VkBindBufferMemoryDeviceGroupInfo(pNext.getVk(), deviceIndexCount.getVk(), pDeviceIndices.getVk()));
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


    public static class Array extends VulkanBindBufferMemoryDeviceGroupInfo implements cz.mg.collections.array.ReadonlyArray<VulkanBindBufferMemoryDeviceGroupInfo> {
        public Array(VkBindBufferMemoryDeviceGroupInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBindBufferMemoryDeviceGroupInfo.Array(count));
        }

        public Array(int count, VulkanBindBufferMemoryDeviceGroupInfo o){
            this(new VkBindBufferMemoryDeviceGroupInfo.Array(count, o.getVk()));
        }

        @Override
        public VkBindBufferMemoryDeviceGroupInfo.Array getVk(){
            return (VkBindBufferMemoryDeviceGroupInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBindBufferMemoryDeviceGroupInfo get(int i){
            return new VulkanBindBufferMemoryDeviceGroupInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBindBufferMemoryDeviceGroupInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBindBufferMemoryDeviceGroupInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkBindBufferMemoryDeviceGroupInfo.Pointer(value));
        }

        @Override
        public VkBindBufferMemoryDeviceGroupInfo.Pointer getVk(){
            return (VkBindBufferMemoryDeviceGroupInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanBindBufferMemoryDeviceGroupInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBindBufferMemoryDeviceGroupInfo.Pointer> {
            public Array(int count) {
                super(new VkBindBufferMemoryDeviceGroupInfo.Pointer.Array(count));
            }

            public Array(VulkanBindBufferMemoryDeviceGroupInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBindBufferMemoryDeviceGroupInfo.Pointer.Array getVk(){
                return (VkBindBufferMemoryDeviceGroupInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBindBufferMemoryDeviceGroupInfo.Pointer get(int i){
                return new VulkanBindBufferMemoryDeviceGroupInfo.Pointer(getVk().get(i));
            }
        }
    }
}
