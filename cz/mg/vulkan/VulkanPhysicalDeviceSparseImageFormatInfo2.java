package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceSparseImageFormatInfo2 extends VulkanObject {
    public VulkanPhysicalDeviceSparseImageFormatInfo2(){
        super(new VkPhysicalDeviceSparseImageFormatInfo2());
    }

    public VulkanPhysicalDeviceSparseImageFormatInfo2(VkPhysicalDeviceSparseImageFormatInfo2 vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2 getVk(){
        return (VkPhysicalDeviceSparseImageFormatInfo2) super.getVk();
    }
    public VulkanPhysicalDeviceSparseImageFormatInfo2(VulkanObject pNext, VulkanFormat format, VulkanImageType type, VulkanSampleCountFlagBits samples, VulkanImageUsageFlags usage, VulkanImageTiling tiling) {
        super(new VkPhysicalDeviceSparseImageFormatInfo2(pNext.getVk(), format.getVk(), type.getVk(), samples.getVk(), usage.getVk(), tiling.getVk()));
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

    public VulkanFormat getFormat() {
        return new VulkanFormat(getVk().getFormat());
    }

    public void setFormat(VulkanFormat format) {
        getVk().setFormat(format.getVk());
    }

    public VulkanImageType getType() {
        return new VulkanImageType(getVk().getType());
    }

    public void setType(VulkanImageType type) {
        getVk().setType(type.getVk());
    }

    public VulkanSampleCountFlagBits getSamples() {
        return new VulkanSampleCountFlagBits(getVk().getSamples());
    }

    public void setSamples(VulkanSampleCountFlagBits samples) {
        getVk().setSamples(samples.getVk());
    }

    public VulkanImageUsageFlags getUsage() {
        return new VulkanImageUsageFlags(getVk().getUsage());
    }

    public void setUsage(VulkanImageUsageFlags usage) {
        getVk().setUsage(usage.getVk());
    }

    public VulkanImageTiling getTiling() {
        return new VulkanImageTiling(getVk().getTiling());
    }

    public void setTiling(VulkanImageTiling tiling) {
        getVk().setTiling(tiling.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceSparseImageFormatInfo2 implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSparseImageFormatInfo2> {
        public Array(VkPhysicalDeviceSparseImageFormatInfo2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceSparseImageFormatInfo2.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceSparseImageFormatInfo2 o){
            this(new VkPhysicalDeviceSparseImageFormatInfo2.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceSparseImageFormatInfo2.Array getVk(){
            return (VkPhysicalDeviceSparseImageFormatInfo2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceSparseImageFormatInfo2 get(int i){
            return new VulkanPhysicalDeviceSparseImageFormatInfo2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceSparseImageFormatInfo2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceSparseImageFormatInfo2.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceSparseImageFormatInfo2.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceSparseImageFormatInfo2.Pointer getVk(){
            return (VkPhysicalDeviceSparseImageFormatInfo2.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceSparseImageFormatInfo2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSparseImageFormatInfo2.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceSparseImageFormatInfo2.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceSparseImageFormatInfo2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceSparseImageFormatInfo2.Pointer.Array getVk(){
                return (VkPhysicalDeviceSparseImageFormatInfo2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceSparseImageFormatInfo2.Pointer get(int i){
                return new VulkanPhysicalDeviceSparseImageFormatInfo2.Pointer(getVk().get(i));
            }
        }
    }
}
