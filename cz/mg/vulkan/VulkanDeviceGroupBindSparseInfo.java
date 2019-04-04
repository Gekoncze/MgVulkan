package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupBindSparseInfo.html">khronos documentation</a>
 **/
public class VulkanDeviceGroupBindSparseInfo extends VulkanObject {
    public VulkanDeviceGroupBindSparseInfo(){
        super(new VkDeviceGroupBindSparseInfo());
    }

    public VulkanDeviceGroupBindSparseInfo(VkDeviceGroupBindSparseInfo vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupBindSparseInfo getVk(){
        return (VkDeviceGroupBindSparseInfo) super.getVk();
    }
    public VulkanDeviceGroupBindSparseInfo(VulkanObject pNext, VulkanUInt32 resourceDeviceIndex, VulkanUInt32 memoryDeviceIndex) {
        super(new VkDeviceGroupBindSparseInfo(pNext.getVk(), resourceDeviceIndex.getVk(), memoryDeviceIndex.getVk()));
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

    public VulkanUInt32 getResourceDeviceIndex() {
        return new VulkanUInt32(getVk().getResourceDeviceIndex());
    }

    public void setResourceDeviceIndex(VulkanUInt32 resourceDeviceIndex) {
        getVk().setResourceDeviceIndex(resourceDeviceIndex.getVk());
    }

    public VulkanUInt32 getMemoryDeviceIndex() {
        return new VulkanUInt32(getVk().getMemoryDeviceIndex());
    }

    public void setMemoryDeviceIndex(VulkanUInt32 memoryDeviceIndex) {
        getVk().setMemoryDeviceIndex(memoryDeviceIndex.getVk());
    }


    public static class Array extends VulkanDeviceGroupBindSparseInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupBindSparseInfo> {
        public Array(VkDeviceGroupBindSparseInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGroupBindSparseInfo.Array(count));
        }

        public Array(int count, VulkanDeviceGroupBindSparseInfo o){
            this(new VkDeviceGroupBindSparseInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGroupBindSparseInfo.Array getVk(){
            return (VkDeviceGroupBindSparseInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGroupBindSparseInfo get(int i){
            return new VulkanDeviceGroupBindSparseInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGroupBindSparseInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGroupBindSparseInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGroupBindSparseInfo.Pointer(value));
        }

        @Override
        public VkDeviceGroupBindSparseInfo.Pointer getVk(){
            return (VkDeviceGroupBindSparseInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGroupBindSparseInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupBindSparseInfo.Pointer> {
            public Array(int count) {
                super(new VkDeviceGroupBindSparseInfo.Pointer.Array(count));
            }

            public Array(VulkanDeviceGroupBindSparseInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGroupBindSparseInfo.Pointer.Array getVk(){
                return (VkDeviceGroupBindSparseInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGroupBindSparseInfo.Pointer get(int i){
                return new VulkanDeviceGroupBindSparseInfo.Pointer(getVk().get(i));
            }
        }
    }
}
