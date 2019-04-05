package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanObjectTableVertexBufferEntryNVX extends VulkanObject {
    public VulkanObjectTableVertexBufferEntryNVX(){
        super(new VkObjectTableVertexBufferEntryNVX());
    }

    public VulkanObjectTableVertexBufferEntryNVX(VkObjectTableVertexBufferEntryNVX vk){
        super(vk);
    }

    @Override
    public VkObjectTableVertexBufferEntryNVX getVk(){
        return (VkObjectTableVertexBufferEntryNVX) super.getVk();
    }

    public VulkanObjectTableVertexBufferEntryNVX(VulkanObjectEntryTypeNVX type, VulkanObjectEntryUsageFlagsNVX flags, VulkanBuffer buffer) {
        super(new VkObjectTableVertexBufferEntryNVX(type.getVk(), flags.getVk(), buffer.getVk()));
    }

    public VulkanObjectEntryTypeNVX getType() {
        return new VulkanObjectEntryTypeNVX(getVk().getType());
    }

    public void setType(VulkanObjectEntryTypeNVX type) {
        getVk().setType(type.getVk());
    }

    public VulkanObjectEntryUsageFlagsNVX getFlags() {
        return new VulkanObjectEntryUsageFlagsNVX(getVk().getFlags());
    }

    public void setFlags(VulkanObjectEntryUsageFlagsNVX flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanBuffer getBuffer() {
        return new VulkanBuffer(getVk().getBuffer());
    }

    public void setBuffer(VulkanBuffer buffer) {
        getVk().setBuffer(buffer.getVk());
    }


    public static class Array extends VulkanObjectTableVertexBufferEntryNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableVertexBufferEntryNVX> {
        public Array(VkObjectTableVertexBufferEntryNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectTableVertexBufferEntryNVX.Array(count));
        }

        public Array(int count, VulkanObjectTableVertexBufferEntryNVX o){
            this(new VkObjectTableVertexBufferEntryNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectTableVertexBufferEntryNVX.Array getVk(){
            return (VkObjectTableVertexBufferEntryNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectTableVertexBufferEntryNVX get(int i){
            return new VulkanObjectTableVertexBufferEntryNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectTableVertexBufferEntryNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectTableVertexBufferEntryNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectTableVertexBufferEntryNVX.Pointer(value));
        }

        @Override
        public VkObjectTableVertexBufferEntryNVX.Pointer getVk(){
            return (VkObjectTableVertexBufferEntryNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectTableVertexBufferEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableVertexBufferEntryNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectTableVertexBufferEntryNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectTableVertexBufferEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectTableVertexBufferEntryNVX.Pointer.Array getVk(){
                return (VkObjectTableVertexBufferEntryNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectTableVertexBufferEntryNVX.Pointer get(int i){
                return new VulkanObjectTableVertexBufferEntryNVX.Pointer(getVk().get(i));
            }
        }
    }
}
