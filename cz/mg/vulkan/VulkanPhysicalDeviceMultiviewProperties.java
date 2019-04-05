package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceMultiviewProperties extends VulkanObject {
    public VulkanPhysicalDeviceMultiviewProperties(){
        super(new VkPhysicalDeviceMultiviewProperties());
    }

    public VulkanPhysicalDeviceMultiviewProperties(VkPhysicalDeviceMultiviewProperties vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceMultiviewProperties getVk(){
        return (VkPhysicalDeviceMultiviewProperties) super.getVk();
    }

    public VulkanPhysicalDeviceMultiviewProperties(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 maxMultiviewViewCount, VulkanUInt32 maxMultiviewInstanceIndex) {
        super(new VkPhysicalDeviceMultiviewProperties(sType.getVk(), pNext.getVk(), maxMultiviewViewCount.getVk(), maxMultiviewInstanceIndex.getVk()));
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

    public VulkanUInt32 getMaxMultiviewViewCount() {
        return new VulkanUInt32(getVk().getMaxMultiviewViewCount());
    }

    public void setMaxMultiviewViewCount(VulkanUInt32 maxMultiviewViewCount) {
        getVk().setMaxMultiviewViewCount(maxMultiviewViewCount.getVk());
    }

    public VulkanUInt32 getMaxMultiviewInstanceIndex() {
        return new VulkanUInt32(getVk().getMaxMultiviewInstanceIndex());
    }

    public void setMaxMultiviewInstanceIndex(VulkanUInt32 maxMultiviewInstanceIndex) {
        getVk().setMaxMultiviewInstanceIndex(maxMultiviewInstanceIndex.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceMultiviewProperties implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMultiviewProperties> {
        public Array(VkPhysicalDeviceMultiviewProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceMultiviewProperties.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceMultiviewProperties o){
            this(new VkPhysicalDeviceMultiviewProperties.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceMultiviewProperties.Array getVk(){
            return (VkPhysicalDeviceMultiviewProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceMultiviewProperties get(int i){
            return new VulkanPhysicalDeviceMultiviewProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceMultiviewProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceMultiviewProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceMultiviewProperties.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceMultiviewProperties.Pointer getVk(){
            return (VkPhysicalDeviceMultiviewProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceMultiviewProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMultiviewProperties.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceMultiviewProperties.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceMultiviewProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceMultiviewProperties.Pointer.Array getVk(){
                return (VkPhysicalDeviceMultiviewProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceMultiviewProperties.Pointer get(int i){
                return new VulkanPhysicalDeviceMultiviewProperties.Pointer(getVk().get(i));
            }
        }
    }
}
