package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanObjectTableIndexBufferEntryNVX extends VulkanObject {
    public VulkanObjectTableIndexBufferEntryNVX(){
        super(new VkObjectTableIndexBufferEntryNVX());
    }

    public VulkanObjectTableIndexBufferEntryNVX(VkObjectTableIndexBufferEntryNVX vk){
        super(vk);
    }

    @Override
    public VkObjectTableIndexBufferEntryNVX getVk(){
        return (VkObjectTableIndexBufferEntryNVX) super.getVk();
    }

    public VulkanObjectTableIndexBufferEntryNVX(VulkanObjectEntryTypeNVX type, VulkanObjectEntryUsageFlagsNVX flags, VulkanBuffer buffer, VulkanIndexType indexType) {
        super(new VkObjectTableIndexBufferEntryNVX(type.getVk(), flags.getVk(), buffer.getVk(), indexType.getVk()));
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

    public VulkanIndexType getIndexType() {
        return new VulkanIndexType(getVk().getIndexType());
    }

    public void setIndexType(VulkanIndexType indexType) {
        getVk().setIndexType(indexType.getVk());
    }


    public static class Array extends VulkanObjectTableIndexBufferEntryNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableIndexBufferEntryNVX> {
        public Array(VkObjectTableIndexBufferEntryNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectTableIndexBufferEntryNVX.Array(count));
        }

        public Array(int count, VulkanObjectTableIndexBufferEntryNVX o){
            this(new VkObjectTableIndexBufferEntryNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectTableIndexBufferEntryNVX.Array getVk(){
            return (VkObjectTableIndexBufferEntryNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectTableIndexBufferEntryNVX get(int i){
            return new VulkanObjectTableIndexBufferEntryNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectTableIndexBufferEntryNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectTableIndexBufferEntryNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectTableIndexBufferEntryNVX.Pointer(value));
        }

        @Override
        public VkObjectTableIndexBufferEntryNVX.Pointer getVk(){
            return (VkObjectTableIndexBufferEntryNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectTableIndexBufferEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableIndexBufferEntryNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectTableIndexBufferEntryNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectTableIndexBufferEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectTableIndexBufferEntryNVX.Pointer.Array getVk(){
                return (VkObjectTableIndexBufferEntryNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectTableIndexBufferEntryNVX.Pointer get(int i){
                return new VulkanObjectTableIndexBufferEntryNVX.Pointer(getVk().get(i));
            }
        }
    }
}
