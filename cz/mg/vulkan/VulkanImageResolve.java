package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageResolve extends VulkanObject {
    public VulkanImageResolve(){
        super(new VkImageResolve());
    }

    public VulkanImageResolve(VkImageResolve vk){
        super(vk);
    }

    @Override
    public VkImageResolve getVk(){
        return (VkImageResolve) super.getVk();
    }

    public VulkanImageResolve(VulkanImageSubresourceLayers srcSubresource, VulkanOffset3D srcOffset, VulkanImageSubresourceLayers dstSubresource, VulkanOffset3D dstOffset, VulkanExtent3D extent) {
        super(new VkImageResolve(srcSubresource.getVk(), srcOffset.getVk(), dstSubresource.getVk(), dstOffset.getVk(), extent.getVk()));
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


    public static class Array extends VulkanImageResolve implements cz.mg.collections.array.ReadonlyArray<VulkanImageResolve> {
        public Array(VkImageResolve.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageResolve.Array(count));
        }

        public Array(int count, VulkanImageResolve o){
            this(new VkImageResolve.Array(count, o.getVk()));
        }

        @Override
        public VkImageResolve.Array getVk(){
            return (VkImageResolve.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageResolve get(int i){
            return new VulkanImageResolve(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageResolve.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageResolve.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageResolve.Pointer(value));
        }

        @Override
        public VkImageResolve.Pointer getVk(){
            return (VkImageResolve.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageResolve.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageResolve.Pointer> {
            public Array(int count) {
                super(new VkImageResolve.Pointer.Array(count));
            }

            public Array(VulkanImageResolve[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageResolve.Pointer.Array getVk(){
                return (VkImageResolve.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageResolve.Pointer get(int i){
                return new VulkanImageResolve.Pointer(getVk().get(i));
            }
        }
    }
}
