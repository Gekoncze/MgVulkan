package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageMemoryBind.html">khronos documentation</a>
 **/
public class VulkanSparseImageMemoryBind extends VulkanObject {
    public VulkanSparseImageMemoryBind(){
        super(new VkSparseImageMemoryBind());
    }

    public VulkanSparseImageMemoryBind(VkSparseImageMemoryBind vk){
        super(vk);
    }

    @Override
    public VkSparseImageMemoryBind getVk(){
        return (VkSparseImageMemoryBind) super.getVk();
    }

    public VulkanSparseImageMemoryBind(VulkanImageSubresource subresource, VulkanOffset3D offset, VulkanExtent3D extent, VulkanDeviceMemory memory, VulkanDeviceSize memoryOffset, VulkanSparseMemoryBindFlags flags) {
        super(new VkSparseImageMemoryBind(subresource.getVk(), offset.getVk(), extent.getVk(), memory.getVk(), memoryOffset.getVk(), flags.getVk()));
    }

    public VulkanImageSubresource getSubresource() {
        return new VulkanImageSubresource(getVk().getSubresource());
    }

    public void setSubresource(VulkanImageSubresource subresource) {
        getVk().setSubresource(subresource.getVk());
    }

    public VulkanOffset3D getOffset() {
        return new VulkanOffset3D(getVk().getOffset());
    }

    public void setOffset(VulkanOffset3D offset) {
        getVk().setOffset(offset.getVk());
    }

    public VulkanExtent3D getExtent() {
        return new VulkanExtent3D(getVk().getExtent());
    }

    public void setExtent(VulkanExtent3D extent) {
        getVk().setExtent(extent.getVk());
    }

    public VulkanDeviceMemory getMemory() {
        return new VulkanDeviceMemory(getVk().getMemory());
    }

    public void setMemory(VulkanDeviceMemory memory) {
        getVk().setMemory(memory.getVk());
    }

    public VulkanDeviceSize getMemoryOffset() {
        return new VulkanDeviceSize(getVk().getMemoryOffset());
    }

    public void setMemoryOffset(VulkanDeviceSize memoryOffset) {
        getVk().setMemoryOffset(memoryOffset.getVk());
    }

    public VulkanSparseMemoryBindFlags getFlags() {
        return new VulkanSparseMemoryBindFlags(getVk().getFlags());
    }

    public void setFlags(VulkanSparseMemoryBindFlags flags) {
        getVk().setFlags(flags.getVk());
    }


    public static class Array extends VulkanSparseImageMemoryBind implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageMemoryBind> {
        public Array(VkSparseImageMemoryBind.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseImageMemoryBind.Array(count));
        }

        public Array(int count, VulkanSparseImageMemoryBind o){
            this(new VkSparseImageMemoryBind.Array(count, o.getVk()));
        }

        @Override
        public VkSparseImageMemoryBind.Array getVk(){
            return (VkSparseImageMemoryBind.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseImageMemoryBind get(int i){
            return new VulkanSparseImageMemoryBind(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseImageMemoryBind.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseImageMemoryBind.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseImageMemoryBind.Pointer(value));
        }

        @Override
        public VkSparseImageMemoryBind.Pointer getVk(){
            return (VkSparseImageMemoryBind.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseImageMemoryBind.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageMemoryBind.Pointer> {
            public Array(int count) {
                super(new VkSparseImageMemoryBind.Pointer.Array(count));
            }

            public Array(VulkanSparseImageMemoryBind[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseImageMemoryBind.Pointer.Array getVk(){
                return (VkSparseImageMemoryBind.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseImageMemoryBind.Pointer get(int i){
                return new VulkanSparseImageMemoryBind.Pointer(getVk().get(i));
            }
        }
    }
}
