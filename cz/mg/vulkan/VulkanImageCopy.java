package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageCopy.html">khronos documentation</a>
 **/
public class VulkanImageCopy extends VulkanObject {
    public VulkanImageCopy(){
        super(new VkImageCopy());
    }

    public VulkanImageCopy(VkImageCopy vk){
        super(vk);
    }

    @Override
    public VkImageCopy getVk(){
        return (VkImageCopy) super.getVk();
    }

    public VulkanImageCopy(VulkanImageSubresourceLayers srcSubresource, VulkanOffset3D srcOffset, VulkanImageSubresourceLayers dstSubresource, VulkanOffset3D dstOffset, VulkanExtent3D extent) {
        super(new VkImageCopy(srcSubresource.getVk(), srcOffset.getVk(), dstSubresource.getVk(), dstOffset.getVk(), extent.getVk()));
    }

    public VulkanImageSubresourceLayers getSrcSubresource() {
        return new VulkanImageSubresourceLayers(getVk().getSrcSubresource());
    }

    public void setSrcSubresource(VulkanImageSubresourceLayers srcSubresource) {
        getVk().setSrcSubresource(srcSubresource.getVk());
    }

    public VulkanOffset3D getSrcOffset() {
        return new VulkanOffset3D(getVk().getSrcOffset());
    }

    public void setSrcOffset(VulkanOffset3D srcOffset) {
        getVk().setSrcOffset(srcOffset.getVk());
    }

    public VulkanImageSubresourceLayers getDstSubresource() {
        return new VulkanImageSubresourceLayers(getVk().getDstSubresource());
    }

    public void setDstSubresource(VulkanImageSubresourceLayers dstSubresource) {
        getVk().setDstSubresource(dstSubresource.getVk());
    }

    public VulkanOffset3D getDstOffset() {
        return new VulkanOffset3D(getVk().getDstOffset());
    }

    public void setDstOffset(VulkanOffset3D dstOffset) {
        getVk().setDstOffset(dstOffset.getVk());
    }

    public VulkanExtent3D getExtent() {
        return new VulkanExtent3D(getVk().getExtent());
    }

    public void setExtent(VulkanExtent3D extent) {
        getVk().setExtent(extent.getVk());
    }


    public static class Array extends VulkanImageCopy implements cz.mg.collections.array.ReadonlyArray<VulkanImageCopy> {
        public Array(VkImageCopy.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageCopy.Array(count));
        }

        public Array(int count, VulkanImageCopy o){
            this(new VkImageCopy.Array(count, o.getVk()));
        }

        @Override
        public VkImageCopy.Array getVk(){
            return (VkImageCopy.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageCopy get(int i){
            return new VulkanImageCopy(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageCopy.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageCopy.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageCopy.Pointer(value));
        }

        @Override
        public VkImageCopy.Pointer getVk(){
            return (VkImageCopy.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageCopy.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageCopy.Pointer> {
            public Array(int count) {
                super(new VkImageCopy.Pointer.Array(count));
            }

            public Array(VulkanImageCopy[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageCopy.Pointer.Array getVk(){
                return (VkImageCopy.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageCopy.Pointer get(int i){
                return new VulkanImageCopy.Pointer(getVk().get(i));
            }
        }
    }
}
