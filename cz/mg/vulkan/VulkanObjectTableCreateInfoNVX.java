package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanObjectTableCreateInfoNVX extends VulkanObject {
    public VulkanObjectTableCreateInfoNVX(){
        super(new VkObjectTableCreateInfoNVX());
    }

    public VulkanObjectTableCreateInfoNVX(VkObjectTableCreateInfoNVX vk){
        super(vk);
    }

    @Override
    public VkObjectTableCreateInfoNVX getVk(){
        return (VkObjectTableCreateInfoNVX) super.getVk();
    }
    public VulkanObjectTableCreateInfoNVX(VulkanObject pNext, VulkanUInt32 objectCount, VulkanObjectEntryTypeNVX pObjectEntryTypes, VulkanUInt32 pObjectEntryCounts, VulkanObjectEntryUsageFlagsNVX pObjectEntryUsageFlags, VulkanUInt32 maxUniformBuffersPerDescriptor, VulkanUInt32 maxStorageBuffersPerDescriptor, VulkanUInt32 maxStorageImagesPerDescriptor, VulkanUInt32 maxSampledImagesPerDescriptor, VulkanUInt32 maxPipelineLayouts) {
        super(new VkObjectTableCreateInfoNVX(pNext.getVk(), objectCount.getVk(), pObjectEntryTypes.getVk(), pObjectEntryCounts.getVk(), pObjectEntryUsageFlags.getVk(), maxUniformBuffersPerDescriptor.getVk(), maxStorageBuffersPerDescriptor.getVk(), maxStorageImagesPerDescriptor.getVk(), maxSampledImagesPerDescriptor.getVk(), maxPipelineLayouts.getVk()));
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

    public VulkanUInt32 getObjectCount() {
        return new VulkanUInt32(getVk().getObjectCount());
    }

    public void setObjectCount(VulkanUInt32 objectCount) {
        getVk().setObjectCount(objectCount.getVk());
    }

    public VulkanObjectEntryTypeNVX getPObjectEntryTypes() {
        return new VulkanObjectEntryTypeNVX(getVk().getPObjectEntryTypes());
    }

    public void setPObjectEntryTypes(VulkanObjectEntryTypeNVX pObjectEntryTypes) {
        getVk().setPObjectEntryTypes(pObjectEntryTypes.getVk());
    }

    public VulkanUInt32 getPObjectEntryCounts() {
        return new VulkanUInt32(getVk().getPObjectEntryCounts());
    }

    public void setPObjectEntryCounts(VulkanUInt32 pObjectEntryCounts) {
        getVk().setPObjectEntryCounts(pObjectEntryCounts.getVk());
    }

    public VulkanObjectEntryUsageFlagsNVX getPObjectEntryUsageFlags() {
        return new VulkanObjectEntryUsageFlagsNVX(getVk().getPObjectEntryUsageFlags());
    }

    public void setPObjectEntryUsageFlags(VulkanObjectEntryUsageFlagsNVX pObjectEntryUsageFlags) {
        getVk().setPObjectEntryUsageFlags(pObjectEntryUsageFlags.getVk());
    }

    public VulkanUInt32 getMaxUniformBuffersPerDescriptor() {
        return new VulkanUInt32(getVk().getMaxUniformBuffersPerDescriptor());
    }

    public void setMaxUniformBuffersPerDescriptor(VulkanUInt32 maxUniformBuffersPerDescriptor) {
        getVk().setMaxUniformBuffersPerDescriptor(maxUniformBuffersPerDescriptor.getVk());
    }

    public VulkanUInt32 getMaxStorageBuffersPerDescriptor() {
        return new VulkanUInt32(getVk().getMaxStorageBuffersPerDescriptor());
    }

    public void setMaxStorageBuffersPerDescriptor(VulkanUInt32 maxStorageBuffersPerDescriptor) {
        getVk().setMaxStorageBuffersPerDescriptor(maxStorageBuffersPerDescriptor.getVk());
    }

    public VulkanUInt32 getMaxStorageImagesPerDescriptor() {
        return new VulkanUInt32(getVk().getMaxStorageImagesPerDescriptor());
    }

    public void setMaxStorageImagesPerDescriptor(VulkanUInt32 maxStorageImagesPerDescriptor) {
        getVk().setMaxStorageImagesPerDescriptor(maxStorageImagesPerDescriptor.getVk());
    }

    public VulkanUInt32 getMaxSampledImagesPerDescriptor() {
        return new VulkanUInt32(getVk().getMaxSampledImagesPerDescriptor());
    }

    public void setMaxSampledImagesPerDescriptor(VulkanUInt32 maxSampledImagesPerDescriptor) {
        getVk().setMaxSampledImagesPerDescriptor(maxSampledImagesPerDescriptor.getVk());
    }

    public VulkanUInt32 getMaxPipelineLayouts() {
        return new VulkanUInt32(getVk().getMaxPipelineLayouts());
    }

    public void setMaxPipelineLayouts(VulkanUInt32 maxPipelineLayouts) {
        getVk().setMaxPipelineLayouts(maxPipelineLayouts.getVk());
    }


    public static class Array extends VulkanObjectTableCreateInfoNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableCreateInfoNVX> {
        public Array(VkObjectTableCreateInfoNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectTableCreateInfoNVX.Array(count));
        }

        public Array(int count, VulkanObjectTableCreateInfoNVX o){
            this(new VkObjectTableCreateInfoNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectTableCreateInfoNVX.Array getVk(){
            return (VkObjectTableCreateInfoNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectTableCreateInfoNVX get(int i){
            return new VulkanObjectTableCreateInfoNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectTableCreateInfoNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectTableCreateInfoNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectTableCreateInfoNVX.Pointer(value));
        }

        @Override
        public VkObjectTableCreateInfoNVX.Pointer getVk(){
            return (VkObjectTableCreateInfoNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectTableCreateInfoNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableCreateInfoNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectTableCreateInfoNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectTableCreateInfoNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectTableCreateInfoNVX.Pointer.Array getVk(){
                return (VkObjectTableCreateInfoNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectTableCreateInfoNVX.Pointer get(int i){
                return new VulkanObjectTableCreateInfoNVX.Pointer(getVk().get(i));
            }
        }
    }
}
