package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSamplerYcbcrConversionImageFormatProperties extends VulkanObject {
    public VulkanSamplerYcbcrConversionImageFormatProperties(){
        super(new VkSamplerYcbcrConversionImageFormatProperties());
    }

    public VulkanSamplerYcbcrConversionImageFormatProperties(VkSamplerYcbcrConversionImageFormatProperties vk){
        super(vk);
    }

    @Override
    public VkSamplerYcbcrConversionImageFormatProperties getVk(){
        return (VkSamplerYcbcrConversionImageFormatProperties) super.getVk();
    }

    public VulkanSamplerYcbcrConversionImageFormatProperties(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 combinedImageSamplerDescriptorCount) {
        super(new VkSamplerYcbcrConversionImageFormatProperties(sType.getVk(), pNext.getVk(), combinedImageSamplerDescriptorCount.getVk()));
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

    public VulkanUInt32 getCombinedImageSamplerDescriptorCount() {
        return new VulkanUInt32(getVk().getCombinedImageSamplerDescriptorCount());
    }

    public void setCombinedImageSamplerDescriptorCount(VulkanUInt32 combinedImageSamplerDescriptorCount) {
        getVk().setCombinedImageSamplerDescriptorCount(combinedImageSamplerDescriptorCount.getVk());
    }


    public static class Array extends VulkanSamplerYcbcrConversionImageFormatProperties implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrConversionImageFormatProperties> {
        public Array(VkSamplerYcbcrConversionImageFormatProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSamplerYcbcrConversionImageFormatProperties.Array(count));
        }

        public Array(int count, VulkanSamplerYcbcrConversionImageFormatProperties o){
            this(new VkSamplerYcbcrConversionImageFormatProperties.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerYcbcrConversionImageFormatProperties.Array getVk(){
            return (VkSamplerYcbcrConversionImageFormatProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerYcbcrConversionImageFormatProperties get(int i){
            return new VulkanSamplerYcbcrConversionImageFormatProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSamplerYcbcrConversionImageFormatProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSamplerYcbcrConversionImageFormatProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkSamplerYcbcrConversionImageFormatProperties.Pointer(value));
        }

        @Override
        public VkSamplerYcbcrConversionImageFormatProperties.Pointer getVk(){
            return (VkSamplerYcbcrConversionImageFormatProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanSamplerYcbcrConversionImageFormatProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrConversionImageFormatProperties.Pointer> {
            public Array(int count) {
                super(new VkSamplerYcbcrConversionImageFormatProperties.Pointer.Array(count));
            }

            public Array(VulkanSamplerYcbcrConversionImageFormatProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSamplerYcbcrConversionImageFormatProperties.Pointer.Array getVk(){
                return (VkSamplerYcbcrConversionImageFormatProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSamplerYcbcrConversionImageFormatProperties.Pointer get(int i){
                return new VulkanSamplerYcbcrConversionImageFormatProperties.Pointer(getVk().get(i));
            }
        }
    }
}
