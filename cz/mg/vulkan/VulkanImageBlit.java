package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageBlit.html">khronos documentation</a>
 **/
public class VulkanImageBlit extends VulkanObject {
    public VulkanImageBlit(){
        super(new VkImageBlit());
    }

    public VulkanImageBlit(VkImageBlit vk){
        super(vk);
    }

    @Override
    public VkImageBlit getVk(){
        return (VkImageBlit) super.getVk();
    }

    public VulkanImageBlit(VulkanImageSubresourceLayers srcSubresource, VulkanOffset3D srcOffsets, VulkanImageSubresourceLayers dstSubresource, VulkanOffset3D dstOffsets) {
        super(new VkImageBlit(srcSubresource.getVk(), srcOffsets.getVk(), dstSubresource.getVk(), dstOffsets.getVk()));
    }

    public VulkanImageSubresourceLayers getSrcSubresource() {
        return new VulkanImageSubresourceLayers(getVk().getSrcSubresource());
    }

    public void setSrcSubresource(VulkanImageSubresourceLayers srcSubresource) {
        getVk().setSrcSubresource(srcSubresource.getVk());
    }

    public VulkanOffset3D getSrcOffsets() {
        return new VulkanOffset3D(getVk().getSrcOffsets());
    }

    public void setSrcOffsets(VulkanOffset3D srcOffsets) {
        getVk().setSrcOffsets(srcOffsets.getVk());
    }

    public VulkanImageSubresourceLayers getDstSubresource() {
        return new VulkanImageSubresourceLayers(getVk().getDstSubresource());
    }

    public void setDstSubresource(VulkanImageSubresourceLayers dstSubresource) {
        getVk().setDstSubresource(dstSubresource.getVk());
    }

    public VulkanOffset3D getDstOffsets() {
        return new VulkanOffset3D(getVk().getDstOffsets());
    }

    public void setDstOffsets(VulkanOffset3D dstOffsets) {
        getVk().setDstOffsets(dstOffsets.getVk());
    }


    public static class Array extends VulkanImageBlit implements cz.mg.collections.array.ReadonlyArray<VulkanImageBlit> {
        public Array(VkImageBlit.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageBlit.Array(count));
        }

        public Array(int count, VulkanImageBlit o){
            this(new VkImageBlit.Array(count, o.getVk()));
        }

        @Override
        public VkImageBlit.Array getVk(){
            return (VkImageBlit.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageBlit get(int i){
            return new VulkanImageBlit(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageBlit.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageBlit.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageBlit.Pointer(value));
        }

        @Override
        public VkImageBlit.Pointer getVk(){
            return (VkImageBlit.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageBlit.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageBlit.Pointer> {
            public Array(int count) {
                super(new VkImageBlit.Pointer.Array(count));
            }

            public Array(VulkanImageBlit[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageBlit.Pointer.Array getVk(){
                return (VkImageBlit.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageBlit.Pointer get(int i){
                return new VulkanImageBlit.Pointer(getVk().get(i));
            }
        }
    }
}
