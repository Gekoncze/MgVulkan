package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSpecializationInfo.html">khronos documentation</a>
 **/
public class VulkanSpecializationInfo extends VulkanObject {
    public VulkanSpecializationInfo(){
        super(new VkSpecializationInfo());
    }

    public VulkanSpecializationInfo(VkSpecializationInfo vk){
        super(vk);
    }

    @Override
    public VkSpecializationInfo getVk(){
        return (VkSpecializationInfo) super.getVk();
    }

    public VulkanSpecializationInfo(VulkanUInt32 mapEntryCount, VulkanSpecializationMapEntry pMapEntries, VulkanSize dataSize, VulkanObject pData) {
        super(new VkSpecializationInfo(mapEntryCount.getVk(), pMapEntries.getVk(), dataSize.getVk(), pData.getVk()));
    }

    public VulkanUInt32 getMapEntryCount() {
        return new VulkanUInt32(getVk().getMapEntryCount());
    }

    public void setMapEntryCount(VulkanUInt32 mapEntryCount) {
        getVk().setMapEntryCount(mapEntryCount.getVk());
    }

    public VulkanSpecializationMapEntry getPMapEntries() {
        return new VulkanSpecializationMapEntry(getVk().getPMapEntries());
    }

    public void setPMapEntries(VulkanSpecializationMapEntry pMapEntries) {
        getVk().setPMapEntries(pMapEntries.getVk());
    }

    public VulkanSize getDataSize() {
        return new VulkanSize(getVk().getDataSize());
    }

    public void setDataSize(VulkanSize dataSize) {
        getVk().setDataSize(dataSize.getVk());
    }

    public VulkanObject getPData() {
        return new VulkanObject(getVk().getPData());
    }

    public void setPData(VulkanObject pData) {
        getVk().setPData(pData.getVk());
    }


    public static class Array extends VulkanSpecializationInfo implements cz.mg.collections.array.ReadonlyArray<VulkanSpecializationInfo> {
        public Array(VkSpecializationInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSpecializationInfo.Array(count));
        }

        public Array(int count, VulkanSpecializationInfo o){
            this(new VkSpecializationInfo.Array(count, o.getVk()));
        }

        @Override
        public VkSpecializationInfo.Array getVk(){
            return (VkSpecializationInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSpecializationInfo get(int i){
            return new VulkanSpecializationInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSpecializationInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSpecializationInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkSpecializationInfo.Pointer(value));
        }

        @Override
        public VkSpecializationInfo.Pointer getVk(){
            return (VkSpecializationInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanSpecializationInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSpecializationInfo.Pointer> {
            public Array(int count) {
                super(new VkSpecializationInfo.Pointer.Array(count));
            }

            public Array(VulkanSpecializationInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSpecializationInfo.Pointer.Array getVk(){
                return (VkSpecializationInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSpecializationInfo.Pointer get(int i){
                return new VulkanSpecializationInfo.Pointer(getVk().get(i));
            }
        }
    }
}
