package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceImageFormatInfo2 extends VulkanObject {
    public VulkanPhysicalDeviceImageFormatInfo2(){
        super(new VkPhysicalDeviceImageFormatInfo2());
    }

    public VulkanPhysicalDeviceImageFormatInfo2(VkPhysicalDeviceImageFormatInfo2 vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceImageFormatInfo2 getVk(){
        return (VkPhysicalDeviceImageFormatInfo2) super.getVk();
    }
    public VulkanPhysicalDeviceImageFormatInfo2(VulkanObject pNext, VulkanFormat format, VulkanImageType type, VulkanImageTiling tiling, VulkanImageUsageFlags usage, VulkanImageCreateFlags flags) {
        super(new VkPhysicalDeviceImageFormatInfo2(pNext.getVk(), format.getVk(), type.getVk(), tiling.getVk(), usage.getVk(), flags.getVk()));
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

    public VulkanImageTiling getTiling() {
        return new VulkanImageTiling(getVk().getTiling());
    }

    public void setTiling(VulkanImageTiling tiling) {
        getVk().setTiling(tiling.getVk());
    }

    public VulkanImageUsageFlags getUsage() {
        return new VulkanImageUsageFlags(getVk().getUsage());
    }

    public void setUsage(VulkanImageUsageFlags usage) {
        getVk().setUsage(usage.getVk());
    }

    public VulkanImageCreateFlags getFlags() {
        return new VulkanImageCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanImageCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceImageFormatInfo2 implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceImageFormatInfo2> {
        public Array(VkPhysicalDeviceImageFormatInfo2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceImageFormatInfo2.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceImageFormatInfo2 o){
            this(new VkPhysicalDeviceImageFormatInfo2.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceImageFormatInfo2.Array getVk(){
            return (VkPhysicalDeviceImageFormatInfo2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceImageFormatInfo2 get(int i){
            return new VulkanPhysicalDeviceImageFormatInfo2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceImageFormatInfo2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceImageFormatInfo2.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceImageFormatInfo2.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceImageFormatInfo2.Pointer getVk(){
            return (VkPhysicalDeviceImageFormatInfo2.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceImageFormatInfo2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceImageFormatInfo2.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceImageFormatInfo2.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceImageFormatInfo2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceImageFormatInfo2.Pointer.Array getVk(){
                return (VkPhysicalDeviceImageFormatInfo2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceImageFormatInfo2.Pointer get(int i){
                return new VulkanPhysicalDeviceImageFormatInfo2.Pointer(getVk().get(i));
            }
        }
    }
}
