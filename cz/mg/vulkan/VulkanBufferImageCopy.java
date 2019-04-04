package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferImageCopy.html">khronos documentation</a>
 **/
public class VulkanBufferImageCopy extends VulkanObject {
    public VulkanBufferImageCopy(){
        super(new VkBufferImageCopy());
    }

    public VulkanBufferImageCopy(VkBufferImageCopy vk){
        super(vk);
    }

    @Override
    public VkBufferImageCopy getVk(){
        return (VkBufferImageCopy) super.getVk();
    }

    public VulkanBufferImageCopy(VulkanDeviceSize bufferOffset, VulkanUInt32 bufferRowLength, VulkanUInt32 bufferImageHeight, VulkanImageSubresourceLayers imageSubresource, VulkanOffset3D imageOffset, VulkanExtent3D imageExtent) {
        super(new VkBufferImageCopy(bufferOffset.getVk(), bufferRowLength.getVk(), bufferImageHeight.getVk(), imageSubresource.getVk(), imageOffset.getVk(), imageExtent.getVk()));
    }

    public VulkanDeviceSize getBufferOffset() {
        return new VulkanDeviceSize(getVk().getBufferOffset());
    }

    public void setBufferOffset(VulkanDeviceSize bufferOffset) {
        getVk().setBufferOffset(bufferOffset.getVk());
    }

    public VulkanUInt32 getBufferRowLength() {
        return new VulkanUInt32(getVk().getBufferRowLength());
    }

    public void setBufferRowLength(VulkanUInt32 bufferRowLength) {
        getVk().setBufferRowLength(bufferRowLength.getVk());
    }

    public VulkanUInt32 getBufferImageHeight() {
        return new VulkanUInt32(getVk().getBufferImageHeight());
    }

    public void setBufferImageHeight(VulkanUInt32 bufferImageHeight) {
        getVk().setBufferImageHeight(bufferImageHeight.getVk());
    }

    public VulkanImageSubresourceLayers getImageSubresource() {
        return new VulkanImageSubresourceLayers(getVk().getImageSubresource());
    }

    public void setImageSubresource(VulkanImageSubresourceLayers imageSubresource) {
        getVk().setImageSubresource(imageSubresource.getVk());
    }

    public VulkanOffset3D getImageOffset() {
        return new VulkanOffset3D(getVk().getImageOffset());
    }

    public void setImageOffset(VulkanOffset3D imageOffset) {
        getVk().setImageOffset(imageOffset.getVk());
    }

    public VulkanExtent3D getImageExtent() {
        return new VulkanExtent3D(getVk().getImageExtent());
    }

    public void setImageExtent(VulkanExtent3D imageExtent) {
        getVk().setImageExtent(imageExtent.getVk());
    }


    public static class Array extends VulkanBufferImageCopy implements cz.mg.collections.array.ReadonlyArray<VulkanBufferImageCopy> {
        public Array(VkBufferImageCopy.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferImageCopy.Array(count));
        }

        public Array(int count, VulkanBufferImageCopy o){
            this(new VkBufferImageCopy.Array(count, o.getVk()));
        }

        @Override
        public VkBufferImageCopy.Array getVk(){
            return (VkBufferImageCopy.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferImageCopy get(int i){
            return new VulkanBufferImageCopy(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferImageCopy.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferImageCopy.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferImageCopy.Pointer(value));
        }

        @Override
        public VkBufferImageCopy.Pointer getVk(){
            return (VkBufferImageCopy.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferImageCopy.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferImageCopy.Pointer> {
            public Array(int count) {
                super(new VkBufferImageCopy.Pointer.Array(count));
            }

            public Array(VulkanBufferImageCopy[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferImageCopy.Pointer.Array getVk(){
                return (VkBufferImageCopy.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferImageCopy.Pointer get(int i){
                return new VulkanBufferImageCopy.Pointer(getVk().get(i));
            }
        }
    }
}
