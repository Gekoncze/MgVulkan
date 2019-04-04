package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageMemoryRequirements.html">khronos documentation</a>
 **/
public class VulkanSparseImageMemoryRequirements extends VulkanObject {
    public VulkanSparseImageMemoryRequirements(){
        super(new VkSparseImageMemoryRequirements());
    }

    public VulkanSparseImageMemoryRequirements(VkSparseImageMemoryRequirements vk){
        super(vk);
    }

    @Override
    public VkSparseImageMemoryRequirements getVk(){
        return (VkSparseImageMemoryRequirements) super.getVk();
    }

    public VulkanSparseImageMemoryRequirements(VulkanSparseImageFormatProperties formatProperties, VulkanUInt32 imageMipTailFirstLod, VulkanDeviceSize imageMipTailSize, VulkanDeviceSize imageMipTailOffset, VulkanDeviceSize imageMipTailStride) {
        super(new VkSparseImageMemoryRequirements(formatProperties.getVk(), imageMipTailFirstLod.getVk(), imageMipTailSize.getVk(), imageMipTailOffset.getVk(), imageMipTailStride.getVk()));
    }

    public VulkanSparseImageFormatProperties getFormatProperties() {
        return new VulkanSparseImageFormatProperties(getVk().getFormatProperties());
    }

    public void setFormatProperties(VulkanSparseImageFormatProperties formatProperties) {
        getVk().setFormatProperties(formatProperties.getVk());
    }

    public VulkanUInt32 getImageMipTailFirstLod() {
        return new VulkanUInt32(getVk().getImageMipTailFirstLod());
    }

    public void setImageMipTailFirstLod(VulkanUInt32 imageMipTailFirstLod) {
        getVk().setImageMipTailFirstLod(imageMipTailFirstLod.getVk());
    }

    public VulkanDeviceSize getImageMipTailSize() {
        return new VulkanDeviceSize(getVk().getImageMipTailSize());
    }

    public void setImageMipTailSize(VulkanDeviceSize imageMipTailSize) {
        getVk().setImageMipTailSize(imageMipTailSize.getVk());
    }

    public VulkanDeviceSize getImageMipTailOffset() {
        return new VulkanDeviceSize(getVk().getImageMipTailOffset());
    }

    public void setImageMipTailOffset(VulkanDeviceSize imageMipTailOffset) {
        getVk().setImageMipTailOffset(imageMipTailOffset.getVk());
    }

    public VulkanDeviceSize getImageMipTailStride() {
        return new VulkanDeviceSize(getVk().getImageMipTailStride());
    }

    public void setImageMipTailStride(VulkanDeviceSize imageMipTailStride) {
        getVk().setImageMipTailStride(imageMipTailStride.getVk());
    }


    public static class Array extends VulkanSparseImageMemoryRequirements implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageMemoryRequirements> {
        public Array(VkSparseImageMemoryRequirements.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseImageMemoryRequirements.Array(count));
        }

        public Array(int count, VulkanSparseImageMemoryRequirements o){
            this(new VkSparseImageMemoryRequirements.Array(count, o.getVk()));
        }

        @Override
        public VkSparseImageMemoryRequirements.Array getVk(){
            return (VkSparseImageMemoryRequirements.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseImageMemoryRequirements get(int i){
            return new VulkanSparseImageMemoryRequirements(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseImageMemoryRequirements.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseImageMemoryRequirements.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseImageMemoryRequirements.Pointer(value));
        }

        @Override
        public VkSparseImageMemoryRequirements.Pointer getVk(){
            return (VkSparseImageMemoryRequirements.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseImageMemoryRequirements.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageMemoryRequirements.Pointer> {
            public Array(int count) {
                super(new VkSparseImageMemoryRequirements.Pointer.Array(count));
            }

            public Array(VulkanSparseImageMemoryRequirements[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseImageMemoryRequirements.Pointer.Array getVk(){
                return (VkSparseImageMemoryRequirements.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseImageMemoryRequirements.Pointer get(int i){
                return new VulkanSparseImageMemoryRequirements.Pointer(getVk().get(i));
            }
        }
    }
}
